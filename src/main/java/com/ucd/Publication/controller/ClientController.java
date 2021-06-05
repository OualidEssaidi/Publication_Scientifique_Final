package com.ucd.Publication.controller;

import com.ucd.Publication.model.Publication;
import com.ucd.Publication.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
    @Autowired
    private PublicationService publicationService;

    @RequestMapping(value = "/publication")
    public String home(Model model){
        Iterable<Publication> listePublication = this.publicationService.getAllPubs();
        model.addAttribute("publications", listePublication);

        return "home";
    }
    @RequestMapping(value = "/")
    public String index(Model model){
        return "index";
    }
}
