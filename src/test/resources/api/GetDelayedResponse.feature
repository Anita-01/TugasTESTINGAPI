Feature: GET delayed response
  @get_delayed_response
  Scenario: GET - As admin I have be able to get delayed response
    Given I set GET api endpoints for delayed response
    When I send GET HTTP Request delayed response
    Then I receive valid HTTP response code 200 delayed response
    And I receive valid data for detail delayed response