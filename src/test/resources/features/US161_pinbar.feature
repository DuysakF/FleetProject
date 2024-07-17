
@B34G1-178

Feature: Pinbar
	Agile Story:
	As a user, I want to learn how to use the pinbar.

	Background: For all scenarios user is on the login page
		Given the user is on the login page

	@B34G1-175

		Scenario Outline: Verify users see the expected text "How To Use Pinbar"


		    Given the user logged in as "<userType>"
		    When the user clicks Learn how to use this space link
		    Then the user sees "How To Use Pinbar" header
		    Examples:
		      | userType      |
		      | driver        |
		      | sales manager |
		      | store manager |

	
	@B34G1-176

		Scenario Outline: Verify users see the expected text "Use pin icon on the right top corner of page to create fast access link in the pinbar. "
		

		    Given the user logged in as "<userType>"
		    When the user clicks Learn how to use this space link
		    Then the user sees "Use pin icon on the right top corner of page to create fast access link in the pinbar." text
		
		    Examples:
		      | userType      |
		      | driver        |
		      | sales manager |
		      | store manager |	

	
	@B34G1-177

		Scenario Outline: Verify users see an image on the page

		    Given the user logged in as "<userType>"
		    When the user clicks Learn how to use this space link
		    Then users should see an image on the page.
		
		    Examples:
		      | userType      |
		      | driver        |
		      | sales manager |
		      | store manager |