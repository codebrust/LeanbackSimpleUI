package com.codebrust.leanbackmenu

import android.os.Bundle
import androidx.leanback.app.VerticalGridSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.FocusHighlight
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.VerticalGridPresenter

class OptionsFragment: VerticalGridSupportFragment() {

    lateinit var mAdapter: ArrayObjectAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Options")
        setupRowAdapter();
    }

    fun setupRowAdapter(){
        var mGridPresenter= VerticalGridPresenter(
            FocusHighlight.ZOOM_FACTOR_MEDIUM
        )
        mGridPresenter.numberOfColumns=4;
        gridPresenter = mGridPresenter


        var presenter:Presenter = OptionsPresenter();
        mAdapter = ArrayObjectAdapter(presenter)
        adapter = mAdapter;

        createRows();
    }

    private fun createRows() {
        var row:Row = Row("Mytitle", arrayListOf(
        Card("Card 1","Description 1"),
        Card("Card 2","Description 2"),
        Card("Card 3","Description 3"),
        Card("Card 4","Description 4"),
        Card("Card 5","Description 5")
        ))
        mAdapter.addAll(0,row.cards)
    }
}