package com.example.listycity3
import androidx.compose.runtime.mutableStateListOf

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    fun addCity(city: City) {
        _cities.add(city)
    }

    fun editCity(old: City, updated: City) {
        val index = _cities.indexOf(old)
        if (index != -1) {
            _cities[index] = updated
        }
    }

    val cities: List<City>
        get() = _cities
}