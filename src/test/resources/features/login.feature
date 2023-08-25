#Author: your.email@your.domain.com
#Keywords Summary :

@Regresion
Feature: Login to Orange Recap

@Login
  Scenario Outline: conectarse a la pagina
    Given abrir el navegador
    And llenar campo usuario<userName> y password<pass>
    And llegar a la opcion agregar empleado
    And llenar nombre<myName> y lastName<lastName>

    Examples: 
      | userName | pass     | myName  | lastName  |
      | Admin    | admin123 | roberto | rodriguez |
