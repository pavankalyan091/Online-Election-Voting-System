# Online-Election-Voting-System
Developed a secure voting platform using Spring Boot and REST APIs, ensuring data integrity and real-time result updates. Designed a relational database in MySQL and implemented Spring AOP for centralized logging and security, reducing code redundancy.
Online Election Voting System 

# Project Overview

This is a secure and scalable Full-Stack Web Application designed to manage election processes digitally. Built using the Spring Boot ecosystem, this application ensures data integrity, voter authentication, and real-time result calculation, eliminating the manual errors of traditional voting systems. 

# Key Features 

User Authentication: Secure login and registration for voters. 

Voter Eligibility: Logic to ensure "One User, One Vote" (prevents duplicate voting). 

Real-time Dashboard: Dynamic updates of voting results using Spring MVC and Thymeleaf. 

Secure Backend: Implemented Spring AOP for centralized logging and security monitoring. 

Database Management: Robust relational schema in MySQL to store voter and candidate records securely. 

# Tech Stack 

Backend: Java (JDK 17+), Spring Boot, Spring Data JPA, Spring AOP 

Frontend: Thymeleaf, HTML5, CSS3, JavaScript react(optinal)

Database: MySQL 

Tools: Maven, Hibernate, Git, Postman (API Testing) 

# System Architecture 

The project follows a Layered Architecture (MVC): 

Controller Layer: Handles web requests and maps them to appropriate views. 

Service Layer: Contains core business logic (e.g., validating voter ID, counting votes). 

Repository Layer: Manages database operations using Spring Data JPA. 

Database Layer: MySQL stores all persistent data like voter profiles and vote counts. 

# How to Run 

Clone the Repo: 

Bash 

git clone https://github.com/your-username/online-election-voting-system.git 
 

# Database Setup: 

Create a database named voting_db in MySQL. 

Update src/main/resources/application.properties with your MySQL username and password. 

# Build & Run: 
mvn clean install 
mvn spring-boot:run 
 

Access App: Open http://localhost:8080 in your browser. 

 
