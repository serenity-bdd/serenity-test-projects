Narrative:
In order to provide some business value
As a user
I want to perform an some simple action, but I marked story as manual

Meta:
@manual
Scenario: Single scenario in story marked as Manual
Given I have prepared environment for simple action one
When I perform "simple action one"
Then I expect result for "simple action one" should be "success"
