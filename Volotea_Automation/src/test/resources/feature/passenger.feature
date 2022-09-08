Feature: check list
  As QA
  I want to Select the number of passengers
  To verify the selection function number of people traveling

  Scenario: check list

    Given the user is on the volotea page
    And click on the passenger field
    When the list is displayed
    Then check that this
      | Adultos    | 1        |