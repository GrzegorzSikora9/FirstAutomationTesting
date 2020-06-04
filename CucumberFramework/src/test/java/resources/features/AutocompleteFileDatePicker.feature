@AutocompleteFileDatePicker
Feature: As a user I want to be able to chose something from a shop (autocomplete), upload file and pick a date 

Background: 
	Given User navigate to main website
	 
	@Autocomplete
	Scenario: User make a order and system should help him with that (autocomlpete)
		When User click on main page on Autocomplete text button 
		And input some text in textfield 
		And System give him autocomplete text 
		Then User is able to send order 
	
	@SendFile	
	Scenario: User send file 
		When User click on the FileUpload button on main page 
		And User choose file to send 
		When User click on Send button 
		Then File should be successfully sended 
	
	@PickDate			
	Scenario: User pick a date
		When user click on datepicker button on mainPage
		And User select date 
		Then date should be successfully selected  