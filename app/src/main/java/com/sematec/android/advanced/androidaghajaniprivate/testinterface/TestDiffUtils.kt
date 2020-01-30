package com.sematec.android.advanced.androidaghajaniprivate.testinterface

import androidx.recyclerview.widget.DiffUtil

class TestDiffUtils : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String) = oldItem == newItem

    override fun areContentsTheSame(oldItem: String, newItem: String) = oldItem == newItem
}