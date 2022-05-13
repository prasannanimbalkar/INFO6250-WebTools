/**
 *
 * @author prasannanimbalkar
 */

package com.mycompany.controller;

import com.mycompany.service.UserLookUpService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author prasannanimbalkar
 */
public class RegistrationController extends AbstractController {
    
    public RegistrationController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
         UserLookUpService s1 = (UserLookUpService)this.getApplicationContext().getBean("s1");
        
        
       return new ModelAndView("home","s1",s1);
    }
    
}
