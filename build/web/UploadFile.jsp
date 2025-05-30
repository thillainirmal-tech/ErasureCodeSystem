<%-- 
    Document   : UploadLogin
    Created on : 
    Author     : devaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>DownloadGroupLogin</title>
<link href="css/styles.css" rel="stylesheet" type="text/css" />
<link href='http://fonts.googleapis.com/css?family=Economica' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>
<!----menu--->
<link rel="stylesheet" href="css/superfish.css" media="screen">
<link rel="stylesheet" href="css/style2.css" />
<script src="js/jquery-1.9.0.min.js"></script>
<script src="js/hoverIntent.js"></script>
<script src="js/superfish.js"></script>
<script>

		// initialise plugins
		jQuery(function(){
			jQuery('#example').superfish({
				//useClick: true
			});
		});

		</script>
</head>
<body>
    <form name="lg-form" method="post" action="FileUpload2" enctype="multipart/form-data" >

<div class="wrap1">
<div class="container">
  <div class="header">
    <div class="logo">
      <h1>UserLogin</h1>
    </div>
    <div class="menu">
      <ul class="sf-menu" id="example">
        
       
        </li>
   
        </li>

      </ul>
    </div>
  </div>

</div>
<div class="clearing"></div>
</div><!---header-wrap--->
<div class="wrap4">
  <div class="container">
    <div class="leftcol">
      <div class="title">
    
      </div>
      <div class="page-content">
      <div class="panel borderbotm-none">
  
         
            
       
	<div class="lg-container">
		
                
                
                <div class="content">
                    <h2>Enter The  UserName And Password</h2>
                    <%
                String Username=session.getAttribute("Username").toString();
                %>
                </div>
                 <h1>welcome, <%=Username%></h1></font>
		<form name="lg-form" method="post" action="FileUpload2" enctype="multipart/form-data" >
                    
                     
			
			<div>
				
				<table width="200" border="0">
                              <tr>
                                    <td><label for="Browse"></label>
                                    <div align="center">
                                        <label for="Browse3"></label>
                                        
                                         <input type="file" name="file" id="file" />
                                         
                                     </div></td>
                                </tr>
                                 </table>
                                
			</div>
			
			<div>
				
			</div>
			<div>				
				<button type="submit" id="login">Login</button>
			</div>
                    
            		</form>

        </div>
      </div>
      </div>
      
    </div>
    <div class="rightcol">
     
      <div class="panel">
        <div class="content">
       
        </div>
      </div>
    </div>
  <div class="clearing"></div>  
  </div>
</div>
<!---wrap4--->
<div class="wrap3">
<div class="container">
 
<div class="clearing"></div>
</div>
</div>
<div class="shadows2">
</div>
</form>
</body>
</html>

