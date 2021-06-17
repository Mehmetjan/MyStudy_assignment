Feature: Form Step

  @smoke
  Scenario: Form - Patient App Web - Basic
    Given Patient navigate to activity list as "carlos.escribano+chall3@medable.com"
    Then Patient select Form Step Task on activity list page
    And Patient completes Form step with values
      | Type                  | Value             |
      | Email Step            | a@a.com           |
      | Text Step             | Automation        |
      | Numeric Step          |                21 |
      | Value Picker Step     | Option 1          |
      | Boolean Step          | True              |
      | Continuous Scale Step |               5.5 |
      | Integer Scale Step    |                 5 |
      | Location Step         | Cordoba,Argentina |
      | text Scale Step       |                 1 |
      | Time Interval Step    | 2-2               |
      | Time of Day Step      | 1-1-PM            |
    #And Patient click next button in step page
    #And Patient click skip button in next page
    #And Patient should see the completion step page
    #And Patient click done button in step page
    #Then Patient should see the Activity list page
    #And Patient should see Form Step Task completed
    #And I type data
   
