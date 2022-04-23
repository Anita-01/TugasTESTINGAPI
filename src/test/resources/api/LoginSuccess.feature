Feature: User As a user i want to login
  @login_success
  Scenario: POST - As a user i want to success login
    Given I set POST api endpoints for login
    When I send POST HTTP Request for login
    Then I receive valid HTTP response code 200
    And I receive valid token for login