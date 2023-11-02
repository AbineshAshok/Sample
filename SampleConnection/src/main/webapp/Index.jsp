<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
      <link rel="stylesheet" href="Index.css">

<title>Login</title>
</head>
<body>

      <div class="wrapper">
         <div class="title">
            Login Form
         </div>
         <form action="Loginpage" method="post">
            <div class="field">
               <input type="text"  name ="cemail" id="cemail"required>
               <label>Email Address</label>
            </div>
            <div class="field">
               <input type="password" name="cpassword" name="cpassword" required>
               <label>Password</label>
            </div>
            <div class="content">
               <div class="checkbox">
                  <input type="checkbox" id="remember-me">
                  <label for="remember-me">Remember me</label>
               </div>
               <div class="pass-link">
                  <a href="#">Forgot password?</a>
               </div>
            </div>
            <div class="field">
               <input type="submit" value="Login">
            </div>
            <div class="signup-link">
               Not a member? <a href="Register.jsp">Register</a>
            </div>
         </form>
      </div>
  <script>
  
  
  
  </script>

</body>
</html>