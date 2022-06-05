package com.zhandos.myapplication.feature_stock.domain.model


data class Stock(
    val name: String,
    val symbol: String,
    val price: String,
    val change: String,
    val favourite: Boolean)