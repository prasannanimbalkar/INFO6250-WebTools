/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author prasannanimbalkar
 */
public class MovieServlet extends HttpServlet{
    
     private MovieDAO movieDAO;

    public void init() {
        movieDAO = new MovieDAO("jdbc:mysql://localhost/moviesdb", "root", "Prasanna@1996");

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGetReq(request, response);
    }

    protected Statement connect() throws SQLException {
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/moviesdb", "root", "Prasanna@1996");
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException: " + ex.getMessage());
        }
        return st;
    }

    public List<Movie> listAllBooks() throws SQLException {
        List<Movie> listMovie = new ArrayList<>();

        String sql = "SELECT * FROM moviesdb.movies";

        connect();

        Statement statement = connect();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM moviesdb.movies");

        while (resultSet.next()) {
            String title = resultSet.getString("title");
            String actor = resultSet.getString("actor");
            String actress = resultSet.getString("actress");
            String genre = resultSet.getString("genre");
            String year = resultSet.getString("year");

            Movie movie = new Movie(title, actor, actress, genre, year);
            listMovie.add(movie);
        }

        resultSet.close();
        statement.close();

//        disconnect();
        return listMovie;
    }

    protected void doGetReq(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    private void listMovie(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Movie> listMovie = movieDAO.listAllMovies();
        request.setAttribute("listMovie", listMovie);
        RequestDispatcher dispatcher = request.getRequestDispatcher("MovieList.jsp");
        dispatcher.forward(request, response);

    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("MovieForm.jsp");
        dispatcher.forward(request, response);
    }

    private void insertMovie(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String title = request.getParameter("title");
        String actor = request.getParameter("actor");
        String actress = request.getParameter("actress");
        String genre = request.getParameter("genre");
        String year = request.getParameter("year");

        Movie newMovie = new Movie(title, actor, actress, genre, year);
        movieDAO.insertMovie(newMovie);
        response.sendRedirect("list");
    }

    private void showSearchMovieForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("BrowseMovies.jsp");
        dispatcher.forward(request, response);
    }

    private void searchMovie(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        try {
            String searchKeyword = request.getParameter("keyword");
            String searchBy = request.getParameter("radio1");
            
            List<Movie> listMovie = movieDAO.searchMovie(searchKeyword, searchBy);
            request.setAttribute("listMovie", listMovie);
            RequestDispatcher dispatcher = request.getRequestDispatcher("MovieList.jsp");
            dispatcher.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(MovieServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
