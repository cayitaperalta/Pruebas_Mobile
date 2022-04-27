Feature: Compras

Given el esta en la pantalla de inicio de sesion


  Scenario: Compra de Productos
  When el inicia sesion con el usuario generico
  Then el deberia poder comprar productos
  And validar el carrito de compras

  @Test1
  Scenario: Compra de BackPack
    When el inicia sesion con el usuario generico
    Then el deberia poder comprar el Producto
    And validar el producto en el carrito de compras