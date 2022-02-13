package com.jdr.martMicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jdr.martMicroservice.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	@Query(value = "SELECT product FROM product p WHERE p.gtin = ?1",nativeQuery = true)
	Product findProductByGtin(Long gtin);
}
