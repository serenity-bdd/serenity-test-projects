Narrative:
In order to provide some business value
As a user
I want to perform an some simple action, and it is maked as ingore

Meta:
@ignore

Scenario: Single scenario marked as ignore
Given I have prepared environment for simple action one
When I perform "simple action one"
Then I expect result for "simple action one" should be "success"
