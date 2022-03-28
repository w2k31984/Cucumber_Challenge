Feature: Tests en Netflix

  Scenario: ingresar a la página de login de Netflix
    Given que estoy en la página de Netflix
    When hago click en “Iniciar Sesión”
    Then accedo a la página de login
    And completo el campo de email
    And completo el campo de password