package org.crg.raymarchin.engine.core.render

import org.crg.raymarchin.engine.common.Ray
import org.crg.raymarchin.engine.dto.RenderDto
import org.crg.raymarchin.engine.api.render.RayConsumer

import kotlin.math.pow

class LightSource: RayConsumer {
    override fun getRenderedRay(ray: Ray): List<RenderDto> {
        return ray.reflections.stream()
            .map { RenderDto(1 / 2.0.pow(ray.reflectionsCount), it.color, it.coordinates) }
            .toList()
    }
}