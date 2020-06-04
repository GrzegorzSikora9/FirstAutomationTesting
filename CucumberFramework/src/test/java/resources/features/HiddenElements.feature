@HiddenElements
Feature: As a user i want to be able to click on hidden elements and see information

Background: 
	Given User navigat to URL 
	When User scroll down page and click hidden elements 
	
	Scenario: User click on hidden elements 
		When user click in button number one 
		Then Alert should show up
		
		When User click in button number two 
		Then alert number two should show up
		
		When user click in button number three 
		Then alert number three should show up