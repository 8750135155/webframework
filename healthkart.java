<!DOCTYPE html>
<html>

<head>
    <title>Healthkart</title>
    <link rel="icon" type="image/x-icon"
        href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_IxvilBp8rQb4vidgf6cL5IW6rIxxzdqgJZT5iDM&s">
    <script src="https://kit.fontawesome.com/71417027be.js" crossorigin="anonymous"></script>
    <style>
        .left {
            float: left;
        }

        .left4 {
            float: left;
        }

        .left2 {
            float: left;
            margin: 5px;
        }

        .left2:hover {
            transform: scale(1.2);
        }

        .left3 {
            float: left;
        }

        .left3:hover {
            transform: scale(1.1);
        }

        .right {
            float: right;
        }

        .container {
            background-color: rgb(252, 250, 250);
            height: 90px;
            width: 100%;
        }

        .menu {
            background-color: rgb(252, 250, 250);
            height: 90px;
            width: 100%;
            color:gray;
        }

        .text {
            background-color: rgb(235, 242, 245);
            height: 30px;
            width: 98.4%;
            margin-top: 0px;
            text-align: center;
            color:rgb(82, 82, 82);
            padding: 10px;
        }
        .col1 {
            content: none;
            display: block;
            clear: both;
        }

        .one {
            padding: 10px;
        }

        .two {
            margin-top: 20px;

        }

        body {
            margin: 0px;
            background-color: rgb(228, 228, 228);
        }

        i {
            color: rgb(3, 190, 190);
        }

        li {
            padding: 20px;
            list-style-type: none;
        }

        .search {
            border-radius: 10px;
            height: 50px;
            width: 600px;
            background-color: rgb(241, 241, 241);
            border-color: aliceblue;
            border: none;
            margin-left: 100px;
            outline: #ddd;
        }

        .padd {
            padding: 5px;
            margin-top: 7px;
        }

        #search {
            height: 30px;
            width: 30px;
            border: none;
            background-color: white;

        }

        .search:hover {
            background-color: rgb(225, 234, 238);
        }

        .dropdown {
            position: relative;
            display: inline-block;
            height: 20px;
            width: 100px;
            direction: rtl;
            /*dropbox to the right*/
        }

        .dropdown-content {
            display: none;
            position: absolute;
            background-color: rgb(235, 242, 245);
            min-width: 10px;
            width: 220px;
            box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
            z-index: 2;
            overflow: hidden;
        }

        .dropdown-content a {
            color: rgb(52, 55, 59);
            padding: 12px 16px;
            text-decoration: none;
            display: block;
            font: italic 1.2rem "Fira Sans", serif;
        }

        .dropdown-content a:hover {
            background-color: rgb(255, 255, 255);
            color: rgb(3, 190, 190);
        }

        .dropdown:hover .dropdown-content {
            display: block;
        }

        .dropdown2 {
            position: relative;
            display: inline-block;
            height: 20px;
            width: 150px;
        }

        .dropdown2-content {
            display: none;
            position: absolute;
            background-color: rgb(235, 242, 245);
            min-width: 10px;
            width: 200px;
            box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
            z-index: 2;
            overflow: hidden;
        }

        .dropdown2-content a {
            color: rgb(52, 55, 59);
            padding: 12px 16px;
            text-decoration: none;
            display: block;
            font: italic 1.2rem "Fira Sans", serif;
        }

        .dropdown2-content a:hover {
            background-color: rgb(255, 255, 255);
            color: rgb(3, 190, 190);
        }

        .dropdown2:hover .dropdown2-content {
            display: block;
        }

        .images {
            height: 320px;
            margin-top: 0px;
            overflow: hidden;
        }

        .products {
            margin-top: 20px;
            background-color: white;
            height: 600px;
            font-family: Times New Roman;
        }

        .prod:hover {
            box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
        }

        .left4 i {
            color: orange;
        }

        .left4:hover button {
            background-color: orange;
            color: white;
        }

        .left4:hover i {
            color: white;
        }

        .item {
            background-color: rgb(241, 241, 241);
            height: 220px;
            width: 250px;
            padding-top: 5px;
            text-align: center;
            border-radius: 5px;
        }

        .content {
            border: 1px solid rgb(223, 223, 223);
            height: 200px;
            width: 250px;
            text-align: center;
            padding-top: 40px;
        }

        .cart_but {
            height: 40px;
            width: 230px;
            background-color: rgb(255, 251, 242);
            border: 1px solid orange;
            border-radius: 5px;
            color: orange;
            font-weight: bold;
        }

        .adds {
            margin-top: 20px;
            background-color: white;
            height: 370px;
            padding: 20px;
            padding-left: 90px;
            padding-right: 90px;
        }

        .add_item img {
            margin: 10px;
            border-radius: 10px;
            height: 350px;
            width: 250px;
        }


        .top_right {
            position: relative;
            left: 110px;
            margin-right: 10px;
        }

        .heart_check{
            position: absolute;
            left: -100vw;
        }

        .heart_check+label {
            color: #aab8c2;
            cursor: pointer;
            font-size: 20px;
            align-self: center;
            transition: color 0.2s ease-in-out;
        }

        .heart_check +label:hover {
            color: grey;
        }

        .heart_check +label::selection {
            color: none;
            background: transparent;
        }

        .heart_check +label::moz-selection {
            color: none;
            background: transparent;
        }

        .heart_check:checked+label {
            color: #e22626;
            will-change: font-size;
            animation: heart 1s cubic-bezier(.17, .89, .32, 1.49);
        }
        .sponsor{
            margin-top: 20px;
            background-color: rgb(252, 250, 250);
            height: 250px;
            width: 100%;
            color:gray;
        }
        .sponsor h2{
            padding-left: 40px;
            padding-top: 40px;
        }
        .sponsor li{
            padding-top: 0px;
        }
        .usp{
            margin-top: 20px;
            background-color: rgb(252, 250, 250);
            height: 300px;
            width: 100%;   
        }
        .usp h2{
            padding-left: 40px;
            padding-top: 40px;
        }
        .usp_cont{
            width: 25%;
            padding-left: 100px;
        }
        .app{
            margin-top: 20px;
            background-color: rgb(252, 250, 250);
            height: 800px;
            width: 100%;
        }
        .app_img{
            width: 50%;
        }
        .app_content{
            width:50%;
        }
        .cont_hover li:hover{
            border: 2px solid rgb(3, 190, 190);
            border-radius:10px ;
        }
        .footer{
                padding-left:20px;
                padding-right: 20px;
                margin-top: 50px;
                height: 1800px;
                background-color: rgb(233, 229, 229);
                color:rgb(94, 93, 93)
            }
        .footer2{
                padding-left:20px;
                padding-right: 20px;
                padding-top: 20px;
                text-align: center;
                margin-top: 10px;
                height: 100px;
                background-color: rgb(0, 23, 27);
                color:rgb(255, 255, 255)
            }
        @keyframes heart {

            0%,
            17.5% {
                font-size: 0;
            }
        }
    </style>
</head>

<body>
    <div class="header">
        <div class="container">
            <div class="col1">
                <div class="one left"><a href="#"><img
                            src="https://static1.hkrtcdn.com/hknext/static/media/common/hk.png" height="70"
                            width="200"></a></div>
                <div class="two left">
                    <form action="#">
                        <input type="search" placeholder="Search for products & brands.." class="search">
                        <button type="submit" id="search"><i class="fa-solid fa-magnifying-glass"></i>
                        </button>
                    </form>
                </div>
            </div>
            <div class="col2 right">
                <ul>
                    <li class="right">
                        <div class="dropdown">
                            <a href="#drop" class="dropbtn"><i class="fa-solid fa-cart-shopping"> Cart</i></a>
                            <div class="dropdown-content">
                                <a href="#">Your cart is empty</a>
                                <a href="#">Proceed to cart</a>
                            </div>
                        </div>
                    </li>
                    <li class="right"><a href="#"><i class="fa-solid fa-user"> Login</i></a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="menu">
        <ul class="padd">
            <li class="left2"
                style="border: 1px solid rgb(207, 207, 207); border-radius:2px; height:10px; width:150px;">
                <div class="dropdown2">
                    <i class="fa-solid fa-grip-lines"></i> Shop by Category
                    <div class="dropdown2-content">
                        <a href="#">Sports Nutrition</a>
                        <a href="#">Vitamins & Supplements</a>
                        <a href="#">Ayurveda & Herbs</a>
                        <a href="#">Health Food & Drinks</a>
                        <a href="#">Fitness</a>
                        <a href="#">Wellness</a>
                    </div>
                </div>
            </li>
            <li class="left2">
                <div class="dropdown2" style="width: 100px;">
                    <i class="fa-solid fa-tag"></i> Best Sellers
                    <div class="dropdown2-content">
                        <a href="#">Sports Nutrition</a>
                        <a href="#">Health Food & Drinks</a>
                        <a href="#">Fitness</a>
                        <a href="#">Wellness</a>
                    </div>
                </div>
            </li>
            <li class="left2"><i class="fa-solid fa-medal"></i> Brands</li>
            <li class="left2" style="transform: scale(1);">
                <div class="dropdown2" style="width: 100px;">
                    <i class="fa-brands fa-buffer"></i> Offer zone
                    <div class="dropdown2-content" style="width: 750px; background-color: white;">
                        <ul style="margin: 0px;">
                            Offers and deals<br>
                            <li class="left3"><img src="https://img8.hkrtcdn.com/28749/smn_image_2874887_o.png"
                                    height="60px" width="100px"></li>
                            <li class="left3"><img src="https://img5.hkrtcdn.com/20091/smn_image_2009054_o.png"
                                    height="60px" width="100px"></li>
                            <li class="left3"><img src="https://img3.hkrtcdn.com/20091/smn_image_2009062_o.png"
                                    height="60px" width="100px"></li>
                            <li class="left3"><img src="https://img7.hkrtcdn.com/20091/smn_image_2009056_o.png"
                                    height="60px" width="100px"></li>
                            <li class="left3"><img src="https://img9.hkrtcdn.com/20091/smn_image_2009058_o.png"
                                    height="60px" width="100px"></li>
                        </ul>
                    </div>
                </div>
            </li>
            <li class="left2"><i class="fa-solid fa-blog"></i> Blogs</li>
            <li class="left2"><i class="fa-solid fa-gift"></i> Gift Cards</li>
            <li class="left2">
                <div class="dropdown2">
                    <i class="fa-brands fa-rocketchat"></i> Customer support
                    <div class="dropdown2-content">
                        <a href="#">Chat with us</a>
                        <a href="#">Email us</a>
                        <a href="#">Ask our experts</a>
                        <a href="#">Return Policy</a>
                        <a href="#">FAQs</a>
                        <a href="#">Terms & Conditions</a>
                    </div>
                </div>
            </li>
            <li class="left2"><i class="fa-solid fa-location-dot"></i> Store locator</li>
        </ul>
    </div>
    <div class="text">
        India's Largest D2C Nutrition Platform
    </div>
    <div class="images">
        <img src="https://img6.hkrtcdn.com/30048/bnr_3004765_o.jpg" height="320px" width="100%">
    </div>
    <div class="products">
        <br>
        <h2 style="padding-left: 40px;">Price Slash Alert</h2>
        <ul>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart" type="checkbox" />
                            <label for="heart">❤</label>
                        </div>
                        <img src="https://img10.hkrtcdn.com/30152/pck_3015179_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        MuscleBlaze Biozyme Performance Whey 2.2 lb Chocolate Hazelnut & Shaker Combo<br><br>
                        <b style="font-size: 20px;">&#8377; 2,398 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            3,649 </strike>
                        <font size="3px" color="green"> 34% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart2" type="checkbox" />
                            <label for="heart2">❤</label>
                        </div>
                        <img src="https://img8.hkrtcdn.com/27709/pck_2770837_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        MuscleBlaze Creatine Monohydrate 100g & HK Vitals Multivitamin & Fish Oil 60 Tabs Combo<br><br>
                        <b style="font-size: 20px;">&#8377; 1,199 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            2,596 </strike>
                        <font size="3px" color="green"> 53% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart3" type="checkbox" />
                            <label for="heart3">❤</label>
                        </div>
                        <img src="https://img6.hkrtcdn.com/30207/pck_3020605_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        HealthKart HK Vitals Hair Multivitamin 60 caps & DHT Blocker with Biotin 60 tabs by
                        healthkart<br><br>
                        <b style="font-size: 20px;">&#8377; 949 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            1,448 </strike>
                        <font size="3px" color="green"> 34% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart4" type="checkbox" />
                            <label for="heart4">❤</label>
                        </div>
                        <img src="https://img6.hkrtcdn.com/30153/pck_3015245_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        MuscleBlaze High Protein Peanut Butter 750g & High Protein Oats 1kg & Limited Edition Shaker
                        Combo<br><br>
                        <b style="font-size: 20px;">&#8377; 1,129 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            2,023 </strike>
                        <font size="3px" color="green"> 44% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
        </ul>
    </div>

    <div class="products">
        <br>
        <h2 style="padding-left: 40px;">Wellness Deal Of The Day</h2>
        <ul>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart5" type="checkbox" />
                            <label for="heart5">❤</label>
                        </div>
                        <img
                            src="https://img8.hkrtcdn.com/30086/prd_3008567-HealthKart-HK-Vitals-Vitamin-D3-90-capsules-Unflavoured_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        HealthKart HK Vitals Vitamin D3, 90 capsules<br><br>
                        <b style="font-size: 20px;">&#8377; 525 </b><strike style="color:rgb(52, 55, 59);"> &#8377; 829
                        </strike>
                        <font size="3px" color="green"> 38% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart6" type="checkbox" />
                            <label for="heart6">❤</label>
                        </div>
                        <img src="https://img10.hkrtcdn.com/30208/pck_3020759_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        Extreme Hairfall kit for hair<br><br><br>
                        <b style="font-size: 20px;">&#8377; 949 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            1,577 </strike>
                        <font size="3px" color="green"> 39% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart7" type="checkbox" />
                            <label for="heart7">❤</label>
                        </div>
                        <img src="https://img4.hkrtcdn.com/30202/pck_3020133_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        Gut and Skin care 2 Month's Pack<br><br><br>
                        <b style="font-size: 20px;">&#8377; 2,499 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            3,598 </strike>
                        <font size="3px" color="green"> 30% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart8" type="checkbox" />
                            <label for="heart8">❤</label>
                        </div>
                        <img
                            src="https://img9.hkrtcdn.com/24478/prd_2447738-TrueBasics-Heart-Omega3-Antarctic-Krill-Oil-30-capsules_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        TrueBasics Heart Omega-3 Antarctic Krill Oil, 30 capsules<br><br>
                        <b style="font-size: 20px;">&#8377; 799 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            1,099 </strike>
                        <font size="3px" color="green"> 27% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
        </ul>
    </div>
    <div class="adds">
        <div class="add_item left">
            <img src="https://img6.hkrtcdn.com/30214/bnr_3021345_o.jpg">
        </div>
        <div class="add_item left">
            <img src="https://img2.hkrtcdn.com/30206/bnr_3020581_o.jpg">
        </div>
        <div class="add_item left">
            <img src="https://img10.hkrtcdn.com/30215/bnr_3021439_o.jpg">
        </div>
        <div class="add_item left">
            <img src="https://img6.hkrtcdn.com/29546/bnr_2954515_o.jpg">
        </div>
    </div>
    <div class="products">
        <br>
        <h2 style="padding-left: 40px;">Fit Food Store</h2>
        <ul>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart9" type="checkbox" />
                            <label for="heart9">❤</label>
                        </div>
                        <img src="https://img6.hkrtcdn.com/29282/prd_2928175-MuscleBlaze-High-Protein-Peanut-Butter-1-kg-Dark-Chocolate-Crunchy_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        MuscleBlaze High Protein Peanut Butter, 1 kg, Dark Chocolate Crunchy<br><br>
                        <b style="font-size: 20px;">&#8377; 649 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            749 </strike>
                        <font size="3px" color="green"> 13% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart10" type="checkbox" />
                            <label for="heart10">❤</label>
                        </div>
                        <img src="https://img8.hkrtcdn.com/29737/pck_2973647_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        MuscleBlaze Creatine Monohydrate 100g & HK Vitals Multivitamin<br><br>
                        <b style="font-size: 20px;">&#8377; 899 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            1,246 </strike>
                        <font size="3px" color="green"> 28% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart11" type="checkbox" />
                            <label for="heart11">❤</label>
                        </div>
                        <img src="https://img8.hkrtcdn.com/30149/pck_3014867_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        MuscleBlaze High Protein Oats 2kg Dark Chocolate & Sipper Combo<br><br>
                        <b style="font-size: 20px;">&#8377; 1,299 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            2,098 </strike>
                        <font size="3px" color="green"> 38% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
            <li class="left4">
                <div class="prod">
                    <div class="item">
                        <div class="top_right">
                            <input class="heart_check" id="heart12" type="checkbox" />
                            <label for="heart12">❤</label>
                        </div>
                        <img src="https://img6.hkrtcdn.com/29690/pck_2968925_c_s.jpg">
                        <br>
                    </div>

                    <div class="content">
                        MuscleBlaze High Protein Peanut Butter 340 g with free sipper<br><br>
                        <b style="font-size: 20px;">&#8377; 1,399 </b><strike style="color:rgb(52, 55, 59);"> &#8377;
                            2,125 </strike>
                        <font size="3px" color="green"> 34% off</font><br><br><br>
                        <button class="cart_but"><i class="fa-solid fa-cart-shopping"></i> Add to cart</button>
                    </div>
                </div>
            </li>
        </ul>
    </div>
    <div class="sponsor">
        <h2>Brand Range</h2>
        <ul>
            <li class="left"><img src="https://img3.hkrtcdn.com/22115/bnr_2211472_o.png"></li>
            <li class="left"><img src="https://img7.hkrtcdn.com/22043/normal_2204256_o.png"></li>
            <li class="left"><img src="https://img9.hkrtcdn.com/22043/normal_2204258_o.png"></li>
            <li class="left"><img src="https://img1.hkrtcdn.com/22043/normal_2204260_o.png"></li>
            <li class="left"><img src="https://img9.hkrtcdn.com/22101/bnr_2210088_o.png"></li>
            <li class="left"><img src="https://img1.hkrtcdn.com/25529/bnr_2552840_o.png"></li>
            <li class="left"><img src="https://img7.hkrtcdn.com/22043/normal_2204266_o.png"></li>
        </ul>
    </div>
    <div class="usp">
        <h2>Why HeatlthKart ?</h2>
        <div class="usp_cont left">
            <img src="https://img9.hkrtcdn.com/20791/normal_2079088_o.png" height="70" width="70"><br>
            <b style="font-size:large">Wide range of Nutritional products</b><br>
            <font color="gray">One-stop fitness and health destination</font>
        </div>
        <div class="usp_cont left">
            <img src="https://img3.hkrtcdn.com/20791/normal_2079092_o.png" height="70" width="70"><br>
            <b style="font-size:large">100% Original & Authentic</b><br><br>
            <font color="gray">Tight control on sourcing and distribution</font>
        </div>
        <div class="usp_cont left">
            <img src="https://img9.hkrtcdn.com/20791/normal_2079088_o.png" height="70" width="70"><br>
            <b style="font-size:large">Guide to Fit and Healthy Lifestyle</b><br><br>
            <font color="gray">Your true partner in health & wellness journey</font>
        </div>
    </div>
    <div class="app">
        <div class="app_img left">
            <img src="https://static1.hkrtcdn.com/hknext/static/media/common/misc/download-App-IMG.svg">
        </div>
        <div class="app_cont left">
            <h1>Download the<br> <b>Healthkart Mobile App</b></h1>
            <ul class="cont_hover">
                <li><i class="fa-solid fa-cart-shopping"></i><font size="5px"> Easier, Faster Shopping</font><br>
                    Get Authentic supplements, Fitness solutions, and a healthy lifestyle</li>
                <li><i class="fa-solid fa-clock"></i><font size="5px"> Fuel your Fitness Goals</font><br>
                    Complete challenges to build habit & win HK cash</li>
                <li><i class="fa-solid fa-check-to-slot"></i><font size="5px"> Get Exclusive App Only Benefits</font><br>
                    Extra discounts, offers and cashbacks</li>
            </ul>
            <img src="https://static1.hkrtcdn.com/hknext/static/media/common/misc/boy-refer.svg" class="right">
            <img src="https://img10.hkrtcdn.com/28961/bnr_2896059_o.png" class="right" height="300" style="padding-right: 50px;">
        </div>
    </div>
<div class="footer2">
    Become a seller | Advertise | Gift Cards | Help Center | &copy;2007-2023 healthkart.com | &copy;Made by Yashika
</div>
</body>