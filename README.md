##Student-Course Management System (Spring Boot)

A web-based application built using Spring Boot, JPA, and JSP to manage relationships between students and courses. The system supports core CRUD operations along with relational data retrieval using JOIN queries.

###Features

- Create
Add new students via a JSP form
Data is persisted using Spring Data JPA
Basic exception handling for invalid inputs

- Read
View all students in a tabular format
Fetch relational data using a custom JOIN query (Student–Course mapping)

- Update
Edit existing student details through a pre-filled form
Changes are saved back to the database

- Database Initialization
Tables are auto-created using JPA (@Entity)
Sample data (10+ records) loaded via data.sql


###Tech Stack

Backend	--> Spring Boot
ORM	--> Spring Data JPA (Hibernate)
Database --> H2 (In-Memory)
View --> JSP + JSTL
Build Tool --> Maven
Language --> Java 17

###Project Structure
src/
 ├── main/
 │   ├── java/com/example/demo/
 │   │   ├── controller/
 │   │   ├── service/
 │   │   ├── repository/
 │   │   └── model/
 │   ├── resources/
 │   │   ├── application.properties
 │   │   ├── data.sql
 │   │   └── static/
 │   └── webapp/WEB-INF/jsp/
 │       ├── student-form.jsp
 │       ├── student-list.jsp
 │       ├── student-update.jsp
 │       └── report.jsp
 └── test/
 

###Key Functionalities

- Entity Relationship
Student ↔ Course (Many-to-Many)
Managed via a join table (student_course)

- Custom JOIN Query
@Query("SELECT s.name, c.title FROM Student s JOIN s.courses c")
List<Object[]> getStudentCourseDetails();

Used to generate a report of student-course mappings.


- Application Endpoints

/	Home page
/students	View all students
/add	Add new student
/edit/{id}	Update student
/report	View student-course mapping
/h2-console	Database console


###Testing
Basic unit test implemented using JUnit

###How to Run
./mvnw spring-boot:run -DskipTests

Then open:

http://localhost:8080