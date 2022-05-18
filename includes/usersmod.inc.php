<?php
    if(isset($_POST["submit"])){

    $firstName1 = $_POST["usersFName"];
    $lastName1 = $_POST["usersLName"];
    $address1 = $_POST["usersAddress"];
    $city1 = $_POST["usersCity"];
    $state1 = $_POST["usersState"];
    $postalCode1 = $_POST["usersPostal"];
    $email1 = $_POST["usersEmail"];
    $password1 = $_POST["usersPwd"];

    require_once 'dbh.inc.php';
    require_once 'fonctions.inc.php';

    if (invalidEmail($email1) !== false) {
        header("location: ../adduser.php?error=invalidemail");
        exit();
    }

    createUser2($conn, $lastName1, $firstName1, $address1, $city1, $state1, $postalCode1, $email1, $password1);
    }
?>