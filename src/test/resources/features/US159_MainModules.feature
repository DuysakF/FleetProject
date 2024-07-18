@B34G1-187
Feature: Accessing main modules of the app

  Background: User is already on the login page
    Given the user is on the login page

  @storemanager
  Scenario: US1AC1TC1 Verify Store Managers see 8 module names
    Given the user logged in as "store manager"
    Then the user should see the following modules:
      | Dashboards           |
      | Fleet                |
      | Customers            |
      | Sales                |
      | Activities           |
      | Marketing            |
      | Reports & Segments   |
      | System               |

  @salesmanager
  Scenario: US1AC1TC2 Verify Sales Managers see 8 module names
    Given the user logged in as "sales manager"
    Then the user should see the following modules:
      | Dashboards           |
      | Fleet                |
      | Customers            |
      | Sales                |
      | Activities           |
      | Marketing            |
      | Reports & Segments   |
      | System               |

  @driver
  Scenario: US1AC2TC3 Verify Drivers see 4 module names
    Given the user logged in as "driver"
    Then the user should see the following modules:
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |
