/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author prasannanimbalkar
 */
@Controller
public class HomeController {

    private ArrayList<String> books;
    private ArrayList<String> computer;
    private ArrayList<String> music;
    public ArrayList<String> dummy;
    public List cartItem = new ArrayList();

    public HomeController() {
        dummy = new ArrayList<String>();
        books = new ArrayList<String>();
        computer = new ArrayList<String>();
        music = new ArrayList<String>();

        books.add("Data Structures [29.95]");
        books.add("Algorithms [29.95]");
        books.add("Design [30.00]");
        books.add("Engineering [25.50]");

        computer.add("MacBook Pro [1000.0]");
        computer.add("AlienWare [999.0]");
        computer.add("Dell xps [1079.99]");
        computer.add("HP Pavilion [799.991]");

        music.add("Alen Walker [100.0]");
        music.add("Maroon 5 [150.50]");
        music.add("Mika Singh [200.10]");
        music.add("Ed Sheran [110.20]");
    }

   

    @RequestMapping(value = "/home.htm", method = RequestMethod.GET)
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(true);
        
        if(dummy != null){
        dummy = new ArrayList<String>();
        }

        String buttonClicked = request.getParameter("choice");
        String cartClicked = request.getParameter("cartClicked");
        String x = request.getParameter("check");
        String deleteRequested = request.getParameter("checkDel");
        if (buttonClicked == null && session.getAttribute("buttonClicked")!=null) {
            buttonClicked = session.getAttribute("buttonClicked").toString();
        }

        if(cartClicked != null){
            session.setAttribute("cartArray", cartItem);
            System.out.print(cartItem);
            return new ModelAndView("cart");
            
        }
        if( deleteRequested != null){
            for(int i=0; i<cartItem.size();i++){
            if(cartItem.get(i).equals(deleteRequested)){
                cartItem.remove(cartItem.get(i));
            }
        }
            return new ModelAndView("cart");
        }
        if (buttonClicked != null) {
            if (buttonClicked.equalsIgnoreCase("Books")) {
                for (int i = 0; i < books.size(); i++) {
                    dummy.add(books.get(i));
                }

            } else if (buttonClicked.equalsIgnoreCase("Music")) {
                for (int i = 0; i < music.size(); i++) {
                    dummy.add(music.get(i));
                }

            } else if (buttonClicked.equalsIgnoreCase("Computer")) {
                for (int i = 0; i < computer.size(); i++) {
                    dummy.add(computer.get(i));
                }

            }
        }

        if (x != null) {
            for (int i = 0; i < dummy.size(); i++) {
                if (dummy.get(i).contains(x)) {
                    cartItem.add(dummy.get(i));
                }
            }
        }

        session.setAttribute("visibleArray", dummy);
        session.setAttribute("buttonClicked", buttonClicked);
        session.setAttribute("cartArray", cartItem);
        System.out.print(cartItem);

        return new ModelAndView("home");
    }

}
