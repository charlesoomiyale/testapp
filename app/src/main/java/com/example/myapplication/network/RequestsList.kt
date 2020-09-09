package com.example.myapplication.network

import com.example.myapplication.models.NewsItem
import com.example.myapplication.models.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface RequestsList {
    @GET("top-headlines")
    fun  getNews(@Query("country") country: String,
                 @Query("apiKey") apiKey: String):Response;

}