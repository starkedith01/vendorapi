# Vendor Management API

## Description

This is a Spring Boot application designed for managing vendor data. The API allows users to perform CRUD (Create, Read, Update, Delete) operations on vendor records, making it easy to manage vendor information in a structured manner.

## Features

- **Get all vendors**: Retrieve a list of all vendors.
- **Get vendor by ID**: Fetch detailed information about a specific vendor.
- **Create a new vendor**: Add a new vendor to the database.
- **Update an existing vendor**: Modify details of an existing vendor.
- **Delete a vendor**: Remove a vendor from the database.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Getting Started

### Prerequisites

- Java JDK 11 or higher
- Maven
- PostgreSQL database
- Postman or any API testing tool (optional)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/vendor-management-api.git
   cd vendor-management-api


Configure PostgreSQL:

Create a new database for the application (e.g., vendor_db).
Update the application.properties or application.yml file with your database configuration:

spring.datasource.url=jdbc:postgresql://localhost:5432/vendor_db
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

API Endpoints
Method	Endpoint	Description
GET	/vendor	Retrieve all vendors
GET	/vendor/{id}	Retrieve a vendor by ID
POST	/vendor	Create a new vendor
PUT	/vendor/{id}	Update an existing vendor
DELETE	/vendor/{id}	Delete a vendor by ID



### Notes

- Ensure to replace `your_db_username` and `your_db_password` with your actual PostgreSQL credentials.
- Update the database name in the JDBC URL if you choose a different one.
- Adjust any other sections as necessary to fit your specific project details!
