<%-- 
    Document   : dispClient
    Created on : May 5, 2019, 9:28:39 PM
    Author     : BADELH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../srcPages/datatables.html" %>
        <%@include file="../srcPages/bootsrap.html" %>


        <title>Clients</title>
       
    </head>
    <body>      
        <%@include file="../srcPages/navbar.jsp" %>
        <br>
        <div class="container">
            <table id="data" class="table table-striped table-bordered" style="width:70%">
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>Phone</th>
                        <th>Status</th>
                    </tr>
                </thead>
                
            </table>
        </div>
        
    </body>
</html>
