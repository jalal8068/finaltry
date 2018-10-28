@Homepage
Feature: validate ntl taxi home page
Scenario Outline: validate ntl taxi with validate dataset
Given Open browser as <BROWSER>
Then Enter username as <USERNAME>
Then Enter mobilenumber as <MOBILENUMBER> 
Then Enter pickup address as <PICKUPADDRESS>
And Enter dropplace as <DROPPLACE>
And Select cab type as <CABTYPE>
When Click book later
But Dont click book
Examples:
|BROWSER|USERNAME|MOBILENUMBER|PICKUPADDRESS|DROPPLACE|CABTYPE|
|firefox|vmetrya|1111|adyar|adyar|sedan|
|firefox|vmetrya|2222|adyar|adyar|sedan|
|firefox|vmetrya|3333|adyar|adyar|sedan|
|firefox|vmetrya|4444|adyar|adyar|sedan|
|firefox|vmetrya|5555|adyar|adyar|sedan|



#/Feature: validate ntl taxi home page
#/Scenario: validate ntl taxi with validate dataset
#/Given Open browser as firefox
#/Then Enter username as abc
#/Then Enter mobilenumber as 9092818068 
#/Then Enter pickup address as velachery
#/And Enter dropplace as adyar
#/And Select cab type as sedan
#/When Click book later
#/But Dont click book
