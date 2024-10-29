Feature: Student will Enter the credentials and login to the application.


Scenario Outline:
Given user will enter the url and land on homepage
Then user selects the category <Category>
Then user select the subcategory <subcategory>
Examples:
| Category               | subcategory          | cousreName                            |
| Information Technology | IT Infrastructure    | IT Support and Networking Essentials   | 
| Information Technology | IT Infrastructure    | IT Support and Networking Essentials   |





@SiginUp
Scenario Outline: Check weather SiginUp button is enabled and displayed or not 

Given user will enter the url and land on homepage
When  user will click on SignIn
Then  user will select on I am student
Then  user will click on SignUp Here
And  SiguUp button should enabled and displayed

#----------------------------------------------------------------------------------------------------------------------------------------#

@SiginUp
Scenario Outline: Check weather SiginUp button is enabled and displayed or not 

Given user will enter the url and land on homepage
When  user will click on SignIn
Then  user will select on I am student
Then  user will click on SignUp Here
And   LoginHere button should enabled and displayed
 










  