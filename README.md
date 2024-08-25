# Employee Management System

## Project Description
The **Employee Management System** is a web-based application developed using **Spring Boot** and **Thymeleaf**. This project provides basic CRUD (Create, Read, Update, Delete) functionality to manage employee records. Users can create, update, delete, and view employee information through a user-friendly interface. The project is self-contained and can be run directly, allowing users to manage employee data using the provided forms.

## Features
- **Create Employee**: Add new employee records by submitting a form with relevant details.
- **Read Employee**: View a list of employees and individual employee details.
- **Update Employee**: Edit existing employee records through a form.
- **Delete Employee**: Remove employee records from the system.

## Technology Stack
- **Backend**: Java, Spring Boot
- **Frontend**: Thymeleaf, HTML, CSS
- **Database**: MySQL (configurable)
- **Tools**: Maven

## How to Run the Project

1. **Clone the Repository**  
   Clone this repository to your local machine using the following command:
   ```bash
   git clone https://github.com/kaswan001/employee-management-system.git
   ```

2. **Navigate to the Project Directory**
   ```bash
   cd employee-management-system
   ```

3. **Configure the Database**  
   The project is set up to use MySQL as the database. You will need to update the `application.properties` file with your own MySQL database connection details. 

   Open the file located at `src/main/resources/application.properties` and configure it as follows:
   ```properties
   # MySQL Configuration
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password

   # Hibernate Configurations
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   ```

   Replace:
   - `your_database_name` with your MySQL database name.
   - `your_username` with your MySQL username.
   - `your_password` with your MySQL password.

4. **Build and Run the Application**
   Use Maven to build and run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the Application**
   Once the application is running, you can access it in your browser:
   ```
   http://localhost:8080
   ```

## Usage

1. After running the project, you will be directed to the home page of the Employee Management System.
2. From the home page, you can:
   - **Create a new employee**: Click on the "Add Employee" button and fill in the employee details in the provided form.
   - **View employees**: A list of all employees will be displayed on the home page.
   - **Update employee details**: Click on the "Edit" button next to an employee's record, update the information, and save it.
   - **Delete an employee**: Click on the "Delete" button next to an employee's record to remove it from the system.

## Requirements
- **Java 11 or higher**
- **Maven 3.6+**
- **MySQL 5.7 or higher**
