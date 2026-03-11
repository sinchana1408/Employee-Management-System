# Employee Management System

## Overview

This project is a simple Employee Management System developed using **Spring Boot** for the backend and **HTML, CSS, and JavaScript** for the frontend.
The system allows users to manage employee records by performing basic operations such as adding, viewing, updating, and deleting employee details.

The goal of this project is to demonstrate how a full CRUD (Create, Read, Update, Delete) application can be built using Spring Boot REST APIs and a simple web interface.

---

## Features

* Add new employees to the system
* View a list of all employees
* Update employee information
* Delete employee records
* Simple dashboard interface for navigation

---

## Technologies Used

* **Java**
* **Spring Boot**
* **Maven**
* **HTML**
* **CSS**
* **JavaScript**
* **REST API**

---

## Project Structure

```
src
 └─ main
     ├─ java
     │   └─ com.example.EmployeeManagementSystem
     │        ├─ controller
     │        ├─ service
     │        ├─ repository
     │        └─ dto
     │
     └─ resources
         ├─ templates
         │    ├─ dashboard.html
         │    ├─ add-employee.html
         │    └─ employees.html
         │
         └─ static
              ├─ css
              └─ js
```
### Terminal
![Terminal](Screenshot%202026-03-11%20104119.png)

### Dashboard 
![Dashboard](Screenshot%202026-03-11%20104138.png)

### Employee Add page
![Employee Add page](Screenshot%202026-03-11%20104407.png)

### Employee Added
![Add Employee](Screenshot%202026-03-11%20104329.png)

### Employee List
![Employee List](Screenshot%202026-03-11%20104615.png)

### Employee Deleted
![Employee Deleted](Screenshot%202026-03-11%20104629.png)
---

## How to Run the Project

1. Clone the repository

```
git clone https://github.com/sinchana1408/Employee-Management-System.git
```

2. Navigate to the project folder

```
cd employee-management-system
```

3. Run the Spring Boot application

```
mvn spring-boot:run
```

4. Open the application in your browser

```
http://localhost:8080
```

---

