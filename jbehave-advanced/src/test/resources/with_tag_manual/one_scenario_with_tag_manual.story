Narrative:
In order to provide some business value
As a user
I want to perform an some simple action, and it is maked as manual

Scenario: Single scenario marked as manual
Meta:
@manual

Given I have prepared environment for simple action one
When I perform "simple action one"
Then I expect result for "simple action one" should be "success"
