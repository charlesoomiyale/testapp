package com.example.myapplication.network;

import retrofit2.Retrofit;

public class NRetrofit {

    Retrofit getBuilder(){
        return new Retrofit.Builder()
                .baseUrl("https://newsapi.org/v2")
                .build();
    }
}
