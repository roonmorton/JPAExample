/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roni.jpaexmple.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ron
 */
@Entity
@Table(
        name="CT_POSTS"
)
public class Post {

    @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    private int userId; 
    
    @Column(name="title")
    private String titulo;
    
    
    @Column(name="body")
    private String cuerpo;

    public Post() {
    }

    public Post(int id, int userId, String titulo, String cuerpo) {
        this.id = id;
        this.userId = userId;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    
}
