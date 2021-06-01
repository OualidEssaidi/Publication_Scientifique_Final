package com.ucd.Publication.repository;

import com.ucd.Publication.model.Publication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends CrudRepository<Publication, Long> {
    Publication findById(long id);
    Publication findByTitle(String title);
}
