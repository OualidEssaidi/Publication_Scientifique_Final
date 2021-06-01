package com.ucd.Publication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
    @RequestMapping(value = "/publication")
    public String home(Model model){
        return "home";
    }
    @RequestMapping(value = "/")
    public String index(Model model){
        return "index";
    }
}
