package com.jdr.martMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.User;
import com.jdr.martMicroservice.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired UserRepository userRepository;
	@Override
	public User delete() {
		userRepository.delete();
		return null;
	}

	@Override
	public User update() {
		userRepository.update();
		return null;
	}

	@Override
	public User add() {
		userRepository.add();
		return null;
	}

	@Override
	public User get() {
		userRepository.get();
		return null;
	}

}
