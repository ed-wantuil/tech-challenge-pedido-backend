Feature: Tests Api Customer

  Background:
    * url applicationUrl
    Given path '/'

  Scenario: Testando a realizacao de um checkout
    And path "checkout"
    And request {"customer":{"id":"4d1335a5-3627-42f3-8637-4e52b6e852bf"},"items":[{"product":"d3c97509-3d47-46f0-852a-d04d5a3b12f3","quantity":1,"price":10},{"product":"3bfa8cc8-0a8d-43c1-9cda-94484c069cd9","quantity":1,"price":10}],"created":"2023-10-30","amount":20}
    And header Content-Type = 'application/json'
    When method POST
    Then status 200

  Scenario: Testando realizar um checkout sem informar o cliente
    And path "checkout"
    And request {"items":[{"product":"d3c97509-3d47-46f0-852a-d04d5a3b12f3","quantity":1,"price":10},{"product":"3bfa8cc8-0a8d-43c1-9cda-94484c069cd9","quantity":1,"price":10}],"created":"2023-10-30","amount":20}
    And header Content-Type = 'application/json'
    When method POST
    Then status 200

  Scenario: Testando a busca de um pedido pelo id
    And path "order/find-by-id"
    And param id = "9ee53a51-0d52-47a7-9d2d-8d7f17be8415"
    And header Content-Type = 'application/json'
    When method GET
    Then status 200
    And match response.customer.id == "4d1335a5-3627-42f3-8637-4e52b6e852bf"
    And match response.customer.cpf == "758.679.480-48"
    And match response.customer.name == "João Silva"
    And match response.customer.email == "joao@silva.com"
    And match response.items[0].quantity == 1
    And match response.items[0].price == 10.0
    And match response.items[1].quantity == 1
    And match response.items[1].price == 10.0
    And match response.created == "2023-05-01"
    And match response.amount == 20.0
