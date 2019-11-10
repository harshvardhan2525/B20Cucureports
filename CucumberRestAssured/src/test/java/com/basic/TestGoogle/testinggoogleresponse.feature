Feature: testing google website

Scenario: test google status code
Given I start rest assured testing
When I hit google website
Then I check status code for google response