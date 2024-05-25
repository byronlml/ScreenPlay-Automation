Feature: Create subscription

  @SubscriptionOk
  Scenario: Free trial subscription
    Given The "user" is in the package subscription section
    When Select the Free trial package
    And Fill in the basic information "Bayron", "Alexis", "byrtlioalexllo@gmail.com", "3665874444"
    And Click on next button
    And Fill in the company information
    And Click on second next button
    Then Should display the message satisfactory

  @SubscriptionMessage
  Scenario: Free trial subscription validation messages
    Given The "user" is in the package subscription section
    When Select the Free trial package
    And Fill in the basic information "1", "maxrrrrrrrrrrrrrrrrrrrrrrrrrttttttttttttttttttttttt", "by@outlook.", "v"
    And Check for validation messages

  @SubscriptionOutline
  Scenario Outline: Free trial subscription
    Given The "user" is in the package subscription section
    When Select the Free trial package
    And Fill in the basic information "<firstName>", "<lastName>", "<email>", "<phone>"
    And Verify if Next button is disabled

  Examples:
    | firstName  | lastName   | email                   | phone      |
    | 1          | maxrrrrrrrrrrrrrrrrrrrrrrrrrttttttttttttttttttttttt      | byorozcogranja@outlook. |  v     |
    | prueba on  | good       | good@hotmail.com        |  |
    | test       | infor      |                         | 4fv45r65f8 |

