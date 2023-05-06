Feature: This is contract page functionality


@Jahan
Scenario: Verify user can contract by sending message
Given Open Demoblaze "<URL>" Application 
Then Click cntractt
Then Enter contract email
Then Enter contract name
Then Enter contract message
Then Click send contract
Then Verify user can contract by sending message