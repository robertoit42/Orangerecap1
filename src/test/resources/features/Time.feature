#Author: your.email@your.domain.com

@Regresion
Feature: Time Page

  
  @tag1
  Scenario Outline: Title of your scenario
    Given abrir el navegador
    And llenar campo usuario<userName> y password<pass>
    And llegar TimePage


 Examples: 
      | userName | pass     |
      | Admin    | admin123 |
