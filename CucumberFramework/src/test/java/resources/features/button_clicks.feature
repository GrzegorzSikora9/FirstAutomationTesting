@ButtonClick
Feature: As a user I want to click on the button 

Background: 
	Given User navigate to Websiteuniversity
	When User scroll down and click on the button clicks 
	

Scenario: User click on the WebElementClick
	When User click on WebElementClick
	And Alert window is appering
	Then User click on the Close button  

@JavaScript
Scenario: User click on JavaScriptClick
	When User click on JavaScriptClick
	And Alert JavaScript window is appering
	Then User click on the JavaScript Close button 

Scenario: User click on ActionMove&Click
	When User click on ActionMove&Click
	And Alert ActionMove&Click window is appering
	Then User click on the ActionMove Close button    
 