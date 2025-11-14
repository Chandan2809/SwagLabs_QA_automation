Feature: Add Products to the SwagLab
  
@AddProductSwagLab
Scenario: Add products to the Swag Lab cart
    When  Click on Add to cart
    Then Click on SwagLab Cart Icon
    Then click on Checkout button
    And  Enter the User details
    Then Click on Continue button
    And  Click on Finish button
    Then Click on the Home button
   
    