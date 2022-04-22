Feature: GET single user for text
  @get_single_user_for_text
  Scenario: GET - As admin I have be able to get detail single user
    Given I set GET api endpoints for single user for text
    When I send GET HTTP Request single user
    Then I receive HTTP response code 404 single user