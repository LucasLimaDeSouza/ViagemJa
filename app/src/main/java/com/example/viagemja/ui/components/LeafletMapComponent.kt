package com.example.viagemja.ui.components

import android.annotation.SuppressLint

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun LeafletMapComponent(
    latitude: Double = -23.5505,
    longitude: Double = -46.6333
) {
    val (mapState, setMapState) = remember { mutableStateOf<MapState>(MapState.Loading) }
    LaunchedEffect(latitude, longitude) {
        try {

            val mapHtml = """
        <!DOCTYPE html>
        <html>
        <head>
            <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
            <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" />
            <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"></script>
            <style>
                body {
                    padding: 0;
                    margin: 0;
                }
                html, body, #map {
                    height: 100%;
                    width: 100vw;
                }
            </style>
        </head>
        <body>
            <div id="map"></div>
            <script>
                var map = L.map('map').setView([${latitude}, ${longitude}], 13);
                
                L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
                    maxZoom: 19,
                    attribution: '© OpenStreetMap contributors'
                }).addTo(map);

                // Adicionar marcador na localização
                L.marker([${latitude}, ${longitude}]).addTo(map)
                    .bindPopup('Localização Atual')
                    .openPopup();
            </script>
        </body>
        </html>
    """.trimIndent()


            setMapState(MapState.Loaded(mapHtml))
        } catch (e: Exception) {
            setMapState(MapState.Error(e.message ?: "Erro ao carregar o mapa"))
        }
    }



    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),

        contentAlignment = Alignment.Center
    ) {
        when (val state = mapState) {
            is MapState.Loading -> {
                CircularProgressIndicator()
            }
            is MapState.Loaded -> {
                AndroidView(
                    modifier = Modifier.fillMaxSize(),
                    factory = { context ->
                        WebView(context).apply {
                            webViewClient = WebViewClient()
                            settings.apply {
                                javaScriptEnabled = true
                                domStorageEnabled = true
                                loadWithOverviewMode = true
                                useWideViewPort = true
                            }
                            loadDataWithBaseURL(null, state.mapHtml, "text/html", "UTF-8", null)
                        }
                    }
                )
            }
            is MapState.Error -> {
                Text(
                    text = state.errorMessage,
                    color = Color.Red,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}
sealed class MapState {
    object Loading : MapState()
    data class Loaded(val mapHtml: String) : MapState()
    data class Error(val errorMessage: String) : MapState()
}
