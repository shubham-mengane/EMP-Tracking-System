<%-- 
    Document   : Addpro.jsp
    Created on : 15 May, 2023, 2:36:42 AM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <style>
            body{
                background: linear-gradient(to left, #cc33ff 16%, #ccccff 54%);
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
        <form method="post" action="AddPro">
        <div class="row">
            <div class="col-sm-3">    
            </div>
            
            <div class="col-sm-6">
                <div class="container">
                    <a  style="float: right" href="http://localhost:8080//EmpTrackingSystem/Admin.jsp">X</a>
                   

                    <br>

                    <div class="row">
                        <div class="col-sm-6">
                            <label>Project Name</label>
                            <input type="text" class="form-control" name="txt_pname" id="floatingInput" required>
                        </div>
                        <div class="col-sm-6">
                            <label>Project Employee</label>
                            <input type="text" class="form-control" name="txt_pemp" id="floatingInput" required>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-sm-6">
                            <label>Client Name</label>
                            <input type="text" class="form-control" name="txt_cname" id="floatingInput" required>
                        </div>
                        <div class="col-sm-6">
                            <label>Development Platform</label>
                            <input type="text" class="form-control" name="txt_dplat" id="floatingInput" required>
                        </div>

                    </div>
                    <br>
                    <div class="row">
                        <div class="col-sm-6">
                            <label>Project Type</label>
                            <input type="text" class="form-control" name="txt_ptype" id="floatingInput" required>
                        </div>
                        <div class="col-sm-6">
                            <label>DataBase Technology</label>
                            <input type="text" class="form-control" name="txt_dbtechno" id="floatingInput" required>
                        </div>

                    </div>
                    
                    <br>
                     <div class="row">
                        <div class="col-sm-6">
                            <label>Project Manager</label>
                            <select class="form-control" name="txt_pman" id="floatingInput" required>
                                <option>Select</option>
                                <option>shubham</option>
                                <option>rakesh</option>
                                <option>Gita</option>
                                <option>Omkar</option>
                            </select>
                        </div>
                         <div class="col-sm-6">
                            <label>Project Description</label>
                            <input type="text" class="form-control" name="txt_pdescrip" id="floatingInput" required>
                        </div>

                    </div>
                    <br>
                     <div class="row">
                         <div class="col-sm-6">
                         </div>
                        <div class="col-sm-6">

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
