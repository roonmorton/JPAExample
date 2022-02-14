/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roni.jpaexmple.util;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 *
 * @author ron
 */
public class RetrofitConfig {
    
    public static Retrofit getRetrofitInstance(String url){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        return  new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).client(client).build();
    }
    
}
