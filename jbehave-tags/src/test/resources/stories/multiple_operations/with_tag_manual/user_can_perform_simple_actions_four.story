Scenario: Multiple scenario in Story scenario four for action one - should be marked as Manual
Meta:
@manual
Given I have prepared environment for simple action four
When I perform "simple action four"
Then I expect result for "simple action four" should be "success"

Scenario: Multiple scenario in Story scenario seven for action two - should be marked as PASSED
Given I have prepared environment for simple action four
When I perform "simple action four"
Then I expect result for "simple action four" should be "success"

