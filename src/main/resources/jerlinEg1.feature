Feature: Login Test
Description: Registered user can login into the application using valid username and valid password

Scenario: Login with valid combination
Given user opens login page in newtours application
When user enter username as "mercury" and password as "mercury"
And Click Submit button
Then verify login success