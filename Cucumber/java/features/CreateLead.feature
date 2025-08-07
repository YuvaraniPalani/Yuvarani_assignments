Feature: Login functionality of Leaftaps application

Scenario Outline: 	Create lead function with valid credentials

Given Launch the browser
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then It should be logged in
And Click on crmsfa
And click on Leads
And click on the Create Lead button
And Enter the firstName as <firstname>
And  Enter the lastName as <lastnames>
And Enter the companyname as <cmpname>
And Enter the profiletitle as <profile>
When Click on submit button
Then Lead account will be created

Examples:
|cmpname|firstname|lastnames|profile|
|Infosys|Yuvarani|P|Tester|
|DXC|Swathi|P|Developer|

