## Employee Management :
A Spring Boot application for managing employees, departments, attendance, and performance reviews.  
This project is built using **Java 21**, **Spring Boot 3**, **Spring Data JPA**, and **Maven**.

## 📖 Introduction
The **Employee Management System** is developed as an internship task to demonstrate full-stack backend development using Spring Boot.  
It provides a structured way to manage organizational data such as **employees, departments, attendance, and performance reviews**.  
This project follows the **MVC architecture** and uses **REST endpoints** for communication.

## 📂 Project Structure
- **controller/** – REST controllers handling HTTP requests  
- **entity/** – JPA entities (Employee, Department, Attendance, PerformanceReview)  
- **repo/** – Repository interfaces for database operations  
- **service/** – Business logic layer  
- **main/** – Application entry point (`EmployeeManagementInternshipTaskApplication.java`)  

## 🚀 Features
- Employee CRUD operations  
- Department management  
- Attendance tracking  
- Performance review system  
- REST APIs for integration  
- Maven project for easy build and deployment  

## 🛠️ Prerequisites
- **Java 21** (or compatible JDK)  
- **Maven 3+**  
- **Spring Boot 3+**  
- **MySQL/Oracle database** running  

## ⚙️ Setup Instructions
1. **Clone the repository**  
   ```bash
   git clone <your-repo-url>
   cd EmployeeManagementInternshipTask
  
2. **Configure Database**  
   Update `application.properties` (inside `src/main/resources/`) with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
  
3. **Build & Run**  
   ```bash
   mvn spring-boot:run
  
4. **Access Application**  
   Open [http://localhost:8080](http://localhost:8080) in your browser or use Postman to test APIs.

## 🗄️ Database Schema

### Employee
- `id` (Primary Key)  
- `name`  
- `email`  
- `department_id` (FK → Department)  
- `hire_date`  

### Department
- `id` (Primary Key)  
- `name`  
- `description`  

### Attendance
- `id` (Primary Key)  
- `employee_id` (FK → Employee)  
- `date`  
- `status` (Present/Absent)  

### PerformanceReview
- `id` (Primary Key)  
- `employee_id` (FK → Employee)  
- `review_date`  
- `comments`  
- `rating`  
## 📡 API Endpoints

### EmployeeController (`/employees`)
- `GET /employees/new` – Show form to create employee  
- `GET /employees/edit/{id}` – Edit employee by ID  
- `GET /employees/delete/{id}` – Delete employee by ID  

### DepartmentController (`/departments`)
- `GET /departments/new` – Show form to create department  
- `GET /departments/edit/{id}` – Edit department by ID  
- `GET /departments/delete/{id}` – Delete department by ID  

### AttendanceController (`/attendance`)
- `GET /attendance/new` – Mark attendance  
- `GET /attendance/edit/{id}` – Edit attendance record  
- `GET /attendance/delete/{id}` – Delete attendance  

### PerformanceReviewController (`/reviews`)
- `GET /reviews/new` – Create new review  
- `GET /reviews/edit/{id}` – Edit review  
- `GET /reviews/delete/{id}` – Delete review  

 📦 Build
Generate a JAR file:
```bash
mvn clean package
java -jar target/EmployeeManagementInternshipTask-0.0.1-SNAPSHOT.jar

🎯 Skills Demonstrated
- Java & Spring Boot (backend development)  
- REST API design  
- Maven build lifecycle  
- Database design with JPA & Hibernate  
- MVC architecture implementation

 🤝 Contributing
Contributions are welcome! Fork this repo and submit a pull request.

📜 License
This project is for **educational/project purposes**.
