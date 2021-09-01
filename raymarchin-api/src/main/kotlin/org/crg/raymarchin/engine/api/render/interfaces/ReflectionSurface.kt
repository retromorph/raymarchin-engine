package org.crg.raymarchin.engine.api.render.interfaces

import org.crg.raymarchin.engine.api.common.Ray

/**
 * Интерфейс для видимых объектов
 */
interface ReflectionSurface {
    fun reflect(ray: Ray)
}