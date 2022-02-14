/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roni.jpaexmple.interfacesservices;

import com.roni.jpaexmple.models.PostResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


/**
 *
 * @author ron
 */
public interface PostInterface{
    
    @GET("posts")
    Call<List<PostResponse>> getAllPosts();
    
}
