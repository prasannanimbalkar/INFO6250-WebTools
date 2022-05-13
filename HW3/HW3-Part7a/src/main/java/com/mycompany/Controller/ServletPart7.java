/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.Controller;

import com.mycompany.DAO.BookDao;
import com.mycompany.pojo.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class ServletPart7 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        PrintWriter out = response.getWriter();

//        String option = request.getParameter("option");
//        if(option.equalsIgnoreCase("add")){
        Book bookData = new Book();
        String amount = request.getParameter("amount");
        int count = Integer.parseInt(amount);
        List<String> isbn = new ArrayList<>();
        List<String> title = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        List<Float> price = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            isbn.add(request.getParameter("isbn" + i)); //String.valueOf
            title.add(request.getParameter("title" + i));
            authors.add(request.getParameter("authors" + i));
            price.add(Float.parseFloat(request.getParameter("price" + i)));
        }

        BookDao bookObj = new BookDao();
        int result = bookObj.addBook(isbn, title, authors, price);

        request.setAttribute("count", count);
        requestDispatcher = getServletContext().getRequestDispatcher("/addBookSuccessfully.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String optionValue = request.getParameter("option");
        HttpSession session = request.getSession();
    }

}
