<%-- 
    Document   : MapsDoc
    Created on : 17 mai 2019, 12:58:00
    Author     : 33616
--%>

<%@page import="java.util.List"%>
<%@page import="fr.utbm.docfinder.entity.Speciality"%>
<%@page import="fr.utbm.docfinder.entity.Doctor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../srcPages/datatables-css.jsp" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css"
              integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ=="
              crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js"
                integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og=="
        crossorigin=""></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
        <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css" />
        <link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500">

        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../srcPages/navbar-auth.jsp" %>

        <% List<Doctor> ListDoc = (List<Doctor>) request.getAttribute("ListDoc");
           if(request.getAttribute("reservationOk") != null){
        %>
       <div class="alert alert-success alert-dismissible">
            <a href="#" class="" data-dismiss="alert" aria-label="">&times;</a>
            <strong>reservation is registred!</strong> you will get the confirmation from the doctor as soon as possible.
        </div>
        <%
        }
        %>
        <div class="container">
            <div class="jumbotron">
                <form action="/specToDoc" class="was-validated" method="post">

                    <div class="col-md-6"  style="float:left">
                        <div class="">
                            <div class="form-group col-md-12">
                                <label class="col-md-4 control-label" for="daterange">periode </label>  
                                <input id="daterange" name="datetimes" type="text" placeholder="" class="form-control col-md-8" required="">
                            </div>
                            <script>
                                var startDate = moment().startOf('hour');
                                var endDate = moment().startOf('hour').add(32, 'hours');
                                var diffDate = moment(endDate).diff(moment(startDate),'hours');
                                var tarif = 20;
                                $(function () {
                                    $('input[name="datetimes"]').daterangepicker({
                                        timePicker: true,
                                        startDate: startDate,
                                        endDate: endDate,
                                        locale: {
                                            format: 'DD/M HH:mm'
                                        }
                                    });
                                });
                                function updateDate() {
                                    startDate = moment($('#daterange').data('daterangepicker').startDate).format('DD/M HH:mm');
                                    endDate = moment($('#daterange').data('daterangepicker').endDate).format('DD/M HH:mm');
                                    diffDate = moment(endtDate).diff(moment(startDate),'hours');
                                }

                            </script>
                        </div>
                        <div class="form-group col-md-12">

                            <label class="col-md-4 control-label" for="allspecs">Speciality:</label>          
                            <select class="form-control col-md-8" name="allspecs">
                                <c:forEach items="${listAllSpec}" var="allspec">
                                    <option value="${allspec.id}">${allspec.name}</option>        
                                </c:forEach>
                            </select>
                            <br>    
                            <button onclick="updateDate()" class="col-md-2 btn btn-info">search</button>
                        </div>
                    </div>
                    <div class="col-md-6"  style=" float: right">
                        <div id="mapid" style=" height: 500px; width: 500px"></div>
                    </div>
                    <br> <br>

                </form>

                <script>
                    var markers = [
                    <c:forEach var="doc" items="${ListDoc}">
                        ['<c:out value="${doc.firstName}" />',
                                '<c:out value="${doc.lastName}" />'],

                    </c:forEach>];

                    //for end        
                    var mymap = L.map('mapid').setView([47.635184, 6.860635], 12);
                    L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token={accessToken}', {
                        attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, <a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
                        maxZoom: 18,
                        id: 'mapbox.streets',
                        accessToken: 'pk.eyJ1Ijoia2hhbGlkOTciLCJhIjoiY2p2cno3N2l2MHowZjQ5b3o2NDBpZXNweiJ9.fsqkDeHJy8T2PcoRuhdl7g'
                    }).addTo(mymap);
                    var layerGroup;
                    <c:forEach var="doc" items="${ListDoc}">
                    var min = 1;
                    var max = 10;
                    var random1 = Math.floor(Math.random() * (+max - +min)) + +min;
                    var random2 = Math.floor(Math.random() * (+max - +min)) + +min;
                    var lat = '<c:out value="${doc.lat}" />';
                    var lng = '<c:out value="${doc.lng}" />';
                    var specialities = '';

                        <c:forEach var="spec" items="${doc.specialities}">
                    specialities += '<c:out value="${spec.name}" />' + ',';
                        </c:forEach>;
                    var marker = new L.marker([lat, lng]).addTo(mymap);

                    var descDoc = "<b>Nom '<c:out value="${doc.firstName}" />'!</b><br>desc : " + '<c:out value="${doc.descs}" />' + "<br>specialities:" + specialities + "<br>adresse : '<c:out value="${doc.address}" />'."
                    marker.bindPopup(descDoc);
                    </c:forEach>;
                    var popup = L.popup();

                    function onMapClick(e) {
                        popup
                                .setLatLng(e.latlng)
                                .setContent("You clicked the map at " + e.latlng.toString())
                                .openOn(mymap);
                    }

                    mymap.on('click', onMapClick);
                    function test() {
                        console.log(moment($('#daterange').data('daterangepicker').startDate).format('DD/M HH:mm'));
                    };
                              
                                

                </script>
                <div class="" style="">
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
                                    <td><button type="button" onclick="test()" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal_${doc.id}">
                                            <span class="glyphicon glyphicon-minus-sign">reserve</span></button></td></tr>




                            </c:forEach>
                        </tbody>
                    </table>
                </div>

            </div>
        </div>
        <!-- Trigger the modal with a button -->
        
        <!-- Modal -->
        <c:forEach items="${ListDoc}" var="doc">

            <div id="myModal_${doc.id}" class="modal fade" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title text-center">you want reserve Dr.${doc.lastName} ?</h4>
                        </div>
                        <form action="../Reservation" class="was-validated" method="post" >

                        <div class="modal-body">
                            <p>reservation:</p>
                            <p>begins :<script>document.write(startDate);</script></p>
                            <p>end    :<script>document.write(endDate);</script></p>
                            <p>cost per hour : <script>document.write(tarif + ' € ');</script><p> 
                            <p>total : <script>document.write(tarif + 'x' + diffDate + ' = '  );</script> 
                                <span class="badge"> <script>document.write(tarif * diffDate + ' € ');</script> </span>
                            <p> 
    
                                <input type="hidden" class="form-control" id="DOCTOR_ID" value="${doc.id}" name="DOCTOR_ID" >
                                <input type="hidden" class="form-control" id="ENDTIME_${doc.id}" value="" name="ENDTIME" >
                                <input type="hidden" class="form-control" id="STARTTIME_${doc.id}" value="B" name="STARTTIME" >
                                <input type="hidden" class="form-control" id="RDVDATE_${doc.id}" value="C" name="RDVDATE" >
                                <input type="hidden" class="form-control" id="TARIF_${doc.id}" value="0" name="TARIF" >
                             
                                <script>
                                (function(){
                                console.log("TARIF_<c:out value="${doc.id}" />");
 
                                document.getElementById("TARIF_<c:out value="${doc.id}" />").value=tarif*diffDate;
                                document.getElementById("ENDTIME_<c:out value="${doc.id}" />").value=endDate.format('YYYY-MM-DD HH:mm:ss');
                                document.getElementById("STARTTIME_<c:out value="${doc.id}" />").value=startDate.format('YYYY-MM-DD HH:mm:ss');
                                document.getElementById("RDVDATE_<c:out value="${doc.id}" />").value= moment().format('YYYY-MM-DD HH:mm:ss');
                                })();


                                </script>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            <input type="submit" class="btn btn-primary" value="pay and reserve">

                        </div>
                        </form>
                    </div>

                </div>
            </div>
        </c:forEach>

    </body>


</html>
