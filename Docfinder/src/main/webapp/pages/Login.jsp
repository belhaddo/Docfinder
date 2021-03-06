<%-- 
    Document   : Login
    Created on : May 5, 2019, 5:19:56 PM
    Author     : BADELH
--%>
<% session = request.getSession(); %>
<% session.invalidate();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../srcPages/bootsrap.html" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>

        <%@include file="../srcPages/navbar-auth.jsp" %>
        <br>
        <div class="container"  style="width : 60%; height: 300px ; border-radius: 10px;   box-shadow: 10px 10px grey;
             background-color: gainsboro;">
            <form action="../Login" class="was-validated" method="post">
                <div class="row justify-content-center">
                    <label for="sel1" style="font-weight: bold;">I am a : </label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <div class="form-group">

                        <select class="form-control" name="person" id="person">
                            <option value="client">Client</option>
                            <option value="doctor">Doctor</option>
                            <option value="admin">Support</option>                       

                        </select>
                    </div>

                </div>

                <div class="form-group col-sm-12">
                    <label for="email">Email : </label>
                    <input type="email" class="form-control" id="fname" placeholder="Enter email" name="email" required>                      
                </div>

                <div class="form-group col-sm-12">
                    <label for="pwd">Password : </label>
                    <input type="password" class="form-control" id="lname" placeholder="Enter password" name="pwd" required>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

        </div>
        <br/><br/>
                            <%@include file="../srcPages/footer.jsp" %>

    </body>
</html>
