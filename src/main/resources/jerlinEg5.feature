Feature: search multiple item

Scenario: Search for products
When user searches for products
|iphone|
|travel kit|
|headphone|
And verify products displayed
Then Close application
