@TodoList
Feature: As a user I wan to add and delete some position from my list 

Background: 
	Given User navigate to website webdriveruniversity
	When User click on ToDoList button
	 
@TodoListScenario1
Scenario Outline: User add some position to list 
	When User write some "<position>" position and click enter button on keyboard 
	Then Position "<add>" should be added to list like a last one on list   
 
Examples: 
			|position 			| 		add 											|
			|Harry Potter read 	|		//li[contains(text(),'Harry Potter read')]	 	|
			|Buy new clothes 	|		//li[contains(text(),'Buy new clothes')] 		|
			|Programing learn	|		//li[contains(text(),'Programing learn')]		|

@TodoListScenario2
Scenario: User delete some position from list 
	When User delete position from a list  
	Then Position should be deleted   
 

 