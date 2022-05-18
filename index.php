<?php
    include_once 'header.php';
    ?>
<div class="homepage">

    <div class="welcmess">
        <p>
            <h3>AYCE's Online Grocery Store</h3>
        </p>
    </div>

    <p class="popularitems">
        Popular this week
    </p>

    <table class="popitemslist">
        <tr class="tabletext">
            <td><a href="ribeyesteak.html">Ribeye Steak</a></td>
            <td><a href="redapple.html">Red Apples</a></td>
            <td style="border-right: 0px;"><a href="cheesecake.html">Cheesecake</a></td>
        </tr>
        <tr class="tableimages">
            <td><a href="ribeyesteak.html"><img src="/Images/ribeye steak.jpeg"/></a></td>
            <td><a href="redapple.html"><img src="/Images/apple.webp"/></a></td>
            <td style="border-right: 0px;"><a href="cheesecake.html"><img src="/Images/cheesecake.jpeg"/></a></td>
        </tr>
        <tr class="pricetext">
            <td class="price"><b>$22.99/lbs</b></td>
            <td class="price"><b>$0.69/each</b></td>
            <td class="price" style="border-right: 0px;"><b>$18.99/each</b></td>
        </tr>
        <tr>
            <td>
                <a href="ribeyesteak.html"><button class="viewmorebutton">View Product</button></a>
                <button class="addtocartbutton">Add to Cart</button>
            </td>
            <td>
                <a href="redapple.html"><button class="viewmorebutton">View Product</button></a>
                <button class="addtocartbutton">Add to Cart</button>
            </td>
            <td style="border-right: none;">
                <a href="cheesecake.html"><button class="viewmorebutton">View Product</button></a>
                <button class="addtocartbutton">Add to Cart</button>
            </td>
        </tr>
    </table>

    <br/><br/>

    <div class="visitaisles">
        <p>
           <a href="aisles.php"><b>VISIT OUR AISLES</b><button class="gobutton"> >> </button></a>
        </p>
    </div>

    <br/><br/>

    <div class="viewflyer">
        <p>
           <a href="weeklyflyer.php"><b>VIEW THIS WEEK'S FLYER</b><button class="gobutton"> >> </button></a>
        </p>
    </div>

    <br/><br/>

    <div class="contactus">
        <p>
           <a href="contact.php"><b>CONTACT US FOR SUPPORT</b><button class="gobutton"> >> </button></a>
        </p>
    </div>

    <br/><br/>

    
    <?php
    include_once 'footer.php';
    ?>

</div>

</body>

</html>