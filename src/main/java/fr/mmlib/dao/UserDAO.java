package fr.mmlib.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.mmlib.entities.User;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {
		  
	User findByUserID(String userID);

	}



