Feature: Base Application

Scenario Outline: Check login functionality for Base app

Given Get fb URL for Base
When Enter "<Company>" "<UserName>" "<PassWord>" for hotal page
And Click login Button in Base page
Then Get current page title base login page

Examples:
|Company|UserName|PassWord|
|BASE754_17|admin@coresolutionsinc.com|Test@12345|
|BASE754_16|admin@coresolutionsinc.com|Test@12345|