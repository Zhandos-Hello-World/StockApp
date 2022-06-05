package com.zhandos.myapplication.feature_stock.presentation.stockScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.myapplication.databinding.FragmentStockBinding
import com.zhandos.myapplication.feature_stock.domain.model.Stock
import com.zhandos.myapplication.feature_stock.presentation.stockScreen.adapter.StockAdapter

class StockFragment: Fragment() {
    private var _binding: FragmentStockBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStockBinding.inflate(inflater, container, false)
        val view = binding.root

        val adapter = StockAdapter()
        adapter.submitList(mutableListOf(
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),
            Stock("YNDX", "Yandex, LLC", "4 764,6 ₽", "+55 ₽ (1,15%)", false),

            ))

        binding.listView.adapter = adapter

        binding.lifecycleOwner = this

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}