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
                <tbody>
                    <%
                        List<Client> ListClient = (List<Client>) request.getAttribute("ListClient");
                        for (Client client1 : ListClient) {
                            System.out.println("<tr>");
                            System.out.println("<th>" + client1.getFirstName() + "</th>");
                            System.out.println("<th>" + client1.getLastName() + "</th>");
                            System.out.println("<th>" + client1.getEmail() + "</th>");
                            System.out.println("<th>" + client1.getAddress() + "</th>");
                            System.out.println("<th>" + client1.getPhone() + "</th>");
                            System.out.println("</tr>");

                        }
                    %>
                </tbody>
            </table>
        </div>

    </body>
</html>
