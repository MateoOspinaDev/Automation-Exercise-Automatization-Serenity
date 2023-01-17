Feature: Register into the application

  Scenario: Successful login
    Given Pepito is a person with the correct data to register
    And he fill the first form
    And he fill the second form
    When he complete the registration
    Then He can see that his registration was successful
