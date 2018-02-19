
@Sprint3
Feature: JIRA Story 1
	
  @Scenario1

  Scenario Outline: Login Demo Application with multiple times
    Given Open Demo website
    When Enter Login Details "<username>" "<password>"
    And Click submit button
    Then Verify Home page and verify title

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mercury  | mercury  |
      | mercury  | mercury  |
