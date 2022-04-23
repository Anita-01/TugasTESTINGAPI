Feature: Get single user not found
  @get_single_user_not_found
  Scenario: GET - As admin I have be able to get detail single user not found
    Given I set GET api endpoints for single user not found
    When I send GET HTTP Request single user not found
    Then I receive valid HTTP response code 404 single user not found