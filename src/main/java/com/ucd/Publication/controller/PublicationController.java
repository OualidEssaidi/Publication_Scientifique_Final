package com.ucd.Publication.controller;

import com.ucd.Publication.model.Publication;
import com.ucd.Publication.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/publication")
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    @GetMapping("/all")
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
    }

    @PutMapping("/add")
    public ResponseEntity<Void> addCustomer(@RequestBody Publication newPub){
        Publication Pub = this.publicationService.addPub(newPub);
        if(Pub == null) return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromPath("/publication")
                .path("/id/{id}")
                .buildAndExpand(Pub.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PatchMapping("/update")
    public ResponseEntity<Void> updateUser(@RequestBody Publication Pub){
        Publication publication = this.publicationService.updatePub(Pub);
        if(publication == null) return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromPath("/customer")
                .path("/id/{id}")
                .buildAndExpand(publication.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
