Feature: SignUp

Scenario Outline: Test signup feature with different set of input

Given User open signup page
When user enters fname as "<fn>"
And user enters lname as "<ln>"
And user enters phone as "<phn>"
And user enters email as "<mail>"
And user enters address as "<add>"
And user enters address1 as "<add1>"
And user enters city as "<city>"
And user enters state as "<state>"
And user enters code as "<pincode>"
And user enters username as "<uname>"
And user enters pword as "<pwd>"
And user enetrs cpassword as "<cpass>" 
Then Click signup button
And Verify success message

Examples:
|fn|ln|phn|mail|add|add1|city|state|pincode|uname|pwd|cpass|
|Jerlin|Selvan|9876543210|abc@gmail.com|Louis Street|Azhagappapuram|KK|TamilNadu|629401|jerlin|abc|abc|