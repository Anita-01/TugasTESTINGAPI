Feature: User As a user i want to login
  @login_unsuccessful
  Scenario: POST - As a user i want to unsuccessful login
    Given I set POST api endpoints for unsuccessful login
    When I send POST HTTP Request for unsuccessful login
    Then I receive valid HTTP response code 400
    And I receive message error