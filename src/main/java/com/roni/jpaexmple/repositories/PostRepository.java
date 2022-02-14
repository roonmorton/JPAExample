/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roni.jpaexmple.repositories;

import com.roni.jpaexmple.models.Post;
import com.roni.jpaexmple.models.PostResponse;
import com.roni.jpaexmple.util.EntityManagerUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author ron
 */
public class PostRepository {
    
    private EntityManager em;
    
    
    public PostRepository(){
        em = EntityManagerUtil.getEntityManager();
    }
    
    public void crear(Post post){
        em.getTransaction().begin();
        em.persist(post);
        em.getTransaction().commit();
    }
    
    public void addAll(List<PostResponse> posts ){
        em.getTransaction().begin();
        posts.forEach(post -> {
            //Post p = new Post(post.id, post.userId, post.title, post.body);
            /*p.setCuerpo(post.body);
            p.setTitulo(post.title);
            p.setUserId(post.userId);*/
            em.persist(new Post(post.id, post.userId, post.title, post.body));
        });
        em.getTransaction().commit();
    }
    
}
