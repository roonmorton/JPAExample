/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roni.jpaexmple;

import com.roni.jpaexmple.interfacesservices.PostInterface;
import com.roni.jpaexmple.models.Post;
import com.roni.jpaexmple.models.PostResponse;
import com.roni.jpaexmple.repositories.PostRepository;
import com.roni.jpaexmple.services.API;
import com.roni.jpaexmple.util.EntityManagerUtil;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author ron
 */
public class Main {

    public static void main(String args[]) {
        //EntityManager em = EntityManagerUtil.getEntityManager();
        //System.out.println("Hola mundo");
        //System.out.println("Entity Manager Class ===>" + em.getClass().getCanonicalName());
        /*Post p = new Post();
        p.setCuerpo("Prueba");
        p.setId(new Random().nextInt(1000) + 100000);
        p.setUserId(2);
        p.setTitulo("titulo");
        PostRepository repo = new PostRepository();
        repo.crear(p);
        System.out.println("Post creado");

        PostInterface postApi = API.getPostInterface();

        Call<List<PostResponse>> response = postApi.getAllPosts();*/

        API.getPostInterface().getAllPosts().enqueue(new Callback<List<PostResponse>>() {
            @Override
            public void onResponse(Call<List<PostResponse>> call, Response<List<PostResponse>> response) {
                if (response.isSuccessful()) {
                     PostRepository repo = new PostRepository();
                     repo.addAll(response.body());
                                    System.out.println("Proceso finalizado con exito");
                }
                //throw new UnsupportedOperationException("Not supported yet|."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onFailure(Call<List<PostResponse>> call, Throwable t) {
                call.cancel();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

    }
}
