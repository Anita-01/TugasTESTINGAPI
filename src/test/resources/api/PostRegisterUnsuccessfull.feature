Feature: POST Register Unsuccessfull
  @post_register_unsuccessfull
  Scenario: POST - As admin I have be ablle to post register unsuccessfull
    Given I am on the sign up page
    When I enter username
    Then I should see sign up and receive unvalid HTTP respondse code 400
    And I receive unvalSid data for wrong email