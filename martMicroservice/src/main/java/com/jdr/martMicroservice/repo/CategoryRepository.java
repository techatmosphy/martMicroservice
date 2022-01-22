package com.jdr.martMicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdr.martMicroservice.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


}
