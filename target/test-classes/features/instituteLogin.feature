Feature: Institute will Enter the credentials and login to the application.
#--------------------------------------------------------------------------------------------#

Scenario Outline: Institute will enter credentials   Login

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am Educational Institute
Then institute will enter <Email> and <Password> and click on sigin button
Then to institute <Message> message should display

Examples:
| Email                | Password         | Message                           |                                  
|institution@institution.com | institutionpassword | SignIn Success         |
	|INSTITUTION@INSTITUTION.COM | institutionpassword | SignIn Success          |
|institution@educator.com | institutionpassword | Invalid credentials         |
|institution@institution.com | institutionpasswd | Invalid credentials        |
|institution@institution.com |  OR 1 = 1 | Invalid credentials                 |
| institution@institution.com  | studentpassword | Invalid credentials             |
| institution@institution.com  | <script>alert('XSS')</script> | Invalid credentials|


#---------------------------------------------------------------------------------------------#
@UI
Scenario Outline: Institute click on SiginIn button without entering credentials 

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am Educational Institute
Then institute will click on siginbutton without entering credentials
Then to institute <Message> message should display

Examples:
| Message |
| Both Email and Password are required |

#----------------------------------------------------------------------------------------------#
@UI
Scenario Outline: Institute will enter only email id and click on Signin button 

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am Educational Institute
Then institute will enter <Email> and click on sigin
Then to institute <Message> message should display

Examples:
| Email               | Message                             |
| institution@institution.com |Both Email and Password are required |






  