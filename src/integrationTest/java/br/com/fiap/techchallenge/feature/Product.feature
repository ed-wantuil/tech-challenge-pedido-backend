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

  Scenario: Testando a atualizacao de um produto
    And path "product/3bfa8cc8-0a8d-43c1-9cda-94484c069cd9"
    And request {"id":"3bfa8cc8-0a8d-43c1-9cda-94484c069cd9","name":"Pastel","category":"SNACK","price":8,"description":"Pastel","image":"base64"}
    And header Content-Type = 'application/json'
    When method PUT
    Then status 200

  Scenario: Testando listar os produtos
    And path "product"
    And header Content-Type = 'application/json'
    When method GET
    Then status 200
    And match response[0].name == "Hamburger"
    And match response[0].category == "SNACK"
    And match response[0].price == 10.0
    And match response[0].description == "Hamburger"
    And match response[0].image == "base64"

  Scenario: Testando a busca de um produto pela categoria
    And path "product/findByCategory"
    And param category = "SNACK"
    And header Content-Type = 'application/json'
    When method GET
    Then status 200
    And match response[0].name == "Hamburger"
    And match response[0].category == "SNACK"
    And match response[0].price == 10.0
    And match response[0].description == "Hamburger"
    And match response[0].image == "base64"

  Scenario: Testando remover um produto pelo id
    And path "product/c8634a8a-91df-4fe7-b3e9-d978c2b37384"
    And header Content-Type = 'application/json'
    When method DELETE
    Then status 200