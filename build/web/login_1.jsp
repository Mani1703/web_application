<html>
    <head>
        <title>login form</title>
        <link rel="stylesheet" type="text/css" href="login.css">
      
    </head>
    <body>
        <div class="login_box">
        <img src="avatar.jpg" class="avatar">
        <h1>Admin login</h1>
        <form  method="post" action="validate_1.jsp">
                <p>Username</p>
                <input id="username" placeholder="Enter Username" 
                    type="text" name="username"/>
                <p>Password</p>
                <input id="password" placeholder=" Enter Password"
                       type="password" name="password"/>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
                <button type="submit">Submit</button> <br><br>
            
                <a href="#">Forget Password</a>
                <br><a href="adminlogin.jsp">Admin login</a>
            </form>
        </div>
    </body>
