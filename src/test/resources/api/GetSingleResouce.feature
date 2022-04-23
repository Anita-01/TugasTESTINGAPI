Feature: Get single resource
  @get_single_resource
  Scenario: GET - As admin I have be able to get detail single resource
    Given I set GET api endpoints for single resource
    When I send GET HTTP Request single resource
    Then I receive valid HTTP response code 200 single resource
    And I receive valid data for detail single resource