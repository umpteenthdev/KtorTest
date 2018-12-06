package com.tehreh1uneh.ktortest

import android.util.Log
import com.tehreh1uneh.ktortest.MainActivity.Companion.BASE_TAG
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.logging.DEFAULT
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.logging.Logger
import io.ktor.client.features.logging.Logging
import io.ktor.client.request.get

private const val SF_WEATHER_URL = "https://www.metaweather.com/api/location/2487956/"

suspend fun getAndPrintWeather() {

    val client = HttpClient(Android) {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }

        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.ALL
        }

        expectSuccess = true
    }
    val weather: Weather = client.get(SF_WEATHER_URL)
    Log.i("$BASE_TAG Serialization", weather.toString())
}
