
@tag
Feature: Travel page test case
  Scenario: Successful navigation in Travel page
    Given Browser and website "<website>" is open
    When User click the 3 dot option and choose Travel
    And User search their desired destination "<destination>" to port
    Then Validates if the header text contains this "<text>" text
    
    
    Examples: 
      | website 							| destination | text         |
      | https://www.bing.com/ | France      | Destinations |
 