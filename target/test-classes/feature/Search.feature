@all
Feature: User Search 

# The below statement demonstartes the use of background keyword. When there is same step repeated number of times, then we use back ground and write one time.

Background:
Given User opens the application

@search @valid @smoke @regression
Scenario: To search with valid product
When User enters valid product name into the search
And User clicks on search button
Then Valid product should be displayed

@search @invalid @regression
Scenario: To search with invalid product
When User enters invalid product name into the search
And User clicks on search button
Then Validation should be thrown by the system stating that no search results

@search @empty @smoke
Scenario: To search with empty field
When User enters nothing into the search
And User clicks on search button
Then Validation should be thrown by the system stating that no search results