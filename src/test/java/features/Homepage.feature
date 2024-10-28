Feature: Enter the URL abd Land on the Homepage
#--------------------------------------------------------------------------------------------#

Scenario Outline: User will serach the course by selecting the Category and Sub-Category
Given user will enter the url and land on homepage
Then user selects the category <Category>
Then user select the subcategory <subcategory>
And user will search for course <cousreName> and click on it.
Then user will click on enroll dropdown and select <option>
Then student will enter <Email> and <Password> and click on sigin button
And user will click on SiginIn button
Then user will click on enroll dropdown and select <option1>


Examples:
| Category               | subcategory          | cousreName                             |  option    | Email                | Password        | option1      |
| Information Technology | IT Infrastructure    | IT Support and Networking Essentials   |  enroll    |student58@student.com | studentpassword | enroll       |
| Information Technology | Software Development | Redux                                  |  enroll    |student58@student.com | studentpassword | enroll       |                                                      


#---------------------------------------------------------------------------------------------#

@browse
Scenario Outline: User will serach the course by selecting the Category and Sub-Category

Given user will enter the url and land on homepage
When user will click on SignIn
Then user will select on I am student
Then student will enter <Email> and <Password> and click on sigin button
Then user selects the category <Category>
Then user select the subcategory <subcategory>
And user will search for course <cousreName> and click on it.
Then user will click on enroll dropdown and select <option>


Examples:
 | Email                | Password        | Category               | subcategory          | cousreName                             |  option |  
 |student59@student.com | studentpassword | Information Technology | IT Infrastructure    | IT Support and Networking Essentials   |  enroll |   
 |student59@student.com | studentpassword | Information Technology | Software Development | Redux                                  |  enroll |                                                    




@Brokenlinks
Scenario: Check weather there is borken link on hmomepage or not.

Given user will enter the url and land on homepage
Then verfiy that all the links present on the homepage
