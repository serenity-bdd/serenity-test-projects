Scenario: Single scenario in Story for action three - should be marked as Manual
Meta:
@manual
Given I have prepared environment for simple action three
When I perform "simple action three"
Then I expect result for "simple action three" should be "success"
