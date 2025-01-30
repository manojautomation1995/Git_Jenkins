Feature: FB Application Login Functionality

Scenario: Check login functionality
Given Get fb URL
When Enter UserName and PassWord for fb page
And Click login Button in fb page
Then Get current page title fb login page