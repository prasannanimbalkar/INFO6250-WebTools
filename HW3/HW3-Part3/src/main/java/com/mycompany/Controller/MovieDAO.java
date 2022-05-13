/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author prasannanimbalkar
 */
public class MovieDAO {
      private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;

    public MovieDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }

    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(
                    jdbcURL, jdbcUsername, jdbcPassword);
        }
    }

    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }

    public List<Movie> listAllMovies() throws SQLException {
        List<Movie> listMovie = new ArrayList<>();

        String sql = "SELECT * FROM moviesdb.movies";

        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

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

        disconnect();

        return listMovie;
    }

    public boolean insertMovie(Movie movie) throws SQLException {
        String sql = "INSERT INTO moviesdb.movies (title, actor, actress, genre, year) VALUES (?, ?, ?, ?, ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(0, movie.getTitle());
        statement.setString(1, movie.getActor());
        statement.setString(2, movie.getActress());
        statement.setString(3, movie.getGenre());
        statement.setString(4, movie.getYear());

        boolean rowInserted = statement.executeUpdate() > 0;
        System.out.println(rowInserted);
               
        statement.close();
        disconnect();
        return rowInserted;
    }

    public List<Movie> searchMovie(String searchKeyword, String searchBy) throws SQLException {
        List<Movie> listMovie = new ArrayList<>();

        String sql = "SELECT * FROM moviesdb.movies WHERE moviesdb.movies." +searchBy +" LIKE '"+searchKeyword +"%'";
        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

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

        disconnect();

        return listMovie;
    }
    
}
