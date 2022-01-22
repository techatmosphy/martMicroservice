package com.jdr.martMicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdr.martMicroservice.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
