<%-- 
    Document   : Addemp.jsp
    Created on : 11 May, 2023, 11:50:01 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Employee</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <style>
            body{
               background-image: url('IMG/getty_519578900_316016.jpg');
                height: 500px;
            }
            .container
            {
                background-color: white;
                margin-top: 50px;
                padding: 30px;
            }
            input[type=submit]
            {
                 background: linear-gradient(to left, #cc33ff 16%, #ccccff 54%);
                 color: white;
            }
        </style>
        
    </head>
    <body>
        <form action="AddEmpl" method="post">
        <div class="row">
            <div class="col-sm-3">    
            </div>
            
            <div class="col-sm-6">
                <div class="container">
                    <a  style="float: right" href="http://localhost:8080//EmpTrackingSystem/Admin.jsp">X</a>                    

                    <br>

                    <div class="row">
                        <div class="col-sm-6">
                            <label>Name</label>
                            <input type="text" name="txt_name" class="form-control" id="floatingInput" required>
                        </div>
                        <div class="col-sm-6">
                            <label>Phone Number</label>
                            <input type="text" name="txt_phone" class="form-control" id="floatingInput" required>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-sm-6">
                            <label>Email</label>
                            <input type="email" name="txt_email" class="form-control" id="floatingInput" required>
                        </div>
                        <div class="col-sm-6">
                            <label>Address</label>
                            <input type="text" name="txt_add" class="form-control" id="floatingInput" required>
                        </div>

                    </div>
                    <br>
                    <div class="row">
                        <div class="col-sm-6">
                            <label>Birth Date</label>
                            <input type="date" name="txt_dob" class="form-control" id="floatingInput" required>
                        </div>
                        <div class="col-sm-6">
                            <label>Password</label>
                            <input type="password" name="txt_pass" class="form-control" id="floatingInput" required>
                        </div>

                    </div>
                    
                    <br>
                     <div class="row">
                        <div class="col-sm-6">
                            <label>Gender</label>
                            <select  class="form-control" name="txt_gender" id="floatingInput" required>
                                <option>Select</option>
                                <option>Male</option>
                                <option>Female</option>
                            </select>
                        </div>
                         <div class="col-sm-6">
                            <label>Designation</label>
                            <input type="text" name="txt_design" class="form-control" id="floatingInput" required>
                        </div>

                    </div>
                    <br>
                     <div class="row">
                         <div class="col-sm-6">
                              <label>Image</label>
                              <input type="file" name="f_image" class="form-control" id="floatingInput" required>
                         </div>
                        <div class="col-sm-6">
                            <label></label>
                            <input type="submit" name="btn" class="form-control" value="SUBMIT">
                        </div>

                    </div>


                </div>
            </div>
            <div class="col-sm-3"></div>
            
        </div>
        </form>
    </body>
</html>
