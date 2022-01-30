package com.jdr.martMicroservice.service;
import java.util.List;
import java.util.Optional;
import com.jdr.martMicroservice.entity.User;
public interface UserService {

	List<User> getUsers();

	User addUser(User user);

	User updateUser(User user);

	Optional<User> getUser(Long id);

	void deleteUser(Long id);

}
