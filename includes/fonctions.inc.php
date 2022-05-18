<?php

function emptyInputSignup($firstName, $lastName, $address, $city, $state, $postalCode, $email, $password, $passwordRepeat){
    $result;
    if (empty($lastName) || empty($firstName) || empty($address) || empty($city) || empty($state) || empty($postalCode) || empty($email) || empty($password) || empty($passwordRepeat)){
        $result = true; 
    }
    else {
        $result = false;
    }
    return $result;
}

function invalidName($firstName, $lastName){
    $result;
    if (!preg_match("/^[a-zA-Z-' ]*$/",$firstName) || !preg_match("/^[a-zA-Z-' ]*$/",$lastName)) {
        $result = true; 
    }
    else {
        $result = false;
    }
    return $result;
}

function invalidEmail($email){
    $result;
    if (!filter_var($email, FILTER_VALIDATE_EMAIL)){
        $result = true; 
    }
    else {
        $result = false;
    }
    return $result;
}

function pwdMatch($password, $passwordRepeat){
    $result;
    if ($password !== $passwordRepeat){
        $result = true; 
    }
    else {
        $result = false;
    }
    return $result;
}

function emailExist($email, $conn){
    $sql = "SELECT * FROM users WHERE usersEmail = ?;";
    $stmt = mysqli_stmt_init($conn);
    if (!mysqli_stmt_prepare($stmt, $sql)){
        header("location: ../signup.php?error=stmtfailed");
        exit();
    }
    mysqli_stmt_bind_param($stmt, "s", $email);
    mysqli_stmt_execute($stmt);

    $resultData = mysqli_stmt_get_result($stmt);

    if($row = mysqli_fetch_assoc($resultData)){
        return $row;
    }
    else
    {
        $result = false;
        return $result;
    }
}

function createUser($conn, $lastName, $firstName, $address, $city, $state, $postalCode, $email, $password){
    $sql = "INSERT INTO users (usersFName, usersLName, usersAddress, usersCity, usersState, usersPostal, usersEmail, usersPwd, usersAdmin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    $stmt = mysqli_stmt_init($conn);
    if (!mysqli_stmt_prepare($stmt, $sql)){
        header("location: ../signup.php?error=stmtfailed");
        exit();
    }

    $hashedPwd = password_hash($password, PASSWORD_DEFAULT);

    $admin = 0;
    mysqli_stmt_bind_param($stmt, "sssssssss", $firstName, $lastName, $address, $city, $state, $postalCode, $email, $hashedPwd, $admin);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_close($stmt);
    header("location: ../signup.php?error=none");
    exit();

}

function createUser2($conn, $lastName1, $firstName1, $address1, $city1, $state1, $postalCode1, $email1, $password1){
    $sql = "INSERT INTO users (usersFName, usersLName, usersAddress, usersCity, usersState, usersPostal, usersEmail, usersPwd, usersAdmin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    $stmt = mysqli_stmt_init($conn);
    if (!mysqli_stmt_prepare($stmt, $sql)){
        header("location: ../adduser.php?error=stmtfailed");
        exit();
    }

    $hashedPwd1 = password_hash($password1, PASSWORD_DEFAULT);

    $admin = 0;
    mysqli_stmt_bind_param($stmt, "sssssssss", $firstName1, $lastName1, $address1, $city1, $state1, $postalCode1, $email1, $hashedPwd1, $admin);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_close($stmt);
    header("location: ../adduser.php?error=none");
    exit();

}

function emptyInputLogin($email, $password){
    $result;
    if (empty($email) || empty($password)){
        $result = true; 
    }
    else {
        $result = false;
    }
    return $result;
}

function loginUser($conn, $email, $password){
    $emailExist = emailExist($email, $conn);

    if ($emailExist === false) {
        header("location: ../login.php?error=wronglogin");
        exit();
    }

    $pwdHashed = $emailExist["usersPwd"];
    $checkPwd = password_verify($password, $pwdHashed);

    if ($checkPwd === false){
        header("location: ../login.php?error=wronglogin");
        exit();
    }
    else if ($checkPwd === true){
        session_start();
        $_SESSION["userid"] = $emailExist["usersId"];
        $_SESSION["usernname"] = $emailExist["usersFName"];
        $_SESSION["admin"] = $emailExist["usersAdmin"];

        if ($_SESSION["admin"] == 1)
        {
            header("location: ../assignment1_p7.html")
        }
        else{
            header("location: ../index.php");
        }
        
        exit();
    }


}

