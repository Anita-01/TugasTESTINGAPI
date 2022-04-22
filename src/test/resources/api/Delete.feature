Feature: User As an admin, I want to delete existing user
  @delete_user
  Scenario: DELETE - As admin I have be able to delete existing user
    Given I set DELETE api endpoints
    When I send DELETE HTTP Request
    Then I receive valid HTTP response code 204