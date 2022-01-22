package com.jdr.martMicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdr.martMicroservice.entity.Shipment;
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long>{

}
