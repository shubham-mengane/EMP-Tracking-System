<%-- 
    Document   : Prorep
    Created on : 19 May, 2023, 2:42:39 AM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project Report</title>
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
        <form action="ProRepo" method="post">
        <div class="row">
            <div class="col-sm-3">    
            </div>
            
            <div class="col-sm-6">
                <div class="container">
                    <a  style="float: right" href="http://localhost:8080//EmpTrackingSystem/Emp.jsp">X</a>                    
                    <br>
                    <div class="row">
                        <div class="col-sm-6">
                            <label>Project Name</label>
                            <select  class="form-control" name="txt_proname" id="floatingInput" required>
                                <option>Select</option>
                                <option>Railway</option>
                                <option>Shop Management</option>
                            </select>
                        </div>
                        <div class="col-sm-6">
                            <label>Project Report</label>
                            <input type="text" name="txt_preport" class="form-control" id="floatingInput" required>
                        </div>
                        <br>
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
