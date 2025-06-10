# 🧑‍💼 Employee Management System – Spring MVC Mini Project

This is a **Spring MVC-based Employee Management System** that performs full **CRUD operations** (Create, Read, Update, Delete) with a JSP-based UI. The application follows the **Model-View-Controller (MVC)** architecture and connects to a **MySQL database** using configurations defined in `application.properties`.

---

## 🚀 Features

- ➕ Add new employees  
- 📋 View all employee records  
- ✏️ Update employee details  
- ❌ Delete employees  
- 🧭 JSP with JSTL for the UI  
- 📄 Centralized configuration with `application.properties`  
- 📦 Clean layered structure (Controller, Service, DAO)

---

## 🧰 Tech Stack

| Layer          | Technology               |
|----------------|---------------------------|
| Language       | Java                      |
| Framework      | Spring MVC                |
| View Layer     | JSP, JSTL, HTML, CSS      |
| Persistence    | Spring Data JPA           |
| Database       | MySQL                     |
| Build Tool     | Maven                     |
| Server         | Apache Tomcat             |
| IDE            | Eclipse / IntelliJ IDEA   |

---

## 📁 Project Structure

BootMVC-Miniproject/
├── src/main/java/
│ ├── controller/ # Spring MVC controllers
│ ├── model/ # Employee entity
│ ├── dao/ # Data access logic
│ ├── service/ # Business logic layer
├── src/main/resources/
│ └── application.properties # DB and Spring configs
├── src/main/webapp/
│ ├── WEB-INF/
│ │ ├── views/ # JSP pages (list, add, update)
│ │ └── web.xml # Deployment descriptor
├── pom.xml # Maven config
└── README.md # This file
