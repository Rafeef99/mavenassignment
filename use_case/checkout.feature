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

Feature: checkout 

Scenario: Two banans scanned separately
Given the price of a "banana" is 40
When I checkout 1 "banana"
And I checkout 1 "banana"
Then the total price should be 80

Scenario: A banana and Apple
Given the price of a "banana" is 40
And the price of a "apple" is 25
When I checkout 1 "banana"
And I checkout 1 "apple"
Then the total price should be 65

