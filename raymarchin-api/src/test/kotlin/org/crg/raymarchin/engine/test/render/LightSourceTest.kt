package org.crg.raymarchin.engine.test.render

import org.crg.raymarchin.engine.api.render.Ray
import org.crg.raymarchin.engine.common.Coordinates
import org.crg.raymarchin.engine.core.render.LightSource
import org.crg.raymarchin.engine.dto.RenderDto

import org.junit.Test
import java.awt.Color
import kotlin.test.assertEquals


class LightSourceTest {
    private val lightSource = LightSource()

    @Test
    fun getRenderedRayTest() {
        val ray = Ray()
        ray.addReflection(Color.getHSBColor(1f, 2f, 3f), Coordinates(1.0, 1.0, 1.0))
        ray.addReflection(Color.getHSBColor(4f, 5f, 6f), Coordinates(1.0, 2.0, 5.0))
        ray.addReflection(Color.getHSBColor(7f, 8f, 9f), Coordinates(1.0, 5.0, 4.0))
        val renderedRays = lightSource.getRenderedRay(ray)
        assertEquals(RenderDto(0.25, Color.getHSBColor(1f, 2f, 3f), Coordinates(1.0, 1.0, 1.0)),
            renderedRays[0])
        assertEquals(RenderDto(0.5, Color.getHSBColor(4f, 5f, 6f), Coordinates(1.0, 2.0, 5.0)),
            renderedRays[1])
        assertEquals(RenderDto(1.0, Color.getHSBColor(7f, 8f, 9f), Coordinates(1.0, 5.0, 4.0)),
            renderedRays[2])
    }
}