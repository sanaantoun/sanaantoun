<?php
    include_once 'header.php';
    ?>
<body>
    
    
     <!--this is the beginning of Login email/password section-->
        <div class="P41">
            <!--shop image logo-->
            <div class="image1">
            <img src="https://1757140519.rsc.cdn77.org/blog/wp-content/uploads/2019/02/0082_h_green-food-logo.png" width="350px">
            </div>
            <br>
            <h3>Enter your details to create your account</h3>
            <!--form to take the input from the user-->
            <form class="P42" action="includes/signup.inc.php" method="post">

            <label for="firstname" class="form-label mb-0"><b>First name:</b></label>
            <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter first name">

            <label for="lastname" class="form-label mb-0"><b>Last name:</b></label>
            <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter last name">

            <label for="address" class="form-label mb-0"><b>Address:</b></label>
            <input type="text" class="form-control" id="address" name="address" placeholder="Enter address">

            <label for="city" class="form-label mb-0"><b>City:</b></label>
            <input type="text" class="form-control" id="city" name="city" placeholder="Enter city">

            <label for="state" class="form-label mb-0"><b>State/province:</b></label>
            <input type="text" class="form-control" id="state" name="state" placeholder="Enter state/province">

            <label for="postalcode" class="form-label mb-0"><b>Postal code:</b></label>
            <input type="text" class="form-control" id="postalcode" name="postalcode" placeholder="Enter postal code">

            <label for="email" class="form-label mb-0"><b>Email:</b></label>
            <input type="email"  class="form-control" id="email" name="email" placeholder="Enter email address">

            <label for="pwd" class="form-label mb-0"><b>Password (8-12 character):</b></label>
            <input type="password" class="form-control" id="pwd" name="password" placeholder="Enter password">

            <label for="cpwd" class="form-label mb-0"><b>Confirm Password:</b></label>
            <input type="password" class="form-control" id="cpwd" name="password2" placeholder="Enter password">
            
            <!--creating buttons for submit/forgot password-->    
            <div class="d-grid gap-3">
                <input type="submit" class="btn btn-primary btn-block" name="submit" value="Submit">
                <input type="reset" class="btn btn-danger btn-block" name="P4" value="Reset">
            </div>
            

            </form>
            <h6>"Already have an account?" <a class="clickhere" href="../A1_grocerystorePART5.html"> Click here to login</a></h6>
        </div>
    
        <?php
        if (isset($_GET["error"])) {
            if ($_GET["error"] == "emptyinput") {
                echo "<p>Fill in all fields!</p>";
            }
            if ($_GET["error"] == "invalidemail") {
                echo "<p>Invalid email!</p>";
            }
            if ($_GET["error"] == "invalidpassword") {
                echo "<p>Passwords don't match!</p>";
            }
            if ($_GET["error"] == "usertaken") {
                echo "<p>Choose another email!</p>";
            }
            if ($_GET["error"] == "stmtfailed") {
                echo "<p>Something went wrong!</p>";
            }
            
        }
        ?>
    
    <!--this is the end of the sign up email/password section-->

    
</body>  
</html>