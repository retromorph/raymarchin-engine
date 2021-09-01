package org.crg.raymarchin.engine.api.render

import org.crg.raymarchin.engine.common.Coordinates
import org.crg.raymarchin.engine.dto.ReflectionDto
import java.awt.Color

class Ray {
    val reflections = mutableListOf<ReflectionDto>()
    var reflectionsCount = 0
        private set

    fun addReflection(coordinates: Coordinates, color: Color) {
        reflections.add(ReflectionDto(coordinates, color))
        reflectionsCount += 1
    }
}