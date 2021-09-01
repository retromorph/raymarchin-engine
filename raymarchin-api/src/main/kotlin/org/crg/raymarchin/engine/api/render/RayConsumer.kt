package org.crg.raymarchin.engine.api.render

import org.crg.raymarchin.engine.dto.RenderDto

/**
 * Интерфейс для источников света
 */
interface RayConsumer {
    fun getRenderedRay(ray: Ray): List<RenderDto>
}
