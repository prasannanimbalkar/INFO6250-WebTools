/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.mycompany.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author prasannanimbalkar
 */
public class Num extends AbstractController {
    
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String num = request.getParameter("amount");
        if(request.getAttribute("unsafe_request") == "true") {
            return new ModelAndView("securityerror");
        }
        int count = Integer.parseInt(num);
        ModelAndView modelAndView = new ModelAndView("bookList","count",count);
        return modelAndView;
    }
}
