package fr.mmlib.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.mmlib.entities.Borrow;
import fr.mmlib.entities.User;

@Repository
public interface BorrowDAO extends CrudRepository<Borrow, Long> {

	List<Borrow> findByUser(User user);

}
