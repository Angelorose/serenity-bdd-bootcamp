
Feature: Bing image search
  

  
  Scenario: Validate that the images button is functional
    Given Browser "<browser>" and website "<website>" is open
    When User types the keyword "<keyword>" in the search bar
    And User clicks the search button 
    And User clicks the images tab 
    Then I validate the outcomes
    


    Examples: 
      | Browser| website          | keyword  | 
      | chrome |https://bing.com/ | puppies  |
      
