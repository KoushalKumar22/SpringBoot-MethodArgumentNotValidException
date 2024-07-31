# BreadcrumbsSpringBoot-MethodArgumentNotValidException

This project is a simple Spring Boot application for managing user profiles. It includes basic CRUD operations with validation and global exception handling.

## Features

- Add new user profiles
- List all user profiles
- Validation of user input
- Global exception handling for validation errors

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- postgreSQL (can be replaced with any other database)
- Spring Validation

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/KoushalKumar22/your-repo-name.git
   cd your-repo-name
2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: `/test`

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save DATA
- URL: `/save`
- Method: POST
- Description: Save a new user data record to the database
- Request Body: json in postman
  ```sh
    {
    "name": "lex",
    "address": "USA",
    "age": 25
    }

3. Get All Users
- URL: `/all`
- Method: GET
- Description: Returns a list of all user profiles.
  
4. Validation
- name: Must not be empty, and must be at least 4 characters long.
- address: Must not be empty.
- age: Must be between 18 and 45.

### Exception Handling

The application includes a global exception handler that captures `MethodArgumentNotValid` and returns a meaningful error response.
- example error response
  ```sh
   {
  "name": "Name should be more than 2",
  "address": "Please Enter A Valid Address",
  "age": "Not Allowed for age less than 18"
  }
### Project Structure

- `User`: Entity class representing a user profile.
- `UserRepository`: Repository interface for CRUD operations on user profiles.
- `GlobalExceptionHandler`: Global exception handler for validation errors.
- `UserController`: REST controller for handling user-related requests.

## Acknowledgements

I would like to thank the following resources and individuals who made this project possible:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](http://hibernate.org/)
- [Spring Validation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#validation)
- [JetBrains](https://www.jetbrains.com/idea/)
- [Stack Overflow](https://stackoverflow.com/)
