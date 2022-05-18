<!DOCTYPE html">
<html lang = "en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="headerstyle.css"/>
    <link rel="stylesheet" type="text/css" href="navbarstyle.css"/>
    <link rel="stylesheet" type="text/css" href="welcomemessstyle.css"/>
    <link rel="stylesheet" type="text/css" href="homepagestyle.css"/>
    <link rel="stylesheet" type="text/css" href="meatsstyle.css"/>
    <link rel="stylesheet" type="text/css" href="footer.css"/>
    <link rel="stylesheet" type="text/css" href="aislesstyle.css"/>
    <link rel="stylesheet" type="text/css" href="meatstyle.css"/>
    <link rel="stylesheet" type="text/css" href="fruitsandveggiesstyle.css"/>
    <link rel="stylesheet" type="text/css" href="contactsyle.css"/>
    <link rel="stylesheet" type="text/css" href="charcuteriestyle.css"/>
    <link rel="stylesheet" type="text/css" href="bakerystyle.css"/>
    <link rel="stylesheet" type="text/css" href="weeklyflyerstyle.css"/>
    <link rel="stylesheet" href="login.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title> 
        AYCE - Online Grocery Store
    </title>
</head>

<?php
session_start();
?>


<div class="headerbar">

    <div class="search">
        <input type="text" placeholder="Search...">
    </div>
    <div class="logo">
        <a href="index.php">AYCE</a>
    </div>
    <button class="cart">
        <a href="cart.html"><img src="/Images/shopping cart.jpeg"/></a>
    </button>
    
</div>

<div class="navbarr">
    <nav>
        <ul>
            <li class="menbarr" style="padding-left: 0px;"><a href="index.php">Home</a></li>
            <li class="menbarr"><a href="aisles.php">
                    Aisles
                <ul>
                    <li class="dropdown"><a href="meat.php">Meat</a></li>
                    <li class="dropdown"><a href="fruitsandveggies.php">Fruits & Vegetables</a></li>
                    <li class="dropdown"><a href="charcuterie.php">Charcuterie</a></li>
                    <li class="dropdown"><a href="cheese.php">Cheese</a></li>
                    <li class="dropdown"><a href="bakery.php">Bakery</a></li>
                    <li class="dropdown"><a href="meat.php">Fish & Seafood</a></li>
                </ul>
            </a></li>
            <li class="menbarr"><a href="weeklyflyer.php">Flyer</a></li>
            <li class="menbarr"><a href="contact.php">Contact</a></li>
        </ul>
    </nav>
</div>
