package com.example.viagemja.utils

import com.example.viagemja.data.remote.model.EstimateModel

public fun generateLeafletMapHtml(locations : List<EstimateModel>): String {
    val markers = locations.joinToString(separator = ",") { location ->
        "L.marker([${location.latitude}, ${location.longitude}]).addTo(map).bindPopup('${location.name}');"
    }

    return """
        <!DOCTYPE html>
        <html>
        <head>
            <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
            <link rel="stylesheet" href="https://unpkg.com/leaflet@1.9.4/dist/leaflet.css" />
            <script src="https://unpkg.com/leaflet@1.9.4/dist/leaflet.js"></script>
            <style>
                body, html { 
                    margin: 0; 
                    padding: 0; 
                    height: 100%; 
                    width: 100%; 
                }
                #map { 
                    height: 100%; 
                    width: 100%; 
                    position: absolute; 
                    top: 0; 
                    left: 0; 
                }
            </style>
        </head>
        <body>
            <div id="map"></div>
            <script>
                var map = L.map('map').setView([${locations[0].latitude}, ${locations[0].longitude}], 13);
                L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
                    maxZoom: 19,
                    attribution: '© OpenStreetMap contributors'
                }).addTo(map);
                $markers
            </script>
        </body>
        </html>
    """.trimIndent()
}