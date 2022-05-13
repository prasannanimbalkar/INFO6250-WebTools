/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.Utilities.Utilities;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author prasannanimbalkar
 */
@Controller
public class ServiceController {
    
@RequestMapping(value = "/user.htm", method = RequestMethod.GET)
    public String showForm(HttpServletRequest request, Utilities utility2){
        request.setAttribute("u2", utility2);
        return "home";
    }
}
