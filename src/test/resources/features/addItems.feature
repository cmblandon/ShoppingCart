Feature: Add multiple items to cart
  As a web user
  I want to add items in my shopping cart
  To perform my purchase

  Background: User is on home page
    Given the user is on homepage
    Then the user clicks women

  Scenario: User can add women blouse
    And user clicks tops
    And user clicks blouses
    And user clicks on add to cart
    Given the user clicks on continue shopping
    Then the user is returned to the homepage

  Scenario: User can add women evening dress
    And user clicks dresses
    And User clicks evening dresses
    And user clicks on (Quick View) printed dress
    And user clicks on add to cart from pop up
    Given the user clicks on continue shopping
    Then the user is returned to the homepage

  Scenario: user verifies shopping cart has 2 items in cart
    Given the user is on homepage
    Then the user clicks women
    And user clicks tops
    And user clicks blouses
    And user clicks on add to cart
    Given the user clicks on continue shopping
    Then the user clicks women
    And user clicks dresses
    And User clicks evening dresses
    And user clicks on (Quick View) printed dress
    And user clicks on add to cart from pop up
    Given the user clicks on continue shopping

