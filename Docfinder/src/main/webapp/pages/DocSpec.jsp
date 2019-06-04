<%-- 
    Document   : DocSpec
    Created on : May 27, 2019, 8:23:10 PM
    Author     : badelh
--%>

<%@page import="fr.utbm.docfinder.entity.Doctor"%>
<%@page import="fr.utbm.docfinder.entity.Speciality"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My space</title>
        <%@include file="../srcPages/bootsrap.html" %>

    </head>
    <body>
        <%@include file="../srcPages/navbar-auth.jsp" %>
        <br/><br/>



        <div class="container"  style="width : 60%;  border-radius: 10px;   box-shadow: 10px 10px grey;             background-color: gainsboro;">

            <br/>
            <div class="form-group">
                <form action="/specToDoc" class="was-validated" method="post">
                    <div class="row">
                        <label for="sel1">Add Specialities:</label>

                        &nbsp;                        
                        <select class="form-control col-sm-6" name="allspecs">
                            <c:forEach items="${listAllSpec}" var="allspec">
                                <option value="${allspec.id}">${allspec.name}</option>        
                            </c:forEach>
                        </select>
                        <br/>                        
                        <div class="form-group col-sm-8">
                            <label for="adrs"> Description :</label>
                            <textarea class="form-control col-sm-10" name="desc" rows="3">${desc}</textarea>
                        </div>
                        <br/>
                    </div>
                    <button type="submit" class="btn btn-primary col-sm-2">Update</button>
                </form>
            </div>





            <br/>
            <label for="sel1">my Specialities:</label>
            <c:forEach items="${ListSpec}" var="spec">
                <button type="button" class="btn btn-sm btn-danger" data-toggle="popover" title="${spec.name}" data-content="${spec.descs}">${spec.name}</button>
            </c:forEach>



        </div>

        <br/><br/>
        <%@include file="../srcPages/footer.jsp" %>
        <script>
            $(document).ready(function () {
                $('[data-toggle="popover"]').popover();
            });
        </script>
    </body>
</html>
