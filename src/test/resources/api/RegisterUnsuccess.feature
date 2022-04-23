Feature: User As a user i want to register
  @register_unsuccessful
  Scenario: POST - As a user i want to unsuccessful register
    Given I set POST api endpoints for unsuccessful register
    When I send POST HTTP Request for unsuccessful register
    Then I receive valid HTTP response code 400
    And I receive message error for register