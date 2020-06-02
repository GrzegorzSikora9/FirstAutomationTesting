@AcordingItems
Feature: As a user i want to see text when i click on the tab

Background:

	Given User navigate to Webuniversity website
	When User click Accordion Text Affects    

Scenario Outline: As a user I click on open tab and text should be nonvisible

	When User click on "<tab>" tab 
	Then Text "<text1>" should be visible  
	When User click on open "<tab>" 
	Then Text "<text2>" should be hidden   

	Examples: 
	|			tab								| 				text1																	| 					text2         										|   
	|//button[@id='manual-testing-accordion']   | 		//p[contains(text(),'Manual testing has for some time been the most pop')] 		|	//button[@class='accordion active'][@id='manual-testing-accordion']	|
	|//button[@id='cucumber-accordion']		    | 		//p[contains(text(),'Cucumber (BDD) simplifies the requirement capturin')] 		|	//button[@class='accordion active'][@id='cucumber-accordion']    	|
	|//button[@id='automation-accordion']       | 		//p[contains(text(),'Automation testing has been steadily grown in popu')] 		|	//button[@class='accordion active'][@id='automation-accordion']		|
	|//button[@id='click-accordion']		    | 		//div[@id='timeout']													 		|	//button[@class='accordion active'][@id='click-accordion']			|