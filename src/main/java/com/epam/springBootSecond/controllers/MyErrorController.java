package com.epam.springBootSecond.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request, Map<String, Object> model) {
        Integer status = (Integer) request.getAttribute("javax.servlet.error.status_code");
        Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
        String error = exception.getMessage();

        model.put("status", status);
        model.put("error", error);

        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
