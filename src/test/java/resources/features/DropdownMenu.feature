@DropdownMenuFeature
Feature: As a user i want to choose my favorite options on Website

Background: 
	Given User navigate to Webdriveruniversity website
	When User click on Dropdownmenu on mainPage 

@DropdownMenu
Scenario Outline: As a user i want to choose my language, IDE and Script from Dropdown Menu
	And User select favorite "<Language>" language 
	And User select favorite "<IDE>" IDE
	And User select favorite "<Script>" Script
	Then Options should be successfully saved 
	
	Examples:  
	
|Language				| 					IDE		| 				Script			|
|java				    | 			eclipse			| 				html			|
|c#						|			 maven			|				css 			|
|python					|			testng			|				javascript 		|
|sql					|			junit			|				jquery			|

@Checkbox		
Scenario: As a user I want to select my favorite options from Checkboxe and color from RadioButton
	And User select favorite options  
	And User select favorite color
	Then Checkbox and RadioButton options should save
@AvaibleThings
Scenario: As a user I want to select avaible thing from Menu- Selected and Disabled
	And User want to select avaible product from menu 
	Then Products should be successfully selected
	
	