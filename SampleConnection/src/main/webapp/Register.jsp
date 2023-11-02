<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<link rel="stylesheet" href="Register.css">
</head>
<body>
  
   
<body>
  <div class="wrapper">
    <h2>Registration</h2>
    <form action="Registration" method="post">
      <div class="input-box">
        <input type="text" placeholder="Enter your name" name="name" required>
      </div>
      <div class="input-box">
        <input type="text" placeholder="Enter your email" name="email" required>
      </div>
      <div class="input-box">
        <input type="password" placeholder="Create password" name="password" required>
      </div>
      <div class="input-box">
        <input type="password" placeholder="Confirm password" name="Repassword"  required>
      </div>
       <div class="input-box">
        <input type="text" placeholder="Mobile Number" name="mobile" required>
      </div>
      <div class="policy">
        <input type="checkbox">
        <h3>I accept all terms & condition</h3>
      </div>
      
      <div class="input-box button">
        <input type="Submit" value="Register Now">
      </div>
      
      <div class="text">
        <h3>Already have an account? <a href="Index.jsp">Login now</a></h3>
      </div>
    </form>
  </div>
 
</body>
</html>