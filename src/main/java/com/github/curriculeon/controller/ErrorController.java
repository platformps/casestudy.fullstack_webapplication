package com.github.curriculeon.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller("error")
public class ErrorController {
    public ModelAndView handleException(HttpServletRequest request, Exception ex){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("exception", ex.getLocalizedMessage());
        modelAndView.addObject("url", request.getRequestURL());

        modelAndView.setViewName("error");

        return modelAndView;
    }

}
