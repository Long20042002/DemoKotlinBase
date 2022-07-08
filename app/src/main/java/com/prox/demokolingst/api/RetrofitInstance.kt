package com.prox.demokolingst.api

import com.prox.demokolingst.api.CmmVariable.Companion.BASE_URL
import com.prox.demokolingst.api.CmmVariable.Companion.BASE_URL_MUSIC
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL_MUSIC)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val musicApi : MusicApi by lazy {
        retrofit.create(MusicApi::class.java)
    }
}