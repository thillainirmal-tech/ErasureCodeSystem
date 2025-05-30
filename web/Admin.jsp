<%-- 
    Document   : Admin
    Created on : 
    Author     : Devaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
		<meta charset="utf-8">
		<link href="css/style1.css" rel='stylesheet' type='text/css' />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<!--webfonts-->
		<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text.css'/>
		<!--//webfonts-->
</head>
 
<body>
	<div class="main">
		<form action="AdminServlet" id="" name="" method="post">
    		<h1><span>Admin</span> <lable> Login </lable> </h1>
  			<div class="inset">
	  			<p>
	    		 <label for="username">USERNAME</label>
   	 			<input type="text" name="username" placeholder="" required />
				</p>
  				<p>
				    <label for="password">PASSWORD</label>
				    <input type="password" name="password" placeholder="" required />
  				</p>
				
 			 </div>
 	 
			  <p class="p-container">
			
			    <input type="submit" value="Login">
			  </p>
		</form>
	</div>  
			
</body>
</html>