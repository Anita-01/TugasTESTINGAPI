Feature: GET list user for minus
  @get_list_user_for_minus
  Scenario: GET - As admin I have be able to get list user
    Given I set GET api endpoints for list user for minus
    When I send GET HTTP Request list user
    Then I receive valid HTTP response code 404 list user