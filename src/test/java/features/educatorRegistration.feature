Feature: Educator Registration Page
#--------------------------------------------------------------------------------------------#

Scenario Outline: Educator will click on SignUp directly

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am teacher
Then user will click on SignUp Here
And user will click on SignUp button directly
Then  the <Message> message should display

Examples:
| Message                 |
| All fields are required |

#---------------------------------------------------------------------------------------------#


Scenario Outline: Educator will click on SiginUp button.

Given user will enter the url and land on homepage
When  user will click on SignIn
Then  user will select on I am teacher
Then  user will click on SignUp Here
Then user enter the name <Name> and email <Email>
And user will click on SignUp button directly
Then  the <Message> message should display

Examples:
| Name         | Email                    | Message                 |
| Emma Johnson | emma.johnson@example.com | All fields are required |

#----------------------------------------------------------------------------------------------#


Scenario Outline: Educator will click on SiginUp button.

Given user will enter the url and land on homepage
When  user will click on SignIn
Then  user will select on I am teacher
Then  user will click on SignUp Here
Then user enter the phoneNumber <Phone> and password <password>
And user will click on SignUp button directly
Then  the <Message> message should display

Examples:
| Phone         | password      | Message                 |
| 7350749314    | Welcome3108@  | All fields are required |

#------------------------------------------------------------------------------------------------#



Scenario Outline: User we enter wrong email format

Given user will enter the url and land on homepage
When  user will click on SignIn
Then  user will select on I am teacher
Then  user will click on SignUp Here
Then user enter the name <Name> email <Email> phoneNumber <Phoneno> feild <Fieldteaching> subject <Subject> Passwsord <password> and Confrimpassword <comfirmpassword>
And user will click on Check box
And user will click on SignUp button directly
Then  the <Message> message should display


Examples:
| Name         |   Email                   | Phoneno    | Fieldteaching   |    Subject     | password   | comfirmpassword  | Message                            |
|Emma Johnson  | emma.johnsonexample.com   | 1234567891 |   Academics     |    Science     | 123456789  | 123456789        | Please enter a valid Email address |
|Emma Johnson  | emma.johnson@examplecom   | 1234567891 |   Academics     |    Science     | 123456789  | 123456789        | Please enter a valid Email address  |
|Emma Johnson  | emma  johnson@examplecom  | 1234567891 |   Academics     |    Science     | 123456789  | 123456789        | Please enter a valid Email address  |
|Emma Johnson  | emma.johnson@example.com  | 123456789  |   Academics     |    Science     | 123456789  | 123456789        |  Please provide a valid Phone Number |
|Emma Johnson  | emma.johnson@example.com  | 12345678912|   Academics     |    Science     | 123456789  | 123456789        |  Please provide a valid Phone Number |
|Emma Johnson  | emma.johnson@example.com  | 1@34567891 |   Academics     |    Science     | 123456789  | 123456789        |  Please provide a valid Phone Number |
|Emma Johnson  | emma.johnson@example.com  | 12345 6789 |   Academics     |    Science     | 123456789  | 123456789        |  Please provide a valid Phone Number |
|Emma Johnson  | emma.johnson@example.com  | 1@34@6789  |   Academics     |    Science     |123456789   | 123456789        |  Please provide a valid Phone Number |
|Emma Johnson  | emma.johnson@example.com  | 1234567891 |   Academics     |    Science     | 1234567    | 1234567          |  Password length must be at least 8 chars |
|Emma Johnson  | emma.johnson@example.com  | 1234567891 |   Academics     |    Science     | 1234  7    | 1234  7          |  Password length must be at least 8 chars |

#----------------------------------------------------------------------------------------------------------------------------------------#


Scenario Outline: Check weather without clicking on 
Given user will enter the url and land on homepage
When  user will click on SignIn
Then  user will select on I am teacher
Then  user will click on SignUp Here
Then user enter the name <Name> email <Email> phoneNumber <Phoneno> feild <Fieldteaching> subject <Subject> Passwsord <password> and Confrimpassword <comfirmpassword>
And user will click on SignUp button directly
Then  the <Message> message should display


Examples:
| Name         |   Email                   | Phoneno    | Fieldteaching   |    Subject     | password   | comfirmpassword  | Message                               |
|Emma Johnson  | emma.johnsonexample.com   | 1234567891 |   Academics     |    Science     | 123456789  | 123456789        |You must agree to terms and Conditions.|


#----------------------------------------------------------------------------------------------------------------------------------------#


Scenario Outline: Check weather SiginUp button is enabled and displayed or not 

Given user will enter the url and land on homepage
When  user will click on SignIn
Then  user will select on I am teacher
Then  user will click on SignUp Here
And  SiguUp button should enabled and displayed

#----------------------------------------------------------------------------------------------------------------------------------------#


Scenario Outline: Check weather SiginUp button is enabled and displayed or not 

Given user will enter the url and land on homepage
When  user will click on SignIn
Then  user will select on I am teacher
Then  user will click on SignUp Here
And   LoginHere button should enabled and displayed
 










  