<?php

$serverName = "localhost";
$dBUsername = "root";
$dBPassword = "alo123";
$dBName = "phpwebgrocery";

$conn = mysqli_connect($serverName, $dBUsername, $dBPassword, $dBName);

if (!$conn) {
    die("Connection failed: " . mysqli_connect_err());
}

