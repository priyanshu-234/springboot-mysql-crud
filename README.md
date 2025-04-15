# 🚀 Spring Boot CRUD API

This is a simple **CRUD (Create, Read, Update, Delete)** REST API built using **Spring Boot**, **Spring Data JPA**, and **MySQL**. The application manages a list of users with basic operations and has been tested using **Postman**.

---

## 📦 Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **Postman**

---

## ✅ Features

- 🔹 Add a new user
- 🔹 Get all users
- 🔹 Get a user by ID
- 🔹 Update a user
- 🔹 Delete a user
- 🔹 Tested via Postman

---

## ⚙️ Setup Instructions

### 🔧 Prerequisites

- Java JDK 17+
- MySQL installed and running
- Maven installed
- IDE like IntelliJ or VS Code

### 🔌 Clone the Repository

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name

spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ Run the App
You can run the application from your IDE or using the terminal:

bash
Copy
Edit
mvn spring-boot:run

📬 API Endpoints

Method	Endpoint	Description
GET	/api/users	Get all users
GET	/api/users/{id}	Get user by ID
POST	/api/users	Create a new user
PUT	/api/users/{id}	Update existing user
DELETE	/api/users/{id}	Delete a user

🧪 Sample JSON for POST/PUT
json
Copy
Edit
{
  "name": "Priyanshu",
  "email": "shuklapriyanshu6292@gmail.com"
}


 Tools Used
Postman – For API testing

MySQL Workbench – For DB management

Git & GitHub – For version control

🙌 Author
Made with ❤️ by Priyanshu Shukla

GitHub Profile : github.com/priyanshu-234



