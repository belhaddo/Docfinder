<%-- 
    Document   : navbar-client
    Created on : May 16, 2019, 11:52:23 PM
    Author     : badelh
--%>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <!-- Brand/logo -->
    <a class="navbar-brand" href="#">${person.firstName}</a>

    <!-- Links -->
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="#">Home </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Link 2</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Link 3</a>
        </li>
    </ul>
        <ul class="navbar-nav ml-auto">
        <li class="nav-item">
            <a class="nav-link" href="/userspace"><span class="glyphicon glyphicon-user"></span>Profil</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="../pages/Login.jsp"><span class="glyphicon glyphicon-log-in"></span>Disconnect</a>
            </li>
        </div>
    </ul>
</nav>
