# Quarkus CRUD Project

This is a simple RESTful CRUD application built with **Quarkus** and **MySQL**.

## Features

- **Create, Read, Update, Delete (CRUD)** operations for `Person`.
- REST API endpoints with JSON responses.
- Database integration using **Hibernate ORM / Panache**.
- OpenAPI / Swagger documentation available.

## Project Structure

- `domain/Person.java` – JPA entity representing a person.
- `controller/restApi.java` – REST endpoints for CRUD operations.
- `controller/PersonModel.java` – Data transfer object (DTO) for API requests.

## REST Endpoints

| Method | Path           | Description                   |
|--------|----------------|-------------------------------|
| GET    | /person        | Get all persons               |
| GET    | /person/{id}   | Get a single person by ID     |
| POST   | /person        | Create a new person           |
| PUT    | /person/{id}   | Update an existing person     |
| DELETE | /person/{id}   | Delete a person by ID         |

## Database Configuration

Update your `application.properties` with your MySQL credentials:

## Swagger / OpenAPI

- **Swagger UI:** [http://localhost:8080/swagger-ui](http://localhost:8080/swagger-ui)
- **OpenAPI JSON:** [http://localhost:8080/swagger](http://localhost:8080/swagger)

## Running the Project

1. **Ensure MySQL is running and the database (`person`) exists.**
2. **Build and run the application:**

    ```bash
    ./mvnw compile quarkus:dev
    ```

3. **Access the API:**

    - [http://localhost:8080/person](http://localhost:8080/person)

--- 
