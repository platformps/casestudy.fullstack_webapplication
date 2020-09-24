package com.github.curriculeon.config;

import com.github.curriculeon.utils.Loggable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

/**
 * @author leonhunter
 * @created 06/07/2020 - 4:15 PM
 */
@Component
public class ControllerInterceptor extends HandlerInterceptorAdapter implements Loggable {
    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) {
        log("A request has been issued!");
        String requestLog = "Incoming request is\n\t\t%s";
        String responseLog = "Outgoing response is\n\t\t%s";
        log(requestLog, request);
        log(responseLog, response);
        return true;
    }

    @Override
    public void afterCompletion(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex) {
        log("A request has been completed!");
        String requestLog = "Incoming request is\n\t\t%s";
        String responseLog = "Outgoing response is\n\t\t%s";
        log(requestLog, request);
        log(responseLog, response);
    }
}
