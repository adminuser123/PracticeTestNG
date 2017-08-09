#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Creat shipment
	I want to creat Shipment to see shipment functionality works properly

@tag1
Scenario: Fill up the whole form using valid data.
Given I want to login first to navigate create shipment page
	
When I fill up all fields using valid data 
	And click on next page button 
	
Then it should navigatet to the next page of create shipment
	And finish creat shipment process.

@tag2
Scenario Outline: Title of your scenario outline
Given I want to write a step with <name>
When I check for the <value> in step
Then I verify the <status> in step

Examples:
    | name  |value | status |
    | name1 |  5   | success|
    | name2 |  7   | Fail   |
