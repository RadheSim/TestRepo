Feature: Login to site by adding username and password
  
  Scenario: Login to site for the  application
    Given Launch Site
    When Enter username
    And Enter Password
    And Click on Sign In Button
    Then Site should be launched successfully
     
    
    
    