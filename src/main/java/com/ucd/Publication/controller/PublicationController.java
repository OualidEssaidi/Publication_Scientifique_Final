package com.ucd.Publication.controller;

import com.ucd.Publication.model.Publication;
import com.ucd.Publication.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.net.URI;

@RestController
@RequestMapping("/publication")
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    /*@GetMapping("/all")
    public Iterable<Publication> getAll(){
            Iterable<Publication> liste = this.publicationService.getAllPubs();
        return liste;
    }

    @GetMapping("/id/{id}")
    public Publication getOneById(@PathVariable long id){
        return this.publicationService.getPubById(id);
    }

    @GetMapping("/title/{title}")
    public Publication getOneByTitle(@PathVariable String title){
        return this.publicationService.getPubByTitle(title);
    }*/

    @PostMapping("/add")
    public ModelAndView addCustomer(@ModelAttribute Publication publication){
        Publication Pub = this.publicationService.addPub(publication);
        return new ModelAndView("redirect:/publication");
    }


    @GetMapping("/delete/{id}")
    public ModelAndView deleteEmployee(@PathVariable("id") final int id) {
        publicationService.deletePub(id);
        return new ModelAndView("redirect:/publication");
    }

    /*@PatchMapping("/update")
    public ResponseEntity<Void> updateUser(@RequestBody Publication Pub){
        Publication publication = this.publicationService.updatePub(Pub);
        if(publication == null) return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromPath("/customer")
                .path("/id/{id}")
                .buildAndExpand(publication.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }*/
}
