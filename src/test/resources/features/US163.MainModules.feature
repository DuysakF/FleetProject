@driver
Feature:As a user,I want to view columns on the Vehicles Model

  Scenario: Drivers should not able to access the Vehicle Model page
    Given the user logged in as "driver"
    And user goes on  Vehicles Model
    Then users should see a message

  Scenario Outline: Both user should see ten columns on the Vehicle Model page
    Given the user logged in as "<userType>"
    And user goes on  Vehicles Model
    Then user sees ten columns on the Vehicle Model page

      |MODEL NAME|
      |MAKE|
      |CAN BE REQUESTED|
      |CVVI|
      |CO2 FEE (/MONTH)|
      |COST (DEPRECIATED)|
      |TOTAL COST (DEPRECIATED)|
      |CO2 EMISSIONS|
      |FUEL TYPE|
      |VENDORS|

    Examples:
      |userType     |
      |sales manager|
      |store manager|






