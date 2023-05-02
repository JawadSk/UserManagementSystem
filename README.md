# UserManagementSystem

## FrameWorks and Languages
* Java17 Spring Boot

## Browser/Tools
*Google Chrome and Postman

## Model

* private int userId;
* @NotBlank
private String userName;
* @Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}", message = "Enter a valid date (DD-MM-YYYY)")
private String dateOfBirth;
* @Email
private String email;
*@Pattern(regexp = "[0-9]{12}", message = "Phone number must be contains 12 digits!")
private String phoneNumber;
* @Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}", message = "Enter a valid date (DD-MM-YYYY)")
private String date;
* @Pattern(regexp = "[0-9]{2}:[0-9]{2}", message = "Enter a valid time (HH:MM)")
private String time;

## DataFlow

### End Points / Controllers

* addUser
* getUser/{userId}
* getAllUser
* updateUserInfo/{userId}
* deleteUser/{userId}

## Service

### For adding user
* public String addUser(User newUser)

### For getting user based on Id
* public User getUserById(int userId)

### For getting all the users
* public List<User> getAllUsers() 

### For updating user info
* public String updateUser(User updatedUser) 

### For deleting an user
* public List<User> getAllUsers() 

## Repositry

* Getting all the users from data source
* Saving the user into the data source
* Removing user from the data source

## Database

* I haven't used any Database in this project yet. But for data storing I have used an Collections.

## Datastructures

* ArrayList

## Summary

This API is a Spring Boot project that is about managing users. We can create, read, update, and delete user. In this
project request is sent from the client on HTTP in JSON format or from path variable with server side validations and
stored in object then response is sent back from the server by JSON format to the client.
