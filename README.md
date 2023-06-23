# User Management System

This is a User Management System project built using Spring Framework.

## Project Overview

The User Management System allows you to perform CRUD (Create, Read, Update, Delete) operations on user data. Each user has the following attributes:

- UserId
- Name
- UserName
- Address
- Phone Number

## Endpoints

The following endpoints are available:

- **GET** `getAllUser`: Get all users
- **GET** `getUser/{userid}`: Get user by ID
- **POST** `addUser`: Add new users
- **PUT** `updateUserInfo/{userId}`: Update user information
- **DELETE** `deleteUser/{userId}`: Delete user by ID

## Project Structure

The project follows the MVC (Model-View-Controller) architecture and consists of the following components:

- `com.example.usermanagementsystem.controller`: Contains the controller classes for handling HTTP requests and responses.
- `com.example.usermanagementsystem.model`: Defines the User model class.
- `com.example.usermanagementsystem.repository`: Provides data access and storage functionality.
- `com.example.usermanagementsystem.service`: Implements the business logic and acts as an intermediary between the controller and repository.
- `com.example.usermanagementsystem.configuration`: Contains configuration classes for the project.
- `com.example.usermanagementsystem`: The main application package.

## Dependencies

The project is built with the following Spring dependencies:

- `spring-boot-starter-web`: Starter for building web applications using Spring MVC.
- `lombok`: Java library for reducing boilerplate code.

## Getting Started

To run the User Management System project locally, follow these steps:

1. Clone the repository or download the source code.
2. Import the project into your preferred Java IDE.
3. Build the project to download the required dependencies.
4. Run the application from the main class (`UserManagementSystemApplication`).
5. The application will start running on the default port (8080) of the local machine.

## Testing the Endpoints

You can use an API testing tool like Postman to test the endpoints of the User Management System. Here are some example requests:

- **GET** `http://localhost:8080/users`: Retrieve all users.
- **GET** `http://localhost:8080/users/{userId}`: Retrieve a specific user by ID.
- **POST** `http://localhost:8080/users`: Add new users by providing user data in the request body.
- **PUT** `http://localhost:8080/users/{userId}`: Update user information by providing user data in the request body.
- **DELETE** `http://localhost:8080/users/{userId}`: Delete a specific user by ID.

Please note that `{userId}` should be replaced with the actual ID of the user.

## Contributing

Contributions to this User Management System project are welcome. If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

## License

This project is not licensed.
