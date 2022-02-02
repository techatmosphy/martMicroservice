package com.jdr.martMicroservice.service;
import java.util.List;
import java.util.Optional;

import com.jdr.martMicroservice.entity.User;
public interface UserService {

	User addUser(User user);

	void deleteUser(Long id);

	Optional<User> getUser(Long id);

	List<User> getUsers();

	User updateUser(User user);

}
