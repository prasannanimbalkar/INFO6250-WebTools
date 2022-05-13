/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.DAO.BooksDao;
import com.mycompany.pojo.Book;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author prasannanimbalkar
 */
public class AddBooks extends AbstractController {
    
    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
         if(request.getAttribute("unsafe_request") == "true") {
            return new ModelAndView("securityerror");
        }
        int count = Integer.parseInt(request.getParameter("amount"));
        List<String> isbn = new ArrayList<>();
        List<String> title = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        List<Float> prices = new ArrayList<>();
        List<Book>  books = new ArrayList<>();
        System.out.println(count);

        for(int i = 0 ; i < count; i++){
            isbn.add(request.getParameter("isbn" +String.valueOf(i)));
            title.add(request.getParameter("title" + String.valueOf(i)));
            authors.add(request.getParameter("authors" + String.valueOf(i)));
            prices.add(Float.parseFloat(request.getParameter("price" + i)));
            books.add(new Book(isbn.get(i),title.get(i),authors.get(i),prices.get(i)));
        }

        int res = 0;
//        System.out.println(BooksDao);
        res = BooksDao.addBook(isbn,title,authors,prices);
        System.out.println(res);
        ModelAndView modelAndView = new ModelAndView();
        if(res > 0){
            modelAndView = new ModelAndView("addBookSuccessfully","books",books);
        }
        return modelAndView;
    }
    
}
