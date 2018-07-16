Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Inventario Delivrdapp
    Given me encuentro logeado en la pagina didierarias3@gmail.com Didier123
    When agrego un nuevo producto
      | nombre   | descripcion | sku     | precio  |
      | Portatil | Dell   | 12345 | 5000 |
    Then puedo visualizar los productos
