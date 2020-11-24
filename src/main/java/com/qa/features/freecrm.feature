Feature: Free CRM application Test
@BDDPOM
Scenario: Validate Free CRM home page test
Given user open browser
Then user is on login page
Then user enters username and password
Then validate homepage title 
Then validate logged in username 
And user close the browser
