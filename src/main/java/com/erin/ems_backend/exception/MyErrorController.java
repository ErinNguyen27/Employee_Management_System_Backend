package com.erin.ems_backend.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController {
    private final static String PATH = "/error";

    @RequestMapping(PATH)
    @ResponseBody
    public String getErrorPath() {
        return "No Mapping Found";
    }
}