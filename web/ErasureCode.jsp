<%-- 
    Document   : ErasureCode
    Created on : 
    Author     : Devaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

	<head>
		<meta charset="utf-8"/>
		<title>JavaScript File Encryption App</title>

		<meta name="viewport" content="width=device-width, initial-scale=1" />

		<link href="http://fonts.googleapis.com/css?family=Raleway:400,700" rel="stylesheet" />
		<link href="assets/css/style.css" rel="stylesheet" />

	</head>

	<body>
            <form name="lg-form" method="post" action="FileUpload1" enctype="multipart/form-data" >

		<a class="back"></a>

		<div id="stage">

			<div id="step1">
				<div class="content">
					<h1>What do you want to do?</h1>
					<a class="button encrypt green">Login</a>
					
				</div>
			</div>

			
			<div id="step3">

				<div class="content if-encrypt">
					<h1>Enter a pass phrase</h1>
					<h2>This phrase will be used as an encryption key. Write it down or remember it; you won't be able to restore the file without it. </h2>
                                            
                                        
                                        
                                        
                                          
                                          <br>
                                          
                                          <div>
					 <input type="text" required title="Password required"  placeholder="UserName" name="UserName" id="RegUpass">
                                          <br>
                                           <input type="password" required title="Password required"  placeholder="Password" name="PassWord" id="RegUpass">
                                          <br>
                                          
                                          <h1> <button type="submit" id="login">SUBMIT</button></h1>
                                            </div>
					
					
                                        
                                        
				</div>


			</div>

			

		</div>

		<footer>
           
       

	</body>

	<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="assets/js/script.js"></script>

</html>
