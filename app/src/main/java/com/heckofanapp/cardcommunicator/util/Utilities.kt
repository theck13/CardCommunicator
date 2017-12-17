package com.heckofanapp.cardcommunicator.util

import android.content.Context
import android.view.Surface
import android.view.View
import android.view.WindowManager

object Utilities {
    fun getHeightNavigationBar(context: Context): Int {
        val resourceId = context.resources.getIdentifier("navigation_bar_height", "dimen", "android")
        return if (resourceId > 0) context.resources.getDimensionPixelSize(resourceId) else 0
    }

    fun getHeightStatusBar(context: Context): Int {
        val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId > 0) context.resources.getDimensionPixelSize(resourceId) else 0
    }

    fun setNavigationBarAndStatusBarPadding(layout: View, context: Context) {
        when ((context.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay.rotation) {
            Surface.ROTATION_0,
            Surface.ROTATION_180 -> {
                layout.setPadding(0, Utilities.getHeightStatusBar(context), 0, Utilities.getHeightNavigationBar(context))
            }

            Surface.ROTATION_90,
            Surface.ROTATION_270 -> {
                layout.setPadding(0, Utilities.getHeightStatusBar(context), Utilities.getHeightNavigationBar(context), 0)
            }
        }
    }
}
