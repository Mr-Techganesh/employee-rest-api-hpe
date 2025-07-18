# 🚀 Employee REST API – HPE Forage Simulation

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.0-green?logo=spring)
![JUnit](https://img.shields.io/badge/Testing-JUnit5-orange?logo=java)
![Build Tool](https://img.shields.io/badge/Maven-Build-lightgrey?logo=apachemaven)

A fully working **Spring Boot RESTful API** to manage employee records, created as part of the **Hewlett Packard Enterprise – Software Engineering Virtual Experience** on **Forage**.

---

## 📌 Project Features

- ✅ RESTful API using Spring Boot
- ✅ `GET /employees` to fetch employee list
- ✅ MVC architecture (`Model`, `Service`, `Controller`)
- ✅ Unit testing with **JUnit 5**
- ✅ Clean, modular Java codebase

---

## 🧪 API Endpoints

| Method | Endpoint         | Description             |
|--------|------------------|-------------------------|
| GET    | `/employees`     | Fetch all employees     |

---

## 📁 Project Structure

employee-rest-api-hpe/
├── src/
│ ├── main/
│ │ ├── java/com/example/demo/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ └── service/
│ ├── test/
│ └── java/com/example/demo/
│ ├── controller/
│ └── service/
├── pom.xml
└── README.md



---

## 🚀 How to Run the App Locally

### 🛠 Prerequisites
- Java 17
- Maven

### ▶️ Run the app
```bash
mvn clean install
mvn spring-boot:run


Access endpoint at:
🔗 http://localhost:8080/employees

✅ Run Unit Tests
mvn test


🎓 About the Simulation
This project was completed as part of the HPE Forage Software Engineering Virtual Experience Program.
It demonstrates skills in REST API development, Spring Boot, testing with JUnit, and Java backend fundamentals.

📬 Contact
Made with ❤️ by Ganesh Moorthy
🔗 LinkedIn – Mr-Techganesh
