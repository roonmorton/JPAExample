/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roni.jpaexmple.models;

/**
 *
 * @author ron
 */
public class PostResponse {
    
    public int id;
    public int userId;
    public String title;
    public String body;


    public PostResponse(int id, int userId, String title, String body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    
}
