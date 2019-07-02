Feature: Test Login

Scenario: Login with valid
Given open newtours app
When user enters username as "mercury" and password as "mercury"
And submit login form
Then verify pass

Scenario: Login with invalid
Given open newtours app
When user enters username as "mer" and password as "mer"
And submit login form
Then verify fail
