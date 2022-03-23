Feature: Test de una calculadora

  Scenario: realizar una suma
    Given que tengo una calculadora
    When sumo 2 y 4
    Then el resultado es 6


  Scenario: realizar una resta
    Given que tengo una calculadora
    When resto 5 y 2
    Then el resultado es 3


  Scenario: realizar una multiplicacion
    Given que tengo una calculadora
    When multiplico 3 y 5
    Then el resultado es 15


  Scenario: realizar una division
    Given que tengo una calculadora
    When divido 20 y 4
    Then el resultado es 2