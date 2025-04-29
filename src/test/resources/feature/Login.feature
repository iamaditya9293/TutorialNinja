@all
Feature: User Login
Registered user should be able to logon to the application

Background: 
Given User navigates to the login page

@login @validcredentials  @smoke @regression
Scenario Outline: Login with valid user name and password
When Enter valid email address <email>
And Enter Valid password <pwd>
And Hit login button
Then User logged on to the home page
Examples:
|email | pwd|
|aditya@test.com | 1234|
|mouli@test.com | 1234|
|shiva@test.com| 1234|
|Anji@test.com|1234|

@login @invalidcredentials  
Scenario: Login with invalid user name and password
When Enter valid email address "test999@gmail.com"
And Enter Valid password "1234"
And Hit login button
Then User should be able to get a validation

@login  @regression
Scenario: Login with invalid user name and invalid password
When Enter valid email address "test999@gmail.com"
And Enter Valid password "123344"
And Hit login button
Then User should be able to get a validation

@login @validcredentials @smoke 
Scenario: Login with valid user name and invalid password
When Enter valid email address "test999@gmail.com"
And Enter Valid password "1239898984"
And Hit login button
Then User should be able to get a validation