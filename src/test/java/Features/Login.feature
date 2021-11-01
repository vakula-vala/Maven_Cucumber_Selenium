Feature: Login scenario

  Scenario: Validating login process

    Given User launch browser

    When User enters "standard_user" and "secret_sauce"

    Then User should be able to login successfully