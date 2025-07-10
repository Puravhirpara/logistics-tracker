package com.purav.delivery_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeliveryTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public String getAssignedAgent() {
		return assignedAgent;
	}
	public void setAssignedAgent(String assignedAgent) {
		this.assignedAgent = assignedAgent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public DeliveryTask() {
	    // Needed for JSON deserialization
	}
	public DeliveryTask(Long id, String packageId, String pickupLocation, String dropLocation, String assignedAgent,
			String status) {
		super();
		this.id = id;
		this.packageId = packageId;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.assignedAgent = assignedAgent;
		this.status = status;
	}
	private String packageId;
    private String pickupLocation;
    private String dropLocation;
    private String assignedAgent;
    private String status = "CREATED";

    // Getters and Setters
}