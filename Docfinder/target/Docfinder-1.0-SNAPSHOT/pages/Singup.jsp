<%-- 
    Document   : SinginClient
    Created on : May 5, 2019, 3:03:32 PM
    Author     : BADELH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../srcPages/bootsrap.html" %>
        <script src="https://cdn.jsdelivr.net/npm/places.js@1.16.4"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sing up</title>
    </head>
    <body>
        <%@include file="../srcPages/navbar.jsp" %>
        <br>
        <div class="container"  style="width : 50%; height : 650px; border-radius: 10px;   box-shadow: 10px 10px grey;
             background-color: gainsboro;">
            <form action="../singup" class="was-validated" method="post">

                <div class="row justify-content-center">
                    <label for="sel1" style="font-weight: bold;">I am a : </label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <div class="form-group">

                        <select class="form-control" name="person">
                            <option value="client">Client</option>
                            <option value="doctor">Doctor</option>                       
                        </select>
                    </div>

                </div>


                <div class="row">
                    <div class="form-group col-sm-6">
                        <label for="fname">Firstname : </label>
                        <input type="text" class="form-control" id="fname" placeholder="Enter firstname" name="fname" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>

                    <div class="form-group col-sm-6">
                        <label for="lname">Lastname : </label>
                        <input type="text" class="form-control" id="lname" placeholder="Enter lastname" name="lname" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>
                </div>

                <div class="row">
                    <div class="form-group col-sm-12">
                        <label for="lname">email : </label>
                        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>

                </div>

                <div class="row">
                    <div class="form-group col-sm-6">
                        <label for="pwd">Password:</label>
                        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>
                    
                    <div class="form-group col-sm-6">
                        <label for="cpwd">Confirm Password :</label>
                        <input type="password" class="form-control" id="cpwd" placeholder="Enter password confirmation" name="cpwd" required>
                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>

                </div>

                <div class="row">
                    <div class="form-group col-sm-6">
                        <label for="adrs"> Address :</label>
                        <input type="search" class="form-control" id="adrs" placeholder="Enter address" name="adrs" required>
                        <input type="hidden" class="hidden" id="lat"  name="lat" required>
                        <input type="hidden" class="hidden" id="lng"  name="lng" required>

                        <div class="valid-feedback">Valid.</div>
                        <div class="invalid-feedback">Please fill out this field.</div>
                    </div>


                    <div class="form-group col-sm-6">
                        <label for="phone"> Phone :</label>
                        <input type="text" class="form-control  input-medium bfh-phone" id="phone" name="phone"  data-format="+33 (d) dd-dd-dd-dd" required>
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

    </body>
    <footer>
        <script>
            const fixedOptions = {
                appId: 'plX1T57M0ZNY',
                apiKey: '32de9f45a005762ec518e1cb03c10df3',
                container: document.querySelector('#adrs')
            };
            const reconfigurableOptions = {
                aroundLatLngViaIP: true
            };
            const placesInstance = places(fixedOptions).configure(reconfigurableOptions);
            placesInstance.on('change', e => {
                let latlng = e.suggestion.latlng
                console.log(latlng);
                document.getElementById("lat").value = latlng.lat;
                document.getElementById("lng").value = latlng.lng;

            });
        </script>
    </footer>
</html>
