# Person Management Application
Overview

This is a simple full-stack web application designed for managing a list of people. The application provides basic CRUD (Create, Read, Update, Delete) functionality for person records, each consisting of a unique ID, a name, and a phone number.

Built With

## Backend: Java with Spring Boot (REST API)

## Database: PostgreSQL

## Frontend: HTML, CSS, and JavaScript
### 1. Registration Form
![Registration Form](images/Screenshot%202025-09-24%20104601.png)

### 2. Person List Table
![Person List Table](images/Screenshot%202025-09-24%20104646.png)

### 3. Update/Delete Functionality
![Update/Delete Functionality](images/Screenshot%202025-09-24%20104659.png)
Features

### Create: Register a new person with a name and phone number.

### Read: Fetch and display a list of all registered people.

### Update: Modify the name and phone number for an existing person.

### Delete: Remove a person record from the database.

Unique ID: Each person record is assigned a unique ID upon creation.

Prerequisites

Before running the application, make sure you have installed:

Java Development Kit (JDK 21 or higher)

Apache Maven

PostgreSQL (v15 or higher recommended)
## Screenshots



Step 1: Start PostgreSQL Database

Ensure PostgreSQL is running. Create the database if it doesn’t exist:
```
CREATE DATABASE yohannes;
```
Step 2: Package the Application

In the project root directory, run:
```
mvn clean package

```
This will generate a JAR file in the target/ folder.

Step 3: Run the Backend

java -jar target/demo-0.0.1-SNAPSHOT.jar
When Tomcat starts successfully, it runs on port 8080.

Step 4: Access the Frontend

Open your browser:
```http://localhost:8080/index.html
```

| Endpoint              | HTTP Method | Description                 |
| --------------------- | ----------- | --------------------------- |
| `/api/v1/person`      | POST        | Register a new person       |
| `/api/v1/person`      | GET         | Fetch all people            |
| `/api/v1/person/{id}` | PUT         | Update an existing person   |
| `/api/v1/person/{id}` | DELETE      | Delete a person by their ID |












