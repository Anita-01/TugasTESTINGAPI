Feature: GET single user by valid email
  @get_single_user_by_valid_email
  Scenario: GET - As admin I have be able to get detail single user
    Given I set GET api endpoints for single user by valid email
    When I send GET HTTP Request single user by valid email
    Then I receive valid HTTP response code 200 single user by valid email
    And I receive valid data for detail single user by valid email