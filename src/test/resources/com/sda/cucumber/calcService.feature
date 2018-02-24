Feature: CalcService
  Scenario: should Add Digits In String And Produce Result
    Given I initialize CalcService
    And I pass text value to compute

    When I execute calculate method
    Then I get correct result

    Scenario: should return 0 when null text is passed
      Given I initialize CalcService
      And I pass null text value
      When I execute calculate method
      Then I get 0 as a result

  Scenario: should return 0 when blank text is passed
    Given I initialize CalcService
    And I pass blank text value
    When I execute calculate method
    Then I get 0 as a result

  Scenario: should return correct value when mixed with letters text is passed
    Given I initialize CalcService
    And I pass text with letters
    When I execute calculate method
    Then I get result for text with letters

