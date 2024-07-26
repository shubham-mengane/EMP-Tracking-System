<%-- 
    Document   : Adminlogin.jsp
    Created on : 19 May, 2023, 12:22:20 AM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <style>
                @import url('https://fonts.googleapis.com/css2?family=Quicksand:wght@300;500&display=swap');

* {
  box-sizing: border-box;
  font-family: 'Quicksand', sans-serif;
}

html,
body {
  background-image: url('IMG/download.jpg');
   background-repeat: no-repeat;
   background-size: 50%;
}

.full-screen-container {
  height: 100vh;
  width: 100vw;
  background-size: cover;
  background-position: center;
  display: flex;
  align-items: center;
  justify-content: center;
}

.login-container {
  background-color: hsla(201, 100%, 6%, 0.6);
  padding: 50px 30px;
  min-width: 400px;
  width: 50%;
  max-width: 600px;
}

.login-title {
  color: #fff;
  text-align: center;
  margin: 0;
  margin-bottom: 40px;
  font-size: 2.5em;
  font-weight: normal;
}

.input-group {
  display: flex;
  flex-direction: column;
  margin-bottom: 20px;
}

.input-group label {
  color: #fff;
  font-weight: lighter;
  font-size: 1.5em;
  margin-bottom: 7px;
}

.input-group input {
  font-size: 1.5em;
  padding: 0.1em 0.25em;
  background-color: hsla(201, 100%, 91%, 0.3);
  border: 1px solid hsl(201, 100%, 6%);
  outline: none;
  border-radius: 5px;
  color: #fff;
  font-weight: lighter;
}

.input-group input:focus {
  border: 1px solid hsl(201, 100%, 50%);
}

.login-button {
  padding: 10px 30px;
  width: 100%;
  border-radius: 5px;
  background: hsla(201, 100%, 50%, 0.1);
  border: 1px solid hsl(201, 100%, 50%);
  outline: none;
  font-size: 1.5em;
  color: #fff;
  font-weight: lighter;
  margin-top: 20px;
  cursor: pointer;
}

.login-button:hover {
  background-color: hsla(201, 100%, 50%, 0.3);
}

.login-button:focus {
  background-color: hsla(201, 100%, 50%, 0.5);
}

        </style>
    </head>
    <body>
        <form method="post" action="AdminLog">
            <div class="full-screen-container">
      <div class="login-container">
          <a  style="float: right; color: black" href="http://localhost:8080//EmpTrackingSystem/">X</a>
        <h3 class="login-title">Admin Login</h3>
        <form>
          <div class="input-group">
            <label>Email</label>
            <input type="email" class="form-control" name="txt_email" id="floatingInput" required />
          </div>
          <div class="input-group">
            <label>Password</label>
            <input type="password" class="form-control" name="txt_pass" id="floatingInput" required />
          </div>
            <button type="submit" class="login-button" name="btn" value="Login">Sign In</button>
        </form>
      </div>
    </div>
        </form>
        
    </body>
</html>
