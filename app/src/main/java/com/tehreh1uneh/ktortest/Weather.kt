package com.tehreh1uneh.ktortest

// https://plugins.jetbrains.com/plugin/9960-json-to-kotlin-class-jsontokotlinclass-
data class Weather(
    val consolidated_weather: List<ConsolidatedWeather>,
    val time: String,
    val sun_rise: String,
    val sun_set: String,
    val timezone_name: String,
    val parent: Parent,
    val sources: List<Source>,
    val title: String,
    val location_type: String,
    val woeid: Int,
    val latt_long: String,
    val timezone: String
)

data class Source(
    val title: String,
    val slug: String,
    val url: String,
    val crawl_rate: Int
)

data class ConsolidatedWeather(
    val id: Long,
    val weather_state_name: String,
    val weather_state_abbr: String,
    val wind_direction_compass: String,
    val created: String,
    val applicable_date: String,
    val min_temp: Double,
    val max_temp: Double,
    val the_temp: Double,
    val wind_speed: Double,
    val wind_direction: Double,
    val air_pressure: Double,
    val humidity: Int,
    val visibility: Double,
    val predictability: Int
)

data class Parent(
    val title: String,
    val location_type: String,
    val woeid: Int,
    val latt_long: String
)