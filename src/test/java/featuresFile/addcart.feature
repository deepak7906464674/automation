Feature: add to cart function
Background: Comman steps
 Given lunch url site
When click accept cookkie and age popup
And click signin icon
And login with email and password
Then click signin button
And check basket is empty


#Scenario: add to card with plp page
#
#And search epod
#And select product 
#Then validate basket product

 Scenario: add to cart with pdp page
 
 And search epod
 And click product 
 And add to basket
Then validate basket product
