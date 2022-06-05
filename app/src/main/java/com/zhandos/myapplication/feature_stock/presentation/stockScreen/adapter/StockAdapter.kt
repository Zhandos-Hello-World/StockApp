package com.zhandos.myapplication.feature_stock.presentation.stockScreen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.zhandos.myapplication.databinding.ItemStockBinding
import com.zhandos.myapplication.feature_stock.domain.model.Stock

class StockAdapter : ListAdapter<Stock, StockAdapter.StockViewHolder>(StockDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        StockViewHolder.inflate(parent)

    override fun onBindViewHolder(holder: StockViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class StockViewHolder(private val binding: ItemStockBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(stock: Stock) {
            binding.stock = stock
        }

        companion object {
            fun inflate(parent: ViewGroup): StockViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = ItemStockBinding.inflate(inflater, parent, false)
                return StockViewHolder(binding)
            }

        }
    }
}