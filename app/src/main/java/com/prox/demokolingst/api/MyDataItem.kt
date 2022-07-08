package com.prox.demokolingst.api

import com.google.gson.annotations.SerializedName

data class MyDataItem(
    @SerializedName("userID")
    val userId: Int,
    val body: String,
    val id: Int,
    val title: String
)