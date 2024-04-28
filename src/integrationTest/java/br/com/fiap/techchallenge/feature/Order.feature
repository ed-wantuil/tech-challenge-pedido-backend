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
