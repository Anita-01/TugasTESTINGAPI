Feature: User As an admin I want create new user
  @post_user
  Scenario: POST - As admin I have be able to add new user
    Given I set POST api endpoints
    When I send POST HTTP Request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user