@all
Feature: User Registration

Background:
Given Navigate to the register page


@register @mandatoryfields @smoke @regression
Scenario: Register with mandate fields
When Enter First name "Aditya" in firstname field
And Enter Last name "Yellapragada" in lastname field
And Enter email "aditya@test.com" in email field
And Enter Telephone "9618141430" in telephone field
And Enter Password "1234" in password field
And Enter Password confirm "1234" in password confirm field
And Hit continue button
Then Acount is created successfully

@regsiter @allfileds @smoke
Scenario: Register with all fields
When Enter First name "Aditya" in firstname field
And Enter Last name "Yellapragada" in lastname field
And Enter email "aditya@test.com" in email field
And Enter Telephone "9618141430" in telephone field
And Enter Password "1234" in password field
And Enter Password confirm "1234" in password confirm field
And Select "yes" for newsletter subscriber
And Select privacy policy field
And Hit continue button
Then Acount is created successfully

@register @withoutanyfields @regression
Scenario: Register without providing any fields
When User dont enter details in  any fields 
And Hit continue button
Then Validation thrown by the system

@register @duplicate @smoke @regression
Scenario: Register with duplicate email address
When Enter First name "Shiva" in firstname field
And Enter Last name "Yellapragada" in lastname field
And Enter email "aditya@test.com" in email field
And Enter Telephone "9618141431" in telephone field
And Enter Password "1234" in password field
And Enter Password confirm "12134" in password confirm field
And Select "No" for newsletter subscriber
And Select privacy policy field
And Hit continue button
Then Validation is thrown by the system as account is there for the user