package com.purav.delivery_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purav.delivery_service.model.DeliveryTask;



@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryTask, Long> {}