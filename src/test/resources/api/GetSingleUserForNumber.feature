Feature: GET single user for number
  @get_single_user_for_number
  Scenario: GET - As admin I have be able to get detail single user
    Given I set GET api endpoints for single user for number
    When I send GET HTTP Request single user
    Then I receive HTTP response code 404 single user