Feature: Login functionality

Background: Application shows main page to user
Given  User open "chrome" browser
Given  User enter url as 

@SmokeTest
Scenario: Login functionality with valid username and valid password
When user enter "Admin" as username
When user enter "Admin" as password
When user click on Login buttton
Then application shows userprofile to user
