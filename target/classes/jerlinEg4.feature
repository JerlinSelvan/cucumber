Feature: Test Background keyword

Background: Display welcome message
Given Application displays welcome message
@smoke @regression
Scenario: signin
When user enter unmae and password
@smoke
Scenario: search for product
When user searches for iphone
@regression
Scenario: add to cart
When user add the searched product to cart
@regression
Scenario: make payment
When user make payment process
@smoke
Scenario: logout
When user perform logout process from the application