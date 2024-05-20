Feature: Tests Api Customer

  Background:
    * url applicationUrl
    Given path '/'

  Scenario: Testando a criacao de um cliente
    And path "customer"
    And request { cpf: "084.537.660-88", name: "José Silva", email: "jose@silva.com" }
    And header Content-Type = 'application/json'
    When method POST
    Then status 200

  Scenario: Testando a busca de um cliente pelo cpf
    And path "customer"
    And param cpf = "084.537.660-88"
    And header Content-Type = 'application/json'
    When method GET
    Then status 200
    And match response.cpf == "084.537.660-88"
    And match response.name == "José Silva"
    And match response.email == "jose@silva.com"
