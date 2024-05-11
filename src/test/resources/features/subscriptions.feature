Feature: Create subscription

  @SubscriptionOk
  Scenario: Free trial subscription
    Given The "user" is in the package subscription section
    When Select the Free trial package
    And Fill in the basic information "Bayron", "Alexis", "byrt@gmail.com", "3665874444"
    And Click on next button
    And Fill in the company information
    And Click on second next button
    Then Should display the message satisfactory

  @SubscriptionOutline
  Scenario Outline: Free trial subscription
    Given The "user" is in the package subscription section
    When Select the Free trial package
    And Fill in the basic information "<firstName>", "<lastName>", "<email>", "<phone>"
    And Click on next button
    And Fill in the company information
    And Click on second next button
    Then Should display the message satisfactory

  Examples:
    | firstName  | lastName   | email                   | phone      |
    | Alexis     | Granja     | byorozcogranja@outlook. | hola       |
    | 15dgt522   | ******     | eyorozcnja@gmail.com    | 2          |
    | ñaño       | thela{/)   | eyorozcnja@hotmail.com  | .....      |
    | Alejandra  | Lopez      | Alejandra@hotmail.com   | 3069884488 |
