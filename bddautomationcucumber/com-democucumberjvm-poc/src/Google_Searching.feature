Feature: Google Searching

  Scenario: Google Image search shows pictures
    Given the user opens a web browser
    And the user navigates to "https://www.google.com/"
    When the user enters "panda" into the search bar
    Then links related to "panda" are shown on the results page
    When the user clicks on the "Images" link at the top of the results page
    Then images related to "panda" are shown on the results pagesss
