Feature: Login into the application

  Scenario: Successful login
    Given Pepito has an active account
    When he sends their valid credentials
    Then He can see that his login was successful

  Scenario:
    Given Pepito wants to remember something
    When he tries to remember foo
    Then he should get foo