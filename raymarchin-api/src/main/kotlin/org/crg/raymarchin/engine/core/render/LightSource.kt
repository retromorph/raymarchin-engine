package org.crg.raymarchin.engine.core.render

import org.crg.raymarchin.engine.api.render.Ray
import org.crg.raymarchin.engine.dto.RenderDto
import org.crg.raymarchin.engine.api.render.RayConsumer

import kotlin.math.pow
import kotlin.streams.toList

import java.util.concurrent.atomic.AtomicInteger

class LightSource: RayConsumer {
    override fun getRenderedRay(ray: Ray): List<RenderDto> {
        val prevIndex = AtomicInteger(1)
        return ray.reflections.stream()
            .map {
                val dto = RenderDto(1 / 2.0.pow(ray.reflectionsCount - prevIndex.get()),
                    it.color, it.coordinates)
                prevIndex.set(prevIndex.get() + 1)
                return@map dto
            }
            .toList()
    }
}