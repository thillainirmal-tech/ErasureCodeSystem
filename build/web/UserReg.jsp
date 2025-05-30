<%-- 
    Document   : UserReg
    Created on :
    Author     : devaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Welcome to Registration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<meta name="keywords" content="iOS 7 Login And Register App Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="css/style_reg.css" rel='stylesheet' type='text/css' />
<!--webfonts-->
<link href='//fonts.googleapis.com/css?family=Lato:100,300,400,700,900,300italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Calligraffitti' rel='stylesheet' type='text/css'>
<!--//webfonts-->
</head>
<body>
 <!--SIGN UP-->
 

<div class="login-form-1">
    <h1>User Register<br><br></h1>
	<form action="UserRegistrationForm" id="" name="" method="post">
		<input type="text" id ="username" name="name" class="text"  placeholder="Enter User Name" required="required">
                <input type="password" id ="password"  name="password" placeholder="Enter your Password" required="required" >
                
		<input type="email" id ="email"class="text" name="email" placeholder="Enter your email" required="required"   >
		<input type="text" id ="mobile"class="text" name="mobileno"  placeholder="Enter your MobileNo" required="required"  maxlength="10"    pattern="[0-9]{10}" title="Enter your mobile number">
                <input type="password" id ="username" name="Key" class="text"  placeholder="Enter your Key " required="required"  maxlength="16" pattern="[0-9,a-z,A-Z]{16}" title="Enter the 16 letter ">
                
                
		<input type="submit"  value="Register">
	</form>
</div>
 <!--/SIGN IN-->
 <div class="copy-rights">
					<p>secure erasure Code</p>
			</div>

</body>
</html>
