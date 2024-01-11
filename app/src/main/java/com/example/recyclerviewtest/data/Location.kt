package com.example.recyclerviewtest.data

data class Location(
    var id: Int,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val timestamp: Long
)

fun createRealJejuLocationData(): List<Location> {
    val jejuLocations = listOf(
        Location(1, "제주대학교", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(2, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(3, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(4, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(5, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(6, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(7, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(8, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(9, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(10, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(11, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(12, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(13, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(14, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(15, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(16, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(17, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(18, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(19, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(20, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(21, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(22, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(23, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(24, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(25, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(26, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(27, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(28, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(29, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(30, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(31, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(32, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(33, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(34, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(35, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(36, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(37, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(38, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(39, "testLocation", 33.11111, 33.22222, System.currentTimeMillis()),
        Location(40, "testLocation", 33.11111, 33.22222, System.currentTimeMillis())
    )
    return jejuLocations
}