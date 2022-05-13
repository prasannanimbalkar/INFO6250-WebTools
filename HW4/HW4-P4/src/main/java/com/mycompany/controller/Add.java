/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.DAO.MovieDao;
import com.mycompany.pojo.Movie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author prasannanimbalkar
 */
public class Add extends AbstractController {

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String title = request.getParameter("title");
        String actor = request.getParameter("actor");
        String actress = request.getParameter("actress");
        String genre = request.getParameter("genre");
        String year = request.getParameter("year");
        if (request.getAttribute("unsafe_request") == "true") {
            return new ModelAndView("securityerror");
        }
        int res = MovieDao.addMovie(title, actor, actress, genre, Integer.parseInt(year));
        ModelAndView modelAndView = null;
        if (res == 1) {
            Movie movie = new Movie(title, actor, actress, genre, Integer.parseInt(year));
            modelAndView = new ModelAndView("addSuccessfully", "Movie", movie);
        } else {
            modelAndView = new ModelAndView("error");

        }
        return modelAndView;
    }

}
