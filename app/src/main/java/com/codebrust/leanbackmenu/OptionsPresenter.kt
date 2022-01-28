package com.codebrust.leanbackmenu

import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter

class OptionsPresenter:Presenter() {

    override fun onCreateViewHolder(parent: ViewGroup?): Presenter.ViewHolder {
        val imageCardView: ImageCardView = object : ImageCardView(parent!!.context) {
            override fun setSelected(selected: Boolean) {
                this.setBackgroundColor(ContextCompat.getColor(parent!!.context,android.R.color.holo_orange_dark))
                super.setSelected(selected)
            }
        }

        imageCardView.isFocusable = true
        imageCardView.isFocusableInTouchMode = true
        return Presenter.ViewHolder(imageCardView)

    }

    override fun onBindViewHolder(viewHolder: Presenter.ViewHolder?, item: Any?) {
        var card = item as Card
        var imageCardView: ImageCardView = viewHolder?.view as ImageCardView;
        imageCardView.titleText = card.title
        imageCardView.contentText = card.description
        var res = imageCardView.resources;
        imageCardView.setMainImage(res.getDrawable(R.drawable.cute_girl))
    }

    override fun onUnbindViewHolder(viewHolder: Presenter.ViewHolder?) {

    }
}