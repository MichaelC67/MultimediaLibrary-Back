package fr.mmlib.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.mmlib.entities.Category;

@Repository
public interface CategoryDAO extends CrudRepository<Category, Long> {

}