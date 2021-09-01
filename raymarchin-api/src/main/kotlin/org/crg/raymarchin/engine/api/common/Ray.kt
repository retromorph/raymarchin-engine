package org.crg.raymarchin.engine.api.common

class Ray {
    val reflections = mutableListOf<Coordinates>()
    var reflectionsCount = 0
        private set

    fun addReflection(coordinates: Coordinates) {
        reflections.add(coordinates)
        reflectionsCount += 1
    }
}