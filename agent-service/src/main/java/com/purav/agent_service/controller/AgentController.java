package com.purav.agent_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.purav.agent_service.model.DeliveryTask;
import com.purav.agent_service.service.AgentService;
@RestController
@RequestMapping("agent")
public class AgentController{
	  
	  @Autowired
	  private AgentService agentService;
	
	  
	@GetMapping("{agent}/task")
	public List<DeliveryTask> getAssignedTask(@PathVariable String agent){
		
		return agentService.getTaskForAgent(agent);
		
	}
	
	@PutMapping("/tasks/{taskId}/status")
    public DeliveryTask updateStatus(@PathVariable Long taskId, @RequestParam String status) {
        return agentService.updateTaskStatus(taskId, status);
    }

}

