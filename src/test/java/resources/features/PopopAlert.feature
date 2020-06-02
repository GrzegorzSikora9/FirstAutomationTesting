Feature: As a user i want o to click on the button to see some popup 

Background: 
	Given User navigate to Popup alert website 

@PopupAllert1
Scenario: As a user i want to be able to click on the button to see popup 
	When User click on the first Pop up 
	Then Alert box show up
	When User click on the second button 
	Then the second alert box should show up

@PopupAllert2	
Scenario: As a user i want to on trhid and fourth button 
	When User click on third button 
	Then Third allert box should show up 
	When User click on fourth button 
	Then Fourth alert box should appear  