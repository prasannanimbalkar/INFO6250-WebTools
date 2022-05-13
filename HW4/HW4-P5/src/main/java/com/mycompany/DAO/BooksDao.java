/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author prasannanimbalkar
 */


public class BooksDao {
      public static int addBook(List<String> isbn, List<String> title, List<String> authors, List<Float> price){
        int result = 0;
        Connection connection = null;
        PreparedStatement ps = null;
        try{
            Dao dbdao = new Dao();
            connection = dbdao.getConnection();
//            QueryRunner queryRunner = new QueryRunner();
            String query = "INSERT INTO books (isbn, title, authors, price) VALUE (?,?,?,?)";
            ps = connection.prepareStatement(query);
            for(int i = 0; i < isbn.size();i++){
                ps.setString(1,isbn.get(i));
                ps.setString(2,title.get(i));
                ps.setString(3,authors.get(i));
                ps.setFloat(4,price.get(i));
                result = ps.executeUpdate();
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
