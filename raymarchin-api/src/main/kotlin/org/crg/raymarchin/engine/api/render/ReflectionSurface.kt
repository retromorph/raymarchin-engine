package org.crg.raymarchin.engine.api.render

import org.crg.raymarchin.engine.common.Ray

/**
 * Интерфейс для видимых объектов
 */
interface ReflectionSurface {
    fun reflect(ray: Ray)
}