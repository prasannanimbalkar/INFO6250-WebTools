/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

import java.util.ArrayList;

/**
 *
 * @author prasannanimbalkar
 */
public class Music {
     private ArrayList<String> music = new ArrayList<String>();

    public Music() {
        music.add("qwerty");
        music.add("ereacd");
        music.add("eqfwvfrw");
        music.add("wrfteg");
        
    }

    
    
    public ArrayList<String> getMusic() {
        return music;
    }

    public void setMusic(ArrayList<String> music) {
        this.music = music;
    }
}
