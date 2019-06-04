<%-- 
    Document   : navbar-client
    Created on : May 16, 2019, 11:52:23 PM
    Author     : badelh
--%>

<%@page import="fr.utbm.docfinder.entity.Admin"%>
<%@page import="fr.utbm.docfinder.entity.Doctor"%>
<%@page import="fr.utbm.docfinder.entity.Client"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <!-- Brand/logo -->
    <a class="navbar-brand" href="#">Welcome</a>

    <!-- Links -->
    <% session = request.getSession(); %>
    <ul class="navbar-nav">
        <%
            if ((session.getAttribute("user") instanceof Doctor)) {
                out.println(" <li class='nav-item'>");
                out.println("<a class='nav-link' href='/DocSpec'><span class='glyphicon glyphicon-user'></span> Specialities </a>");
                out.println("</li>");
            }
            if ((session.getAttribute("user") instanceof Admin)) {
                out.println("<li class='nav-item'>");
                out.println("<a class='nav-link' href='#'>Reservations </a>");
                out.println("</li>");
                out.println("<li class='nav-item'>");
                out.println("<a class='nav-link' href='../dispClient'>Clients</a>");
                out.println("</li>");
                out.println("<li class='nav-item'>");
                out.println("<a class='nav-link' href='../DispDoc'>Doctors</a>");
                out.println("</li>");
                out.println("<li class='nav-item'>");
                out.println("<a class='nav-link' href='../Specialities'>Specialities</a>");
                out.println("</li>");
            }
        %>

    </ul>
    <ul class="navbar-nav ml-auto">

        <%
            if ((session.getAttribute("user") instanceof Client) || (session.getAttribute("user") instanceof Doctor)) {
                out.println(" <li class='nav-item'>");
                out.println("<a class='nav-link' href='/userspace'><span class='glyphicon glyphicon-user'></span> Profil </a>");
                out.println("</li>");

                out.println("<li>");
                out.println("<a class='nav-link' href='../pages/Login.jsp'><span class='glyphicon glyphicon-log-in'></span> Disconnect</a>");
                out.println("</li>");
            }
            else if ((session.getAttribute("user") instanceof Admin)) {
                out.println("<li>");
                out.println("<a class='nav-link' href='../pages/Login.jsp'><span class='glyphicon glyphicon-log-in'></span> Disconnect</a>");
                out.println("</li>");
            } else {
                out.println(" <li class='nav-item'>");
                out.println("<a class='nav-link' href='../pages/Singup.jsp'><span class='glyphicon glyphicon-user'></span> Singup </a>");
                out.println("</li>");
                out.println("<li class='nav-item'>");
                out.println("<a class='nav-link' href='../pages/Login.jsp'><span class='glyphicon glyphicon-log-in'></span> Login</a>");
                out.println("</li>");

            }
        %>
    </ul>
</nav>
