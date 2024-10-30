Feature: Student will Enter the credentials and login to the application.
#--------------------------------------------------------------------------------------------#

@RegressionSuite
Scenario Outline: Student will enter credentials   Login

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
Then student will enter <Email> and <Password> and click on sigin button
Then  the <Message> message should display

Examples:
| Email                | Password        | Message                                          |
| student@student.com  | studentpassword | Signin Success. Your free trial period has ended |
| STUDENT@STUDENT.COM  | studentpassword | Signin Success. Your free trial period has ended |
| educator@student.com | studentpassword | Invalid credentials                              |
| student@student.com  | studentpasswod  | Invalid credentials                              |
| student@student.com  |  OR 1 = 1       | Invalid credentials                              |
| student@student.com  | <script>alert('XSS')</script> | Invalid credentials                |
| student@studentcom   | studentpassword | Please enter a valid Email address               |

#---------------------------------------------------------------------------------------------#

@Regression
Scenario Outline: Stundent click on SiginIn button without entering credentials 

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
Then student will click on siginbutton without entering credentials
Then  the <Message> message should display

Examples:
| Message |
| Both Email and Password are required |

#----------------------------------------------------------------------------------------------#

@Regression
Scenario Outline: Student will enter only email id and click on Signin button 

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
Then student will enter <Email> and click on sigin
Then  the <Message> message should display

Examples:
| Email               | Message                             |
| student@student.com |Both Email and Password are required |

#----------------------------------------------------------------------------------------------#


@UI
Scenario: Verify that the Sign In button is clickable

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
Then the Sign In button should be clickable

#------------------------------------------------------------------------------------------------#

@UI
Scenario: Verify that the Remember me is textbox is clickable or not

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
Then the remember button should be clickable

#------------------------------------------------------------------------------------------------#
@SmokeTest
Scenario: Verify the Forget Password is displayed or not

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
And user will check ForgetPassword button is Enabled and Displayed or not

#--------------------------------------------------------------------------------------------------#

@SmokeTest
Scenario: Verify the SiginUp is displayed or not

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
And user will check SiginUp button is Enabled and Displayed or not






  