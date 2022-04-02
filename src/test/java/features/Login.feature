Feature: Application Login 

Scenario: Homepage default login 
	Given User is on netbanking landing page 
	When User logins into the application with "cd@ab.com" and "Passw0rd"
	Then Homepage is populated 
	And Cards are displayed "true"
	
Scenario: Homepage default login 
	Given User is on netbanking landing page 
	When User logins into the application with "ab@cd.com" and "Password1!"
	Then Homepage is populated 
	And Cards are displayed "false"
    