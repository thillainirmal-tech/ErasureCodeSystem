<%-- 
    Document   : servermsg
    Created on : 
    Author     : Devaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<meta charset="utf-8">
<meta name = "format-detection" content = "telephone=no" />
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico" />
<link rel="stylesheet" href="css1/touchTouch.css">
<link rel="stylesheet" href="css1/camera.css">
<link rel="stylesheet" href="css1/style.css">
<script src="js1/jquery.js"></script>
<script src="js1/jquery-migrate-1.1.1.js"></script>
<script src="js1/jquery.easing.1.3.js"></script>
<script src="js1/script.js"></script>
<script src="js1/superfish.js"></script>
<script src="js1/jquery.equalheights.js"></script>
<script src="js1/jquery.mobilemenu.js"></script>
<script src="js1/tmStickUp.js"></script>
<script src="js1/jquery.ui.totop.js"></script>
<script src="js1/touchTouch.jquery.js"></script>
<script src="js1/camera.js"></script>
<!--[if (gt IE 9)|!(IE)]><!-->
<script src="js1/jquery.mobile.customized.min.js"></script>
<!--<![endif]-->
<script>
 $(window).load(function(){
  $().UItoTop({ easingType: 'easeOutQuart' });
  $('#camera_wrap').camera({
    loader: false,
    pagination: false ,
    minHeight: '400',
    thumbnails: true,
    height: '46.32478632478632%',
    caption: false,
    navigation: false,
    fx: 'mosaic'
  });
  $('.gallery .gall_item').touchTouch();
 });
</script>
<!--[if lt IE 8]>
 <div style=' clear: both; text-align:center; position: relative;'>
   <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
     <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
   </a>
</div>
<![endif]-->
<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<link rel="stylesheet" media="screen" href="css/ie.css">
<![endif]-->
</head>
<body class="" id="top">
<!--==============================
              header
=================================-->


<div class="main">
<header>
  <div class="container_12">
    <div class="grid_12">
      <h1 class="logo">
        <a href="index.html">Your    Server  Was    Tried    By    Hi-Hackers</a>
      </h1>
    </div>
    <div class="clear"></div>
  </div>
  <section id="stuck_container">


  <!--==============================
              Stuck menu
  =================================-->
   
  </section>
</header>
<section class="slider_wrapper">
  <div class="container_12">
    <div class="grid_12">
      <div id="camera_wrap" class="">
        <div data-src="images1/slide-1.jpg" data-thumb="images1/thumb-2.jpg"></div>
        <div data-src="images1/slide-2.jpg" data-thumb="images1/thumb-3.jpg"></div>
        <div data-src="images1/slide-3.jpg" data-thumb="images1/thumb-1.jpg"></div>
      </div>
    </div>
    <div class="clear"></div>
  </div>
</section>
<!--=====================
          Content
======================-->
    

</body>
</html>