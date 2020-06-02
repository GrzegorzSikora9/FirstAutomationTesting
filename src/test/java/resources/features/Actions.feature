@ActionFeature
Feature: As a user i want to do some actions on website

Background: 
	Given User navigate to website webuniversity

@DragandDrop
Scenario: User drag file to dropplace and dooble click on webelemtn
	When User drag file to dropplace and drop 
	Then Color and text should change 
	
	When User dooble click on webelement 
	Then Color should change 
@LinkandHold	
Scenario Outline: User click in one of 	three link and hold bottom button
	When User navigate to "<dropdownmenu>" dropdownmenu   
	When User see "<link>" link, he can clik in it
	Then The aler should show up
	 
	Examples: 
	
	|						dropdownmenu										| 					link																|	
	|			//button[contains(text(),'Hover Over Me First!')]				| //div[@class='dropdown hover']//a[@class='list-alert'][contains(text(),'Link 1')]		|	
	|			//button[contains(text(),'Hover Over Me Second!')]				| 								//div[2]//div[1]//a[1]									|	
	|			//button[contains(text(),'Hover Over Me Third!')] 				|								//div[3]//div[1]//a[1]									|
	|			//button[contains(text(),'Hover Over Me Third!')]				|								//body//a[2]											|