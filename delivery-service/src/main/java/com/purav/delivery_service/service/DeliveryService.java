package com.purav.delivery_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purav.delivery_service.model.DeliveryTask;
import com.purav.delivery_service.repository.DeliveryRepository;

@Service
public class DeliveryService {
	
	@Autowired
	DeliveryRepository deliveryRepository;

	public List<DeliveryTask> createTask(List<DeliveryTask> tasks) {
		
		return deliveryRepository.saveAll(tasks);
		
		
	}

	public List<DeliveryTask> getAllTask() {
		// TODO Auto-generated method stub
		return deliveryRepository.findAll();
	}

	public List<DeliveryTask> saveTask(DeliveryTask deliveryTask) {
		// TODO Auto-generated method stub
		return  (List<DeliveryTask>) deliveryRepository.save(deliveryTask);
	}

}
