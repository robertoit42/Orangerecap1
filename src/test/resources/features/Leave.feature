@Regresion
Feature: leave general

  @Tag
  Scenario Outline: llegar leavePage
    Given abrir el navegador
    And llenar campo usuario<userName> y password<pass>
    And llegar leavePage<employee>

    Examples: 
      | userName | pass     | employee       |
      | Admin    | admin123 | Anthony  Nolan |
