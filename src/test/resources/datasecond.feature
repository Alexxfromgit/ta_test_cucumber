Feature: datasecond

  Scenario Outline:
    Given data items '<searchTerm>' and '<result>'
    When print to console
    Then check the '<result>'

    Examples:
      | searchTerm | result                |
      | mercury    | Mercury may refer to: |
      | max        | Max may refer to:     |
