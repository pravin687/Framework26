@Inventory
Feature: Inventory page

  Background: 
    Given I am on the saucedemo login page
    When I entered valid username and password
    And I click on login button

  @Inventory_add_to_cart @Sanity
  Scenario: Add to cart for sauce lab backpack
   When I click on add to cart for sauce lab backpack
   Then I verify remove tag for added product
   
  
