package com.ucd.Publication.service;

import com.ucd.Publication.model.Publication;
import com.ucd.Publication.repository.PublicationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;

        public boolean isExist(long id){
            return this.publicationRepository.existsById(id);
        }

        public Iterable<Publication> getAllPubs(){
            return this.publicationRepository.findAll();
        }

        public Publication getPubById(long id){
            return this.publicationRepository.findById(id);
        }

        public Publication getPubByTitle(String title){
            return this.publicationRepository.findByTitle(title);
        }

        public Publication addPub(Publication publication){
            return this.publicationRepository.save(publication);
        }

        public Publication updatePub(Publication publication){
            if(!isExist(publication.getId()))
                return null;
            return this.publicationRepository.save(publication);
        }

        public void deletePub(long id){
            this.publicationRepository.deleteById(id);
        }
}
