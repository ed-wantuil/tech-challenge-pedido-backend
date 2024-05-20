# Tech Challenge - 4 - pedido

## Introdução
Este repositório contém o microserviço de pedidos, oferecendo as seguintes funcionalidades:
- **customer (POST)** - Criar um novo cliente.
- **find by cpf (GET)** - Buscar um cliente pelo CPF.
- **checkout (POST)** - Criar um novo pedido.
- **checkout without customer (POST)** - Criar um pedido sem informar o cliente.
- **order (GET)** - Buscar um pedido pelo ID.
- **product (POST)** - Criar um novo produto.
- **product (PUT)** - Atualizar um produto existente.
- **product list (GET)** - Listar todos os produtos.
- **find by category (GET)** - Buscar produtos por categoria.
- **product (REMOVE)** - Remover um produto.

## Fluxo de Trabalho (Git Flow)
Adotamos o Git Flow para uma organização eficaz do desenvolvimento:

![Git Flow](./doc/gitflow.png)

- **Master/Main**: Contém o código de produção.
- **Develop**: Base para o desenvolvimento de novas funcionalidades.
- **Feature Branches**: Desenvolvimento de novas funcionalidades em branches isoladas.
- **Release Branches**: Preparação de novas versões para lançamento.
- **Hotfix Branches**: Correções de bugs críticos em produção.

> **Importante**: Os merges são realizados através de Pull Requests, exigindo duas aprovações e a passagem bem-sucedida por testes unitários, testes integrados e análise do SonarQube.

## CI/CD Pipeline
O pipeline de CI/CD é ativado automaticamente após merges na branch principal, incluindo:

- **Build with Gradle**: Compilação do projeto com Gradle.
- **Run unit tests**: Execução de testes unitários.
- **Run integration tests**: Execução de testes de integração.
- **Run data migration**: Gerenciamento de migrações de dados.
- **Build Docker image**: Construção de imagem Docker do aplicativo.
- **Publish Docker image to Amazon ECR**: Publicação da imagem no ECR.
- **Deploy to Kubernetes**: Implementação no Kubernetes.
