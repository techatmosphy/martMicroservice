package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jdr.martMicroservice.entity.User;
import com.jdr.martMicroservice.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired UserRepository userRepository;
	@Override
	public User addUser(@RequestBody User user ) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public User updateUser(@RequestBody User user) {
		return userRepository.save(user);
	}

}
