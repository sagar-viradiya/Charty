/*
 * **************
 *  Charty Library : Android
 *
 *  Copyright (c) 2023. Charty Contributor
 * **************
 */

package com.himanshoe.charty.point.config

import androidx.compose.runtime.Immutable

sealed interface PointType {
    object Fill : PointType

    @Immutable
    data class Stroke(val strokeWidth: Float = 4F) : PointType
}
