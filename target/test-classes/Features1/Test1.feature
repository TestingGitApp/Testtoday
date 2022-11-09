Feature: Sign up

  Scenario Outline: Sign up learningm upskills
    Given User navigates to learningm upskills page
    And user click on sign up
    When user enter  "<firstname>" firstname and "<lastname>" lastname
    And user enter "<email>" email id
    And user enter"<username>" username
    And user enter"<password>" password
    And user enter"<confirmPassword>" confirm password
    And user click on Register button
    Then user register successfully
    And user logout

    Examples: 
      | firstname | lastname | email           | username | password | confirmPassword |
      | Rama      | singh    | arti2@gmail.com | Rama006  | pass1@23 | pass1@23        |

  Scenario Outline: Sign in and sent a mail
    Given User navigates to learningm upskills page
    When user enter  "<username>" username and "<password>" password
    And user click on login button
    And user click on inbox
    And user click on compose message
    And user enter subject
    And user click on send message

    Examples: 
      | username | password |
      | Rama006  | pass1@23 |
