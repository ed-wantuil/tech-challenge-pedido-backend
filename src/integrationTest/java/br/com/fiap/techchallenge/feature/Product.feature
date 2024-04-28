Feature: Tests Api Customer

  Background:
    * url applicationUrl
    Given path '/'

  Scenario: Testando a criacao de um produto
    And path "product"
    And request {"name":"Pastel","category":"SNACK","price":8,"description":"Pastel","image":"base64"}
    And header Content-Type = 'application/json'
    When method POST
    Then status 200
