package com.codebrust.leanbackmenu

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.leanback.widget.FocusHighlight
import androidx.leanback.widget.VerticalGridPresenter

class OptionsActivity : FragmentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)
    }
}