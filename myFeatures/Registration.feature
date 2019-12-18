Feature: procedure for validation DemoWebShop

  Scenario: validation for registration
    Given DemoWebShop website is launched
    And user clicks on register button
    When user provides proper data
    Then clicks on register button for registration

  Scenario Outline: validation for login
    Given application launched
    When user enters registered valid username "<uname>"
    And valid password in respective field "<pswrd>"
    Then user clicks on login button for login validation

    Examples: 
      | uname | pswrd    |
      | john  | bravo123 |
      | jane  | den234   |
      | ally  | solly345 |
