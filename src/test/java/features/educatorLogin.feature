Feature: Educator will Enter the credentials and login to the application.
#--------------------------------------------------------------------------------------------#

Scenario Outline: Educator will enter credentials   Login

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am teacher
Then educator will enter <Email> and <Password> and click on sigin button
Then  to educator <Message> message should display

Examples:
| Email                | Password         | Message                           |                                  
|educator@educator.com | educatorpassword | Signin Success.                   |
|EDUCATOR@EDUCATOR.COM | educatorpassword | Signin Success.                   |
|educator@student.com  | studentpassword  | Invalid credentials               |
|educator@educator.com | educatorpasswd   | Invalid credentials               |
|educator@educator.com |  OR 1 = 1        | Invalid credentials 							|                          
| educator@educator.com   | studentpassword | Invalid credentials             |
| educator@educator.com  | <script>alert('XSS')</script> | Invalid credentials|


#---------------------------------------------------------------------------------------------#
@UI
Scenario Outline: Educator click on SiginIn button without entering credentials 

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am teacher
Then educator will click on siginbutton without entering credentials
Then  the <Message> message should display

Examples:
| Message |
| Both Email and Password are required |

#----------------------------------------------------------------------------------------------#
@UI
Scenario Outline: Educator will enter only email id and click on Signin button 

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am teacher
Then educator will enter <Email> and click on sigin
Then  the <Message> message should display

Examples:
| Email                     | Message                             |
| sufiyanattar183@gmail.com |Both Email and Password are required |






  