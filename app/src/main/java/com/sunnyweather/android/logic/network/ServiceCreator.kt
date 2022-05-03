package com.sunnyweather.android.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {

    private const val BASE_URL = "http://api.caiyunapp.com/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    //泛型方法的形式
    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

    //泛型实化的形式
    inline fun <reified T> create(): T = create(T::class.java)

}