# Streaming Console Application

Este projeto é um exercício prático desenvolvido como parte do curso de Programação Orientada a Objetos (POO) na faculdade. Nele, aplicamos os conceitos aprendidos até o momento para criar uma aplicação de streaming executada no console.

- Eduardo Henrique Fabri
- João Vitor Correa Oliveira
- Renan Herculano

## Funcionalidades

A aplicação simula um serviço de streaming com as seguintes características:

- **Pagamento:** Representa o pagamento realizado por um usuário, com atributos como tipo, valor e data.
- **Plano:** Define o plano de assinatura da plataforma, com nome, preço mensal e se permite download.
- **Plataforma:** Gerencia usuários e conteúdos (filmes e séries), permitindo adicionar, exibir e editar ambos.
- **Avaliacao:** Associa um usuário a um conteúdo de streaming, registrando a nota dada (1 a 5 estrelas).
- **Filme:** Herda de Streaming, representando filmes com o atributo adicional de diretor.
- **Série:** Herda de Streaming, representando séries com atributos de temporadas e episódios.
- **Streaming:** Superclasse genérica que contém atributos como título, gênero, duração e classificação etária.
- **Basico e Premium:** Heranças de Usuario, onde Basico inclui anúncios e Premium oferece download offline.
- **Usuario:** Representa os usuários da plataforma, com informações pessoais e de pagamento.

## Objetivo

O objetivo deste projeto é aplicar os conceitos de:

- Herança
- Encapsulamento
- Abstração
