Feature: Tour

  As an end user
  I want to select the travel options
  So That I can see all the results displayed

  Background:
    Given user is on the tours page

  Scenario Outline: User can successfully see all the tour results displayed
    When user selects destination "<country>"
    And click on "Find a Tour" button
    Then user could see the tour options displayed
    When user change the sort order on the search results to “Price (Low-High)"
    And click on "View More" button
    Then user could see more and all the results displayed
    Examples:
      |country  |
      |India    |




