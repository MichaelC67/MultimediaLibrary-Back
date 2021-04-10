package fr.mmlib.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.mmlib.entities.Item;

@Repository
public interface ItemDAO extends CrudRepository<Item, Long> {

	List<Item> findByItemType(String produitType);

}
