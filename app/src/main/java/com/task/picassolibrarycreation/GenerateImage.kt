package com.task.picassolibrarycreation

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object GenerateImage {

    fun loadImage(context: Context, imageToLoad: String, viewId: ImageView) {
        Glide.with(context)
            .load(imageToLoad)
            .into(viewId)
    }
}