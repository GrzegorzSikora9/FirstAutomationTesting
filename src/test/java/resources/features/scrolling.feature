@Scrolling
Feature: As a user i want to scroll around my website 

Background: 	
	Given User navigate to Just scroll around website
@Scrolling1
Scenario:  User is scroling  to scroll me first field
	When User scroll to fiel text me first 
	Then Text should change 
@Scrolling2	
Scenario: User scroll around to fields 
	When user scroll around the fields 
	Then numbers on fields should change 	 