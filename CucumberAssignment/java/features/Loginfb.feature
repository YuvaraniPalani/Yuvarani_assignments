Feature: Login functionality of Leaftaps application

Scenario: Login function with valid credentials
Given Launch the browser
And Load the url
And click on Create new account link	
And Enter the firstname as 'Summer'
And Enter the lastname as 'P'
And Collect all options for day and select '1'
And Collect all options for month and select 'Feb'
And Collect all options for year and select '2001'
And click on gender button
And Add registered mail as '7676767677'
And Add registered password as 'star@256'
When click on submit button
Then Account will be created successfully
