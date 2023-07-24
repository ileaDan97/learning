Feature: Navigate to website

  Scenario: Navigate to Trivago page
    Given The user navigates to Trivago page
    And Accept cookies on Trivago page
    And Click on search filed
    And Search for a city and check if the city was selected
    And Select a day from calendar
    And Select 2 children from guest and room option
    Then Select age for the children
    And Click on apply button