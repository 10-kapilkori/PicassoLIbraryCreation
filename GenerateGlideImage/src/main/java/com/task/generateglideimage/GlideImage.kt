package com.task.generateglideimage

import android.content.Context
import android.widget.ImageView
import com.task.picassolibrarycreation.GenerateImage

object GlideImage {
    fun generateImage(context: Context, imageToLoad: String, iv: ImageView) {
        GenerateImage.loadImage(context, imageToLoad, iv)
    }
}