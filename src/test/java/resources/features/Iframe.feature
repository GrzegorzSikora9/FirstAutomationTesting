@Iframe
Feature: User want to buy some product in shop and send message via Iframe


		Background:
		Given User navigate to University website
		When User scoll down page to Iframe button
		When User click on Iframe button, user should be navigate to shop website

		@Iframe1
		Scenario Outline: Product 
		When User click on our product button
		And user click on product "<product>"
		Then User should get access to promocode "<promocode>" 

		Examples:
		|	product 						|	promocode |
		|	//div[@id='container-product3']	| promocode1  |
		|	//div[@id='container-product1']	| promocode2  |



		@Iframe2
		Scenario Outline: Contact Us 
		When User click on Contact us tab
		And User fill name "<name>"
		And User fill lastname "<lastname>"
		And User fill mail address "<mail>"
		And User fill comment "<comment>"
		Then message should be successfully sended

		Examples:

		|name   | 		lastname		| 		mail				| 		comment				|
		|Greg   | 		Sikora			| 		1234@gmail.com		| 		comment1234			|
		|Monika | 		Sikora			| 		5678@gmail.com		| 		comment5678			|