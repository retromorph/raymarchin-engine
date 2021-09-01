package org.crg.raymarchin.engine.api.render.interfaces

import org.crg.raymarchin.engine.api.common.Ray
import org.crg.raymarchin.engine.api.render.dto.RenderDto

/**
 * Интерфейс для источников света
 */
interface RayConsumer {
    fun getRenderedRay(ray: Ray): RenderDto
}
