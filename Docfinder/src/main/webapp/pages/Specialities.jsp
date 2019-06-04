<%-- 
    Document   : Specialities
    Created on : May 27, 2019, 4:08:08 AM
    Author     : badelh
--%>
<%@page import="fr.utbm.docfinder.entity.Speciality"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Specialities</title>
        <%@include file="../srcPages/bootsrap.html" %>
        <%@include file="../srcPages/datatables-js.jsp" %>


    </head>
    <body>
        <%@include file="../srcPages/navbar-auth.jsp" %>
        <br>
        <% List<Speciality> ListSpec = (List<Speciality>) request.getAttribute("ListSpec");%>

        <div class="container" style="width: 70%;">
            <div class="container"  style=" border-radius: 10px; height: 70px; background-color: gainsboro; box-shadow: 10px 10px grey;">
                <br/>

                <form class="form-inline" action="../AddSpec">
                    <label for="sname" class="mr-sm-2">Speciality name:</label>
                    <input type="sname" name="sname" class="form-control mb-2 mr-sm-2" required>
                    <label for="sdesc" class="mr-sm-2">Description</label>
                    <input type="text" name="sdesc"class="form-control mb-2 mr-sm-2" required>

                    <button type="submit" class="btn btn-primary mb-2">Submit</button>
                </form>
            </div>
            <br/><br/>


            <table id="data" class="table table-striped table-bordered" >
                <thead>

                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Action</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${ListSpec}" var="spec">
                        <tr><td>${spec.name}</td> 
                            <td>${spec.descs}</td>  
                            <td><button type="button" class="btn btn-danger btn-sm" onclick="myFunction()" id ="${spec.id}">
                                    <span class="glyphicon glyphicon-minus-sign">Delete</span></button></td></tr>
                                </c:forEach>
                </tbody>
            </table>
        </div>
<br/><br/>
        <%@include file="../srcPages/footer.jsp" %>

        <%@include file="../srcPages/datatables-js.jsp" %>
        <script>
            function myFunction() {
                $('button').click(function () {
                    var x = $(this).attr('id');
                    window.location.replace("/DeleteSpec?id=" + x);
                });
            }
        </script>
    </body>
</html>
