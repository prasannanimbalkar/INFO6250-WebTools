/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.DAO.MovieDao;
import com.mycompany.pojo.Movie;
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
public class Browse extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Movie> list = null;
        String search = request.getParameter("search");
        String param = request.getParameter("keyword");
        if (request.getAttribute("unsafe_request") == "true") {
            return new ModelAndView("securityerror");
        }
        System.out.println(search);
        System.out.println(param);
        list = MovieDao.searchMovie(param,search);
        ModelAndView modelAndView = null;
        if (list == null || list.isEmpty()) {
            modelAndView = new ModelAndView("error");
        } else {
            modelAndView = new ModelAndView("browseSuccessfully", "list", list);

        }
        return modelAndView;
    }
    
}
