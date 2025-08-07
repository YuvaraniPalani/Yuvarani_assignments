Feature: Login functionality of Leaftaps application

Scenario: Login function with valid credentials
Given Launch the browser
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then It should be logged in
Then Click on crmsfa
Then Click on Accounts
Then Click on Create Accounts
Then Enter the accountName as 'Selenium Automation Tester1'
Then Enter the numberEmployees as '7'
Then Enter the officeSiteName as 'LeafTaps'
When Click on smallSubmit
Then Account will be created successfully



Scenario: Login function with invalid credentials
Given Launch the browser
And Load the url
And Enter the username as 'Demosalesmana'
And Enter the password as 'crmsad'
When Click on Login button
Then Error message should pop up

