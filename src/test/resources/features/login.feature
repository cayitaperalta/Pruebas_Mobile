Feature: Inicio de sesion y cierre de sesión

  Como usuario
  Yo quiero una opcion de inicio de sesion
  Para poder ingresar con mis credenciales a la app

  Given el esta en la pantalla de inicio de sesion

  Scenario: Inicio de sesion exitoso
   When el ingresa el usuario "standard_user" y el password "secret_sauce"
    Then el deberia poder ingresar a la aplicacion



  Scenario: Inicio y cierre de sesion exitoso
    When el ingresa el usuario "standard_user" y el password "secret_sauce"
    Then el deberia poder cerrar la sesion
    And el deberia poder ver la pantalla de login

  @Prueba
  Scenario: Inicio de sesion usuario generico
    When el inicia sesion con el usuario generico