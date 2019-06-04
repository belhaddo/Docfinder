<%-- 
    Document   : UserSpace
    Created on : May 16, 2019, 7:54:14 PM
    Author     : badelh
--%>

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

        <br>
        <div class="container"  style="width : 50%; height : 650px; border-radius: 10px;   box-shadow: 10px 10px grey;
             background-color: gainsboro;">
            <form action="../UpdateProfil" class="was-validated" method="post">

                <div class="row">
                    <div class="form-group col-sm-6">
                        <label for="fname">Firstname : </label>
                        <input type="text" class="form-control" id="fname" value="${person.firstName}" name="fname" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>

                    <div class="form-group col-sm-6">
                        <label for="lname">Lastname : </label>
                        <input type="text" class="form-control" id="lname" value="${person.lastName}" name="lname" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-sm-12">
                        <label for="lname">email : </label>
                        <input type="email" class="form-control" id="email" value="${person.email}" name="email" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>

                </div>

                <div class="row">
                    <div class="form-group col-sm-6">
                        <label for="pwd">Password:</label>
                        <input type="password" class="form-control" id="pwd" value="${person.pwd}" name="pwd" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>
                </div>

                <div class="row">
                    <div class="form-group col-sm-6">
                        <label for="adrs"> Address :</label>
                        <textarea type="text" class="form-control" id="adrs"  name="adrs" required>${person.address}</textarea>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>

                    <div class="form-group col-sm-6">
                        <label for="phone"> Phone :</label>
                        <input type="text" class="form-control  input-medium bfh-phone" id="phone" value="${person.phone}" name="phone"  data-format="+33 (d) dd-dd-dd-dd" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>

                </div>
                <div class="form-group form-check">
                    <label class="form-check-label">
                        <input class="form-check-input" type="checkbox" name="remember" required> I agree on terms.
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Check this checkbox to continue.</div>
                    </label>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
        <br/><br/>
        <%@include file="../srcPages/footer.jsp" %>
    </body>
</html>
