package com.codebrust.leanbackmenu

import android.content.res.Resources
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter

class CardPresenter:Presenter() {

    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
        val imageCardView: ImageCardView = object : ImageCardView(parent!!.context) {
            override fun setSelected(selected: Boolean) {
                this.setBackgroundColor(ContextCompat.getColor(parent!!.context,android.R.color.holo_orange_dark))
                super.setSelected(selected)
            }
        }

        imageCardView.isFocusable = true
        imageCardView.isFocusableInTouchMode = true
        return ViewHolder(imageCardView)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, item: Any?) {
        var card = item as Card
        var imageCardView:ImageCardView = viewHolder?.view as ImageCardView;
        var res = imageCardView.resources;
        imageCardView.setMainImage(res.getDrawable(R.drawable.cute_girl))
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {

    }
}