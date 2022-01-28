package com.codebrust.leanbackmenu

import android.content.Intent
import android.os.Bundle
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.*

class MainFragment:BrowseSupportFragment(){

    lateinit var arrayObjectAdapter:ArrayObjectAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupUIElements();
        setupRowAdapters();

        setOnItemViewClickedListener(object : OnItemViewClickedListener{
            override fun onItemClicked(
                itemViewHolder: Presenter.ViewHolder?,
                item: Any?,
                rowViewHolder: RowPresenter.ViewHolder?,
                row: androidx.leanback.widget.Row?
            ) {
                startActivity(Intent(activity,OptionsActivity::class.java))
            }
        })
    }

    private fun setupUIElements() {
        title = "Menu"
        badgeDrawable = resources.getDrawable(R.drawable.doll_girl,null)
        headersState = HEADERS_DISABLED
        isHeadersTransitionOnBackEnabled = false
        brandColor = resources.getColor(android.R.color.holo_red_dark)
    }


    private fun setupRowAdapters() {
        arrayObjectAdapter = ArrayObjectAdapter(ListRowPresenter())
        var rows = arrayOf(Row("Mytitle", arrayListOf(
            Card("Card 1","Description 1"),
            Card("Card 2","Description 2"),
            Card("Card 3","Description 3"),
            Card("Card 4","Description 4"),
            Card("Card 5","Description 5")
        )
        ))

        for(row in rows){
            arrayObjectAdapter.add(createRow(row))
        }
        adapter = arrayObjectAdapter;
    }

    fun createRow(row:Row):ListRow{
        var rowAdapter:ArrayObjectAdapter = ArrayObjectAdapter(CardPresenter())
        for(card in row.cards){
            rowAdapter.add(card)
        }
        return ListRow(rowAdapter)
    }
}