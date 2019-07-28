package org.rakesh.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.rakesh.entity.User;
import org.rakesh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

	
	private final UserRepository userRepo;
	
	
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}


	public void saveUser(User user) {
		userRepo.save(user);
	}


	public List<User> showUser() {
		List <User> list = new ArrayList<>();
		for(User user: userRepo.findAll()) {
			list.add(user);
		}	
		return list;
	}
	
	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}


	public User editUser(int id) {
		Optional<User> opUser = userRepo.findById(id);
			return opUser.get(); 
	}

	public User findByUserNamePassword(String userName, String password) {
		User uu = userRepo.findByUserNameAndPassword(userName, password);
		System.out.println("Service --- " + uu);
		return uu;
	}
	
	
}
