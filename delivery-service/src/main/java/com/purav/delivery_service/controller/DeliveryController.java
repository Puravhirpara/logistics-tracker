package com.purav.delivery_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.purav.delivery_service.model.DeliveryTask;
import com.purav.delivery_service.service.DeliveryService;

@RestController
@RequestMapping("deliveries")
public class DeliveryController {
	
	    
	@Autowired
	DeliveryService deliveryService;
	
	
	
	@PostMapping("/add")
	public  ResponseEntity<String> createTask(@RequestBody List<DeliveryTask> tasks){
	        deliveryService.createTask(tasks);
	        return ResponseEntity.ok("All packages added successfully");
		
	}
	
	@GetMapping("/allTask")
	public ResponseEntity<List<DeliveryTask>> getAllTask(){
		return ResponseEntity.ok(deliveryService.getAllTask());
		
	}
	
	@PostMapping("update")
	public ResponseEntity<String> saveTask(@RequestBody DeliveryTask deliveryTask) {
		deliveryService.saveTask(deliveryTask);
        return ResponseEntity.ok("updated sucessfully..");
    }
	
	
	

}