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
public class Books {
    private ArrayList<String> books = new ArrayList<String>();

    public Books() {
        books.add("Java servlet programming [29.95]");
        books.add("Dynamic programming [29.95]");
        books.add("C++ [30.00]");
        books.add("Web tools [25.50]"); 
    }

    public ArrayList<String> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<String> books) {
        this.books = books;
    }
}
