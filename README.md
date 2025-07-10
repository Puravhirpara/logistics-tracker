# 🚚 Logistics & Delivery Tracker System

A backend microservices-based system designed to manage delivery logistics, built using Java and Spring Boot. This project enables admins to create and assign delivery tasks, while agents can log in, view their tasks, and update delivery statuses in real time.

> ✅ Perfect for showcasing backend engineering skills with microservices, role-based access, secure APIs, and service discovery.

---

## 🧩 Features

- 🔐 **Role-Based Authentication**
  - Admins: Create and assign delivery tasks
  - Agents: View assigned deliveries, update statuses
  - Secure login with Spring Security + JWT

- 📦 **Microservices Architecture**
  - Auth Service: Handles registration, login, and JWT generation
  - Delivery Service: Manages delivery task creation and updates
  - Agent Service: Lets agents fetch and update their tasks
  - API Gateway: Central routing for all services
  - Eureka Server: Service discovery and registration

- 🧠 **Live Status Updates**
  - Agents can mark delivery tasks as `PENDING`, `IN_PROGRESS`, or `DELIVERED`
  - Admins can monitor all delivery statuses

---

## 🛠 Tech Stack

- **Language**: Java 
- **Framework**: Spring Boot  
- **Security**: Spring Security + JWT  
- **Database**: PostgreSQL  
- **Architecture**: Microservices + Eureka Discovery  
- **API Gateway**: Spring Cloud Gateway   
- **Build Tool**: Maven  
- **Deployment Ready**: Supports AWS EC2 / Docker

---

## 🔧 Microservices Overview

| Service           | Port  | Description                         |
|-------------------|-------|-------------------------------------|
| `eureka-server`   | 8761  | Service Registry & Discovery        |
| `api-gateway`     | 8080  | Routes external traffic             |
| `auth-service`    | 8084  | Login, registration, JWT auth       |
| `delivery-service`| 8081  | Admin delivery task management      |
| `agent-service`   | 8082  | Agent task view and update          |


---

## 📦 API Examples

- **Register Admin**
