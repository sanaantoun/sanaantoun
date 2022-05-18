<?php

if(isset($_POST["submit"])){
    echo "it works";
    $firstName = $_POST["firstname"];
    $lastName = $_POST["lastname"];
    $address = $_POST["address"];
    $city = $_POST["city"];
    $state = $_POST["state"];
    $postalCode = $_POST["postalcode"];
    $email = $_POST["email"];
    $password = $_POST["password"];
    $passwordRepeat = $_POST["password2"];

    require_once 'dbh.inc.php';
    require_once 'fonctions.inc.php';

    if (emptyInputSignup($firstName, $lastName, $address, $city, $state, $postalCode, $email, $password, $passwordRepeat) !== false) {
        header("location: ../signup.php?error=emptyinput");
        exit();
    }
    if (invalidName($firstName, $lastName) !== false) {
        header("location: ../signup.php?error=invalidname");
        exit();
    }
    if (invalidEmail($email) !== false) {
        header("location: ../signup.php?error=invalidemail");
        exit();
    }
    if (pwdMatch($password, $passwordRepeat) !== false) {
        header("location: ../signup.php?error=invalidpassword");
        exit();
    }
    if (emailExist($email, $conn) !== false) {
        header("location: ../signup.php?error=usertaken");
        exit();
    }
    
    createUser($conn, $lastName, $firstName, $address, $city, $state, $postalCode, $email, $password);

    
}
else
{
    header("location: ../signup.php");
}