# taxi-service
This is a simple project to show my Java, JDBC, WEB, OOP, and SOLID skills. In this project, I used basic CRUD operations. One-to-one, one-to-many, and many-to-many relationships are used in databases.
# Available functionality 
register as a driver;
login as driver;
create/update/delete a driver;
display all drivers
create/update/delete a car;
display all cars;
create/update/delete a manufacturer;
display all manufacturers;
add a driver to a car;
display all cars for current login driver;
# Project structure 
Controller - accepts requests from the user, passes them to the service layer, and returns jsp pages in response
Service - accepts requests from the controller, passes them to the DAO layer, and performs all business logic
DAO - accepts requests from the service, passes them to the DB, and executes all sql queries
# Technologies:
Tomcat 9.0.50
Maven 3.1.1
MySQL 8.0.22
JDBC
Java 11
JSP
JSTL 1.2
Servlet Api 4.0.1
# Installation:
Fork this project to your repository
Press "Code" and choose HTTPS or SSH URL to clone the project
Install MySQL
Configure Apache Tomcat version: 9.0.50
Write your properties to ConnectionUtil class:
<img width="688" alt="image" src="https://github.com/volodymyrruso/-my-taxi-service/assets/130042707/fc4d3061-3f2a-408f-9f24-a6db8d17f569">
Copy and run SQL script from resources/init_db.sql in order to create a schema and tables for the project
Run the project
