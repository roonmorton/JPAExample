/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roni.jpaexmple.services;

import com.roni.jpaexmple.interfacesservices.PostInterface;
import com.roni.jpaexmple.util.RetrofitConfig;
import retrofit2.Retrofit;

/**
 *
 * @author ron
 */
public class API {

    private static final String API_PLACEHOLDER = "https://jsonplaceholder.typicode.com/";
    private static final Retrofit retrofit = RetrofitConfig.getRetrofitInstance(API_PLACEHOLDER);

    public static PostInterface getPostInterface(){
        return retrofit.create(PostInterface.class);
    }

}
