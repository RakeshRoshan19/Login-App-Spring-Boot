package org.rakesh.repository;

import org.rakesh.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByUserNameAndPassword(String userName, String password);
	
}
