Feature: Student will Enter the credentials and login to the application.

@Credentials
Scenario Outline: Student will enter will login and enroll the course
Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
Then student will enter <Email> and <Password> and click on sigin button
Then user selects the category <Category>
Then user select the subcategory <subcategory>
And user will search for course <cousreName> and click on it.
Then user will click on enroll dropdown and select <option>

Examples:
|  Email                | Password        | Category             | subcategory          | cousreName                                                    | option             |                           
|  student@student.com | studentpassword | Information Technology | IT Infrastructure    | IT Support & Network Essentials                               | start subscription |
|  student@student.com | studentpassword | Information Technology | IT Infrastructure    | IT Support & Network Essentials                               | enroll             |

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------#

@Dashboard
Scenario Outline: Student will enter will login and enroll the course
Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
Then student will enter <Email> and <Password> and click on sigin button
Then click on student menu
And click on Dasboard
Then check the Enrolled Cousre number


Examples:
|  Email                 | Password        |
|  student52@student.com | studentpassword |
|  student51@student.com | studentpassword |











  