<div class="footer">
        <ul class="footernavul">
            <li class="footmenu"><b>Menu</b></li>
            <li><a href="index.php">Home</a></li>
            <li><a href="aisles.php">Aisles</a></li>
            <li><a href="weeklyflyer.php">Flyer</a></li>
            <li><a href="contact.php">Contact</a></li>
        </ul>
        <ul class="footerlogin">
            <li class="footmenuuser"><b>User</b></li>
            <?php
                if(isset($_SESSION["userid"])){
                    echo '<li><a href="" onclick="alert("Coming soon")">Profile</a></li>';
                    echo '<li><a>Welcome ' . $_SESSION["usernname"] . '</a></li>';
                    echo '<li><a href="logout.php">Logout</a></li>';
                    if($_SESSION["admin"] === 1)
                    {
                        echo '<li><a href="assignment1_p7.html">Admin Panel</a></li>';
                    }
                }
                else
                {
                    echo '<li><a href="login.php">Login</a></li>';
                    echo '<li><a href="signup.php">Sign up</a></li>';
                }
            ?>
        </ul>
    </div>