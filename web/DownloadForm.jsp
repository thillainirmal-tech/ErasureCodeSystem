<%-- 
    Document   : DownloadForm
    Created on : 
    Author     : Devaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@page import="java.sql.*"%>
<%@page import="com.commondb.Common_DB"%>
<%@page import="java.util.ArrayList"%>


<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>

<html lang="en">
<head>
    <title>ErasureCode</title>
    <meta charset="utf-8">
    <meta name="format-detection" content="telephone=no"/>
    <link rel="icon" href="images/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="css/grid.css">
    <link rel="stylesheet" href="css/style11.css">
    <link rel="stylesheet" href="css/camera.css"/>
    <link rel="stylesheet" href="css/owl.carousel.css"/>
    <script src="js/jquery.js"></script>
    <script src="js/jquery-migrate-1.2.1.js"></script>
    <script src="js/jquery.equalheights.js"></script>
    <!--[if (gt IE 9)|!(IE)]><!-->
    <script src="js/jquery.mobile.customized.min.js"></script>
    <!--<![endif]-->
    <script src="js/camera.js"></script>
    <script src="js/owl.carousel.js"></script>
    <!--[if lt IE 9]>
    <div style=' clear: both; text-align:center; position: relative;'>
        <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
            <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0"
                 height="42" width="820"
                 alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."/>
        </a>
    </div>
    <script src="js/html5shiv.js"></script>
    <link rel="stylesheet" type="text/css" media="screen" href="css/ie.css">
    <![endif]-->
    
    <style>
.button123 {
    position: relative;
    background-color: #4CAF50;
    border: none;
    font-size: 28px;
    color: #FFFFFF;
    padding: 20px;
    width: 200px;
    text-align: center;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    text-decoration: none;
    overflow: hidden;
    cursor: pointer;
}

.button123:after {
    content: "";
    background: #90EE90;
    display: block;
    position: absolute;
    padding-top: 300%;
    padding-left: 350%;
    margin-left: -20px!important;
    margin-top: -120%;
    opacity: 0;
    transition: all 0.8s
}

.button123:active:after {
    padding: 0;
    margin: 0;
    opacity: 1;
    transition: 0s
}
</style>
</head>
<body>
    
    
    <%
            String user=session.getAttribute("Username").toString();
        //String user="kalai";
            %>
            
    <form name="form1" method="post" action="FileDownLoad">
        
    
<div class="page">
<!--========================================================
                          HEADER
=========================================================-->
<header id="header">
    <div id="stuck_container">
        <div class="container">
            <div class="row">
                <div class="grid_12">
                    <div class="brand put-left">
                        <h1>
                            <a href="index.jsp">
                                <img src="images/logo.png" alt="Logo"/>
                            </a>
                        </h1>
                    </div>
                    <nav class="nav put-right">
                        <ul class="sf-menu">
                            <li class="current"><a href="index.jsp">Home</a></li>
                        
                           
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</header>
<!--========================================================
                          CONTENT
=========================================================-->
<section id="content"><div class="ic"></div>
<div class="camera-wrapper">
    <div id="camera" class="camera-wrap">
        
        
        
        <div data-src="images/index_slide03.jpg">
            <div class="fadeIn camera_caption">
                <h1> </h1>
                <h2 class="text_1 color_1">Welcome <%=user%></h2>
                <a class="btn_1" href="#">More info</a>
            </div>
        </div>
        <div data-src="images/index_slide13.jpg">
            <div class="fadeIn camera_caption">
            
                
             
              
                 <br>
			<div class="">
				
				<input type="password" name="password" id="password" placeholder="Enter the key" required/>
			</div>
                <br>
                
                <br>
               
                
            </div>
            
            
            
        </div>
                
                
                
                <div data-src="images/index_slide14.jpg">
            <div class="fadeIn camera_caption">
                <h1> </h1>
                <h2 class="text_1 color_1">Welcome  <%=user%></h2>
                
                
                
                
             
                <table>
                    <tr>
                      
                        <td>
                            
                           <select name="filename">
                                <%  		
          // String group=session.getAttribute("group").toString();                                                                                  
          ArrayList filename=(ArrayList)session.getAttribute("filename");                        
          for(int i=0;i<filename.size();i++) {			 
%>
              <option> <%=filename.get(i)%> </option>
              <% }
       
%>
                           </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <button class="button123" type="submit" id="login">Submit</button>
                        </td>
                        
                    </tr>                                        
                </table> 
                           
                           
                           
                           
                 
              
         
                
                
                
            </div>
                
        </div>
      
    </div>
</div>
<div class="container">
    <div class="row wrap_9 wrap_4 wrap_10">
        <div class="grid_12">
            <div class="header_1 wrap_3 color_3">
                Get in Touch
            </div>
            <div class="box_3">
                <ul class="list_1">
                    <li><a class="fa fa-twitter" href="#"></a></li>
                    <li><a class="fa fa-facebook" href="#"></a></li>
                    <li><a class="fa fa-google-plus" href="#"></a></li>
                    <li><a class="fa fa-pinterest" href="#"></a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
</section>
</div>
<!--========================================================
                          FOOTER
=========================================================-->
<footer id="footer" class="color_9">
    <div class="container">
        <div class="row">
            <div class="grid_12">
                <p class="info text_4 color_4">
                    © <span id="copyright-year"></span> | <a href="#">Pantech</a> <br/>     </p>
            </div>
        </div>
    </div>
</footer>
<script src="js/script.js"></script>
</form>
</body>
</html>

    