package com.ucd.Publication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
    @RequestMapping(value = "/pub")
    public String home(Model model){
        return "home";
    }
}