package com.purav.agent_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purav.agent_service.model.DeliveryTask;
import com.purav.agent_service.repository.DeliveryRepository;

@Service
public	 class AgentService {
	
	@Autowired
	private DeliveryRepository repository;

	public List<DeliveryTask> getTaskForAgent(String agent) {
		
		return repository.findByAssignedAgent(agent);
	}

	public DeliveryTask updateTaskStatus(Long taskId, String newStatus) {
	    return repository.findById(taskId)
	        .map(task -> {
	            task.setStatus(newStatus);
	            return repository.save(task);
	        })
	        .orElseThrow(() -> new RuntimeException("Task not found with ID: " + taskId));
	}


}
