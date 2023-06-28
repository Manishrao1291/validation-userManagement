# User_Management_System_With_Validation

This is a user management system that allows you to create, read, update and delete user information.

## Frameworks and Language Used
- Java
- Spring Boot
- Maven

## Data Flow
### Controller

The *UserController* class is responsible for handling HTTP requests and returning responses. It has the following endpoints:

- *POST /addUser:* adds a new user to the system
- *GET /getUser/{userId}:* retrieves a user with the given user ID
- *GET /getAllUsers:* retrieves all users in the system
- *PUT /updateUserInfo/{userId}:* updates a user's information with the given user ID
- *DELETE /deleteUser/{userId}:* deletes a user with the given user ID

### Service

The *UserService* class contains the business logic for the user management system. It has the following methods:

- *List<User> getAllUsers():* retrieves all users in the system
- *User getUserById(int userId):* retrieves a user with the given user ID
- *User createUser(User user):* adds a new user to the system
- *User updateUserById(int userId, User user):* updates a user's information with the given user ID
- *boolean deleteUserById(int userId):* deletes a user with the given user ID

### Repository

The *UserRepository* class is responsible for interacting with the system's data. It has the following methods:

- *List<User> getAllUsers():* retrieves all users in the system
- *Optional<User> getUserById(int userId):* retrieves a user with the given user ID
- *void saveUser(User user):* saves a user to the system
- *String deleteUserById(int userId):* deletes a user with the given user ID

## Data Structure Used:

The User class is used to represent a user in the system. It has the following attributes:
- *ArrayList:* to store the list of the users
- *int userId:* the user's ID
- *String name:* the user's name
- *String userName:* the user's username
- *String address:* the user's address
- *String phoneNumber:* the user's phone number
- *LocalDate dateOfBirth:* user's date of birth
- *LocalTime time:* time on which user enter it's data

## Validations Used:
- *@NotNull*
- *@NotBlank*
- *@Pattern*
- *@Valid*
- *@Validated*
- *@Email*
- *@Size*



## Project Summary

The user management system is a simple application that allows users to be added, retrieved, updated, and deleted from a system.
It is built using the Spring Boot framework and Java programming language. The application has a controller, service, and repository layer, and uses a User class to represent users in the system.
