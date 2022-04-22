Feature: User As an admin, I want to update existing user
  @put_user
  Scenario: PUT - As admin I have be able to update existing user
    Given I set PUT api endpoints
    When I send PUT HTTP Request
    Then I receive valid HTTP response code 200
    And I receive valid data for updated user