package com.sematec.android.advanced.androidaghajaniprivate.testinterface

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sematec.android.advanced.androidaghajaniprivate.R
import kotlinx.android.synthetic.main.test_recycler_item.view.*

class TestAdapter(val clickListener: (String) -> Unit) :
    ListAdapter<String, TestAdapter.TestViewHolder>(TestDiffUtils()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.test_recycler_item, parent, false)
        return TestViewHolder(view)
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    inner class TestViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun onBind(item: String) {
            view.txtTitle.text = item
            view.setOnClickListener {
                clickListener(item)
            }
        }
    }

}