Feature: GET list unknown
  @get_list_unknown
  Scenario: GET - As admin I have be able to get list unknown
    Given I set GET api endpoints for list unknown
    When I send GET HTTP Request list unknown
    Then I receive valid HTTP response code 200 list unknown
    And I receive valid data for detail list unknown