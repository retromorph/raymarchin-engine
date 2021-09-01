package org.crg.raymarchin.engine.api.render.dto

import org.crg.raymarchin.engine.api.common.Coordinates

import java.awt.Color

/**
 * Dto для передачи информации для отрисовки точки
 *
 * @param brightness яркость (от 0 до 1)
 * @param color цвет
 * @param coordinates координаты точки
 */
data class RenderDto(val brightness: Float, val color: Color, val coordinates: Coordinates)
