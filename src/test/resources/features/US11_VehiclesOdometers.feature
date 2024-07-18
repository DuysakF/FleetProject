@B34G1-183
Feature: Default


	@B34G1-179
	Scenario Outline: Store and Sales managers should see an error message “You do not have permission to perform this action.”
		Given the user logged in as "<userType>"
		    When user goes in to Odometer Page
		    Then user should see an error message "You do not have permission to perform this action."
		    Examples:
		      | userType      |
		      | sales manager |
		      | store manager |


	@B34G1-180
	Scenario:  Drivers should see the default page as 1.
		Scenario: Drivers should see the odometer page number
		    Given the user logged in as "driver"
		    When user goes in to Odometer Page
		    Then driver should be see page number "1"


	@B34G1-181
	Scenario: Divers should see the View Per Page is 25 by default.
		Scenario: Drivers should see the odometer page number
		    Given the user logged in as "driver"
		    When user goes in to Odometer Page
		    Then driver should be see view per page "25"