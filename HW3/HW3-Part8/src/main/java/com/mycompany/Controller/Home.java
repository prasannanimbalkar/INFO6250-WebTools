/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author prasannanimbalkar
 */
public class Home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  private ArrayList<String> books;
    private ArrayList<String> computer;
    private ArrayList<String> music;
    public ArrayList<String> dummy;
    public List cartItem = new ArrayList();

    public void init() {

        books = new ArrayList<String>();
        computer = new ArrayList<String>();
        music = new ArrayList<String>();

        books.add("Java servlet programming [29.95]");
        books.add("Dynamic programming [29.95]");
        books.add("C++ [30.00]");
        books.add("Web tools [25.50]");

        computer.add("Apple MacBook 13 [30.00]");
        computer.add("Sony Vaio 15Series [30.00]");
        computer.add("Hp Pavellion [30.00]");
        computer.add("Alienware Gaming laptop [30.00]");

        music.add("Betels [30.00]");
        music.add("Alan Walker [30.00]");
        music.add("chainsmokers [30.00]");
        music.add("PSY [30.00]");

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            
            HttpSession session = request.getSession(true);
            dummy = new ArrayList<String>();

            String buttonClicked = request.getParameter("choice");
            String x = request.getParameter("check");

            
            if(buttonClicked == null){
                buttonClicked = session.getAttribute("buttonClicked").toString();
            }
            
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
            

                if(x != null){
                for (int i = 0; i < dummy.size(); i++) {
                    if (dummy.get(i).contains(x)) {
                        cartItem.add(dummy.get(i));
                    }
                }
                }

            
            session.setAttribute("visibleArray", dummy);
            session.setAttribute("buttonClicked", buttonClicked);
            session.setAttribute("cartArray", cartItem);
            System.out.print(buttonClicked);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("home");
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException | IOException ex) {
                System.out.println(ex);
            }
        } catch (Exception ex) {

            
            System.out.println(ex);
        }finally {
            request.logout();
            
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        
        String re = request.getParameter("checkDel");
        
        Object cartArray = session.getAttribute("cartArray");
        
        if (cartArray.getClass().isArray()) {
        cartItem = Arrays.asList((Object[])cartArray);
    }
        for(int i=0; i<cartItem.size();i++){
            if(cartItem.get(i).equals(re)){
                cartItem.remove(cartItem.get(i));
            }
        }
        
        System.out.print(cartItem);
        session.setAttribute("cartArray", cartItem);
        
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("cart");
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException | IOException ex) {
                System.out.println(ex);
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
