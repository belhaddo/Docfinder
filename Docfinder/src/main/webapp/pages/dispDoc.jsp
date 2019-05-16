<%-- 
    Document   : dispDoc
    Created on : May 16, 2019, 5:27:30 PM
    Author     : badelh
--%>

<%@page import="java.util.List"%>
<%@page import="fr.utbm.docfinder.entity.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../srcPages/datatables-css.jsp" %>
        <%@include file="../srcPages/bootsrap.html" %>


        <title>Clients</title>

    </head>
    <body>      
        <%@include file="../srcPages/navbar.jsp" %>
        <br>
        <div class="container" style="width: 70%;">
            <% List<Client> ListDoc = (List<Client>) request.getAttribute("ListDoc");%>
            <table id="data" class="table table-striped table-bordered" >
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>Phone</th>
                        <th>Status</th>
                        <th>Action</th>

                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${ListDoc}" var="doc">
                    <tr><td>${doc.firstName}</td> 
                        <td>${doc.lastName}</td>
                        <td>${doc.email}</td>
                        <td>${doc.address}</td>
                        <td>${doc.phone}</td>
                        <td>${doc.status}</td>
                        <td><button type="button" class="btn btn-primary btn-sm" id ="${client.id}">
                                <span class="glyphicon glyphicon-minus-sign">Info</span></button></td></tr>




                </c:forEach>
                </tbody>
            </table>
        </div>
                        <%@include file="../srcPages/datatables-js.jsp" %>

    </body>
</html>

