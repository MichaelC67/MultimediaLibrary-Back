package fr.mmlib.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.mmlib.entities.Library;


@Repository
public interface LibraryDAO extends CrudRepository<Library, Long> {
		  
	}