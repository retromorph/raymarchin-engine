package org.crg.raymarchin.engine

import org.crg.raymarchin.engine.viewer.Viewer
import java.awt.Color

fun main() {
    val viewer = Viewer { g, context ->
        g.color = Color.BLACK
        g.fillRect(0, 0, context.width, context.height)
    }
}