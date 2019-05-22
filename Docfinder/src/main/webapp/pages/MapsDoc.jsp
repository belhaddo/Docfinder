<%-- 
    Document   : MapsDoc
    Created on : 17 mai 2019, 12:58:00
    Author     : 33616
--%>

<%@page import="java.util.List"%>
<%@page import="fr.utbm.docfinder.entity.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css"
              integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ=="
              crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js"
                integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og=="
        crossorigin=""></script>
        <link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500">

        <title>JSP Page</title>
    </head>
    <body>
        <% List<Client> ListClient = (List<Client>) request.getAttribute("ListClient");%>


        <h1>Hello World!</h1>
        <div id="mapid" style=" height: 500px; width: 800px"></div>
        <script>
            var markers = [
            <c:forEach var="client" items="${ListClient}">
                ['<c:out value="${client.firstName}" />',
                        '<c:out value="${client.lastName}" />'],

            </c:forEach>];

            //for end        


            console.log(markers);

            var mymap = L.map('mapid').setView([51.505, -0.09], 13);
            L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token={accessToken}', {
                attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, <a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
                maxZoom: 18,
                id: 'mapbox.streets',
                accessToken: 'pk.eyJ1Ijoia2hhbGlkOTciLCJhIjoiY2p2cno3N2l2MHowZjQ5b3o2NDBpZXNweiJ9.fsqkDeHJy8T2PcoRuhdl7g'
            }).addTo(mymap);
            var layerGroup;
            <c:forEach var="client" items="${ListClient}">
            var min = 1;
            var max = 10;
            var random1 = Math.floor(Math.random() * (+max - +min)) + +min;
            var random2 = Math.floor(Math.random() * (+max - +min)) + +min;
            var lat ='<c:out value="${client.lat}" />';
            var lng ='<c:out value="${client.lng}" />';

            
            var marker = new L.marker([lat, lng]).addTo(mymap);
            marker.bindPopup("<b>Hello '<c:out value="${client.firstName}" />'!</b><br>lat : "+lat+"<br>lng:"+lng+"<br>I am a popup in '<c:out value="${client.address}" />'.");

            </c:forEach>;
            var popup = L.popup();

            function onMapClick(e) {
                popup
                        .setLatLng(e.latlng)
                        .setContent("You clicked the map at " + e.latlng.toString())
                        .openOn(mymap);
            }

            mymap.on('click', onMapClick);

        </script>
       
    </body>


</html>
