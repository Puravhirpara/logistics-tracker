package com.purav.agent_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purav.agent_service.model.DeliveryTask;


@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryTask,Long > {
	
	List<DeliveryTask> findByAssignedAgent(String agent);

}
