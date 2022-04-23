Feature: User As an admin, I want to patch existing user
  @patch_user
  Scenario: PATCH - As admin I have be able to patch existing user
    Given I set PATCH api endpoints
    When I send PATCH HTTP Request
    Then I receive valid HTTP response code 200
    And I receive valid data for patch user