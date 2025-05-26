# produto-crud-sqlite
Projeto de um CRUD com Spring e SQLite


Atenção: Projeto em Desenvolvimento.

Recomendo usar o Insomnia para as requisições.

Adicionar Produtos:
POST http://localhost:8080/produtos

Corpo (JSON):
{
  "nome": "Teclado Mecânico",
  "preco": 199.99,
  "quantidade": 5
}

Listar Produtos:
GET http://localhost:8080/produtos

Listar Produtos com Filtro:
GET http://localhost:8080/produtos?page=0&size=5&nome=mouse

Sem Filtro:
GET http://localhost:8080/produtos?page=0&size=10


TODO:
Na listagem fornercer o ID do produto.