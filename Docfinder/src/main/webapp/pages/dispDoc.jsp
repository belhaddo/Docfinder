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

        <title>Doctors</title>

    </head>
    <body>      
        <%@include file="../srcPages/navbar-auth.jsp" %>
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
                            <td><button type="button" onclick="myFunction()" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#myModal" id ="${doc.id}">
                                    <span class="glyphicon glyphicon-minus-sign">Delete</span></button></td></tr>




                    </c:forEach>
                </tbody>
            </table>
        </div>
        <br/><br/>
        <%@include file="../srcPages/footer.jsp" %>

        <script>
            function myFunction() {
                $('button').click(function () {
                    var x = $(this).attr('id');
                    window.location.replace("/DeleteDoc?id=" + x);
                });
            }
        </script>
        <%@include file="../srcPages/datatables-js.jsp" %>

    </body>
</html>

