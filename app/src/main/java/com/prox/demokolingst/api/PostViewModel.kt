package com.prox.demokolingst.api

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prox.demokolingst.model.Music
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception

class PostViewModel(): ViewModel() {
    val posts = MutableLiveData<List<MyDataItem>>()
    val musics = MutableLiveData<List<Music>>()
    val api = RetrofitInstance.musicApi

    init {
        viewModelScope.launch (Dispatchers.IO){
//            getAllPost()
            getMusic("pop", null, 25)
        }
    }

//    private suspend fun getAllPost(){
//        val res = api.getPostItem()
//        posts.postValue(res)
//    }

    private suspend fun getMusic(genres: String, country: String?, offset: Int = 0){


            if(country == null){
                val res = api.getMusicsByGenres(genres, offset)
                musics.postValue(res)
            }
            else{
                val res = api.getMusicsByGenres(genres, offset)
                musics.postValue(res)
            }


    }
}