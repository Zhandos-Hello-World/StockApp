package com.zhandos.myapplication.feature_stock.presentation.stockScreen.adapter

import androidx.recyclerview.widget.DiffUtil
import com.zhandos.myapplication.feature_stock.domain.model.Stock

class StockDiffUtil : DiffUtil.ItemCallback<Stock>() {
    override fun areContentsTheSame(oldItem: Stock, newItem: Stock): Boolean {
        return oldItem == newItem
    }

    override fun areItemsTheSame(oldItem: Stock, newItem: Stock): Boolean {
        return oldItem == newItem
    }
}