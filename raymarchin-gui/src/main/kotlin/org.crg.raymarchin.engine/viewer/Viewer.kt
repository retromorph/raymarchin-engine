package org.crg.raymarchin.engine.viewer

import java.awt.BorderLayout
import java.awt.Container
import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JSlider
import javax.swing.SwingConstants

class Viewer(renderer: (Graphics, JPanel) -> Unit) {
    private var frame: JFrame

    init {
        frame = initFrame()

        // forward render variables to renderer
        initRender { g, context ->
            renderer(g, context)
        }
    }

    private fun initFrame(): JFrame {
        val frame = JFrame()
        frame.isVisible = true
        frame.extendedState = JFrame.MAXIMIZED_BOTH

        return frame
    }

    private fun initRender(renderer: (Graphics, JPanel) -> Unit) {
        val pane: Container = frame.contentPane
        pane.layout = BorderLayout()

        // slider to control horizontal rotation
        val headingSlider = JSlider(0, 360, 180)
        pane.add(headingSlider, BorderLayout.SOUTH)

        // slider to control vertical rotation
        val pitchSlider = JSlider(SwingConstants.VERTICAL, -90, 90, 0)
        pane.add(pitchSlider, BorderLayout.EAST)

        // panel to display render results
        val renderPanel: JPanel = object : JPanel() {
            override fun paintComponent(g: Graphics) = renderer(g, this)
        }

        pane.add(renderPanel, BorderLayout.CENTER)
    }
}