package com.prox.demokolingst.api

import com.prox.demokolingst.model.Music
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MusicApi {

//    @GET("/posts")
//    suspend fun getPostItem(): List<MyDataItem>

    @GET("bygenre?")
    suspend fun getMusicsByGenres(
        @Query("query") genres: String,
        @Query("offset") offset: Int,
        @Query("country") country: String = "vn"
    ): List<Music>

}