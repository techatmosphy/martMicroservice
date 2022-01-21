package com.jdr.martMicroservice.service;

import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.User;
public interface UserService {

	User add();

	User delete();

	User get();

	User update();

}
