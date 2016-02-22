Scenario: Multiple scenario in Story scenario three for action one - should be marked as Manual
Meta:
@manual
Given I have prepared environment for simple action three
When I perform "simple action three"
Then I expect result for "simple action three" should be "success"

Scenario: Multiple scenario in Story scenario three for action two - should be marked as Manual
Meta:
@manual
Given I have prepared environment for simple action three
When I perform "simple action three"
Then I expect result for "simple action three" should be "success"

