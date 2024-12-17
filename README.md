# Person Management API

This project is a RESTful API built with **Spring Boot** that manages `Person` and `PersonAddress` entities. It supports basic **CRUD operations** to create, retrieve, and delete `Person` objects and their associated `PersonAddress`. The data is stored in a **MySQL database** using **Spring Data JPA** for persistence.

---

## Features

- **Create Person**: Create a new person with an associated address.
- **Get Person by ID**: Retrieve a person's details along with their address by their unique ID.
- **Delete Person by ID**: Delete a person and their associated address by ID.
- **Exception Handling**: Custom exceptions and global error handling with meaningful error messages.
- **Logging**: All operations are logged using SLF4J/Logback to monitor and debug the application.

## Project Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/antariksha-git/person-management-api.git
   cd person-management-api
   ```

2. **Configure your application properties**:
   - Open `src/main/resources/application.properties` or `application.yml`.
   - Configure the **MySQL connection** as follows:
   
     ```properties
     # In my case I have used jdbc:mysql://localhost:3306/person_db as url. Make sure you create db manually or add "?createdatabaseIfNotExists=true" at the end of url
     spring.datasource.url=
     spring.datasource.username=
     spring.datasource.password=
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
     ```
     
3. **Build and run the application**:
   If you're using **Maven**:

   ```bash
   ./mvnw spring-boot:run
   ```
---

## API Endpoints

### 1. **Create Person**
- **Endpoint**: `POST /api/person`
- **Request Body**: 
  ```json
  {
    "name": "Siddhart Jha",
    "age": 30,
    "personAddress": {
      "street": "123 Main St",
      "state": "West Bengal"
    }
  }
  ```
- **Response**:
  - **201 Created**: If the person is successfully created.
  - **400 Bad Request**: If any required field is missing or invalid.

### 2. **Get Person by ID**
- **Endpoint**: `GET /api/person/{personId}`
- **Response**:
  - **200 OK**: If the person exists.
  - **404 Not Found**: If the person does not exist.

### 3. **Delete Person by ID**
- **Endpoint**: `DELETE /api/person/{personId}`
- **Response**:
  - **200 OK**: If the person was successfully deleted.
  - **404 Not Found**: If the person with the given ID does not exist.

---

## Data Model

### `Person` Object:
- `personId`: Integer (Primary Key, Auto-generated)
- `name`: String (Required)
- `age`: Integer (Required)
- `personAddress`: Associated with one `PersonAddress` object.

### `PersonAddress` Object:
- `addressId`: Integer (Primary Key, Auto-generated)
- `street`: String (Required)
- `state`: String (Required)

---

## Service Layer

The business logic is handled in the **PersonService** class, where the core methods like `createPerson()`, `getPersonById()`, and `deletePersonById()` are defined.

---

## Exception Handling

In case of errors (e.g., person not found), the application throws custom exceptions such as `PersonNotFoundException`. These exceptions are handled globally via a `@ControllerAdvice` to return proper HTTP error codes and messages.

---

## Logging

The application uses **SLF4J** and **Logback** for logging. Logs are captured at various levels (INFO, ERROR) for debugging and operational monitoring.

---

## Contribution

Feel free to fork the repository and submit pull requests for bug fixes, improvements, or new features. Please make sure to follow the coding conventions and write tests for new features.

---

## Acknowledgements

- **Spring Boot** for building robust and scalable web applications.
- **MySQL** for reliable relational database management.
- **SLF4J/Logback** for logging and debugging.
- **Spring Data JPA** for simplified database access.

---

That's it! Feel free to explore the API and contribute if you find something worth improving.
