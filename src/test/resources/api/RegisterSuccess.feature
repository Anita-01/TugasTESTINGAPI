Feature: User As an admin I want register new user
  @register_success
  Scenario: POST - As admin I have be able to create new user
    Given I set POST api endpoints for register
    When I send POST HTTP Request for register
    Then I receive valid HTTP response code 200 for register
    And I receive valid data for new user for register