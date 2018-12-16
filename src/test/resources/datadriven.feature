Feature: datadriven

  Scenario: Available menu items
    Given items available
      | Name      | Available | Quantity |
      | File      | true      | 5        |
      | Edit      | false     | 8        |
      | About     | true      | 2        |
