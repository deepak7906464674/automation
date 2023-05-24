Feature: Login Function
Scenario: verify under age and to navigate google 
Given lunch url site 
When click accept cookkie and under age button
And  navigate to google  

Scenario: fill the signup form
Given lunch url site
When click accept cookkie and age popup
And click signin icon
And click no and click signup with email
And fill form and create account button
Then validate message 



Scenario: login vuse
Given lunch url site
When click accept cookkie and age popup
And click signin icon
And login with email and password
Then click signin button

Scenario: forget password
Given lunch url site
When click accept cookkie and age popup
And click signin icon
And click forget password and enter email and submit
Then validate message forget pasword






