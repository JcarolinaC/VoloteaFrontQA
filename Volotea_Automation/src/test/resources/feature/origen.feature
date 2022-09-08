Feature: destination countries
  As QA
  I want to Select the destination countries
  To verify the selection

  Scenario: country box

    Given the user is on the volotea page
    And click on the source field
    When select the country option
    Then validate that a list with a box of countries is visible