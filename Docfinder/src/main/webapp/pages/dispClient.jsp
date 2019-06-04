<%--
    Document   : dispClient
    Created on : May 5, 2019, 9:28:39 PM
    Author     : BADELH
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
        <%@include file="../srcPages/navbar-auth.jsp" %>
        <br>
        <div class="container" style="width: 70%;">
            <% List<Client> ListClient = (List<Client>) request.getAttribute("ListClient");%>
            <table id="data" class="table table-striped table-bordered" >
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>Phone</th>
                        <th>Action</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${ListClient}" var="client">
                        <tr><td>${client.firstName}</td> 
                            <td>${client.lastName}</td>
                            <td>${client.email}</td>
                            <td>${client.address}</td>
                            <td>${client.phone}</td>
                            <td><button type="button" onclick="myFunction()" class="btn btn-danger btn-sm"  id ="${client.id}">
                                    <span class="glyphicon glyphicon-minus-sign">Delete</span></button></td></tr>




                    </c:forEach>
                </tbody>
            </table>
        </div>

        <%@include file="../srcPages/datatables-js.jsp" %>
        <script>
            function myFunction() {
                $('button').click(function () {
                    var x = $(this).attr('id');
                    window.location.replace("/DeleteClient?id=" + x);
                });
            }
        </script>
        <br/><br/>

                <%@include file="../srcPages/footer.jsp" %>
    </body>
</html>
