#added scenario
Feature: From Step
Scenario: From - Patient App Web - Basic

Given Patient navigate to activity list as "user.provied@medable.com"
And Patient select From Step Task on activity list page
And Patient should see From Step Task task ready to start
And Patient completes Form step with values

|Type		               |Value		           |
|Email Step	           |a@a.com            |
|Text Step	           |Automation         |
|Numeric Step	         |21		             |
|Value Picker Step     |Option 1           |
|Boolean Step	         |True	             |
|Continuous Scale Step |5.5 	             |
|Integer Scale Step    |5		               |
|Location Step	       |Cordoba,Argentina  |
|text Scale Step       |1		               |
|Time Interval Step    |2.2		             | 
|Time of Day Step      |1 1 PM             |

And Patient click next button in step page
And Patiend click skip button in step page
And Patient should see the complete step page
And Patient click on done button in step page
Then Patient should see the Activity list page
And Patient should see Form Step Taks completed
