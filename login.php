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
            <h3 class="title1">Enter your details to Login</h3>
            <!--form to take the input from the user-->
            <form class="P42" action="includes/login.inc.php" method="post">
            <label for="email"><b>Email:</b></label>
            <input type="text" name="email" value="" placeholder="Enter email address">
                
            <label for="password"><b>Password:</b></label>
            <input type="password" name="password" value="" placeholder="Enter password">
             
            <!--creating buttons for submit/forgot password-->    
            <input type="submit" class="button" name="submit" value="Submit">
                
            <br>   
                
            
            </form>
         
            </div>

    <!--this is the end of the sign up email/password section-->

    
</body>  
</html>