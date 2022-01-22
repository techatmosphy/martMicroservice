package com.jdr.martMicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdr.martMicroservice.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
