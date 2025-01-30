Feature: FB Application

Scenario: Check ForgetPassWord functionality
Given Get fb URL
When Click forget_password button in fb page
And Enter PhoneNumber in fb page
And Click forget button in fb page
Then Get current page Title in fb forget page