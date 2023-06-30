/*
 * **************
 *  Charty Library : Android
 *
 *  Copyright (c) 2023. Charty Contributor
 * **************
 */

package com.himanshoe.charty.line.config

import androidx.compose.ui.graphics.Color

object LineChartDefaults {

    fun defaultConfig() = LineConfig(
        hasSmoothCurve = true,
        hasDotMarker = true,
        strokeSize = 5F
    )

    fun defaultColor() = LineChartColors(
        lineColor = listOf(
            Color(0xffed625d),
            Color(0xfff79f88)
        ),
        dotColor = listOf(
            Color(0xff50c0a8),
            Color(0xff7a57e3),
        ),
        backgroundColors = listOf(
            Color.White,
            Color.White,
        )
    )
}
