/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbutils.DbUtils;
/**
 *
 * @author prasannanimbalkar
 */
public class Dao {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public Connection connection;

    public Connection getConnection() throws Exception {
        try {

            DbUtils.loadDriver(JDBC_DRIVER);
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviedb", "root", "Prasanna@1996");
        } catch (SQLException ex) {
            System.out.println(ex);
            ex.printStackTrace();
            throw new Exception();
        }

        return this.connection;
    }
}
