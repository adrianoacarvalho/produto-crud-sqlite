# 🛒 Produto CRUD API

Uma API REST desenvolvida em **Java com Spring Boot**, com persistência de dados usando **SQLite**. Permite o cadastro, listagem, edição e exclusão de produtos, com suporte a **paginação** e **filtro por nome**.

---

## ✅ Funcionalidades

- Cadastro de produtos
- Listagem paginada de produtos
- Filtro de produtos por nome (parcial e case-insensitive)
- Atualização de dados do produto
- Exclusão de produtos
- Validações com Jakarta Bean Validation

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- SQLite
- Jakarta Bean Validation
- Maven

---

## 💾 Banco de dados

A aplicação utiliza um banco **SQLite local** (arquivo `.db`). O arquivo é criado automaticamente na raiz do projeto ao rodar a aplicação pela primeira vez.

---

## 📦 Como rodar o projeto

1. **Clone o repositório:**

```bash
git clone https://github.com/adrianoacarvalho/produto-crud-sqlite.git
cd produto-crud-sqlite
```

2. **Configure o SQLite (opcional):**

Não é necessário criar o banco manualmente — o Hibernate cria as tabelas automaticamente com base nas entidades.

3. **Rode a aplicação:**

```bash
./mvnw spring-boot:run
```

A aplicação ficará disponível em:

```
http://localhost:8080
```

---

## 📑 Endpoints principais

| Método | Endpoint       | Descrição                            |
|--------|----------------|----------------------------------------|
| GET    | `/produtos`    | Lista produtos com paginação          |
| GET    | `/produtos?nome=caneta` | Lista produtos filtrando por nome |
| POST   | `/produtos`    | Cadastra um novo produto              |
| PUT    | `/produtos/{id}` | Atualiza os dados de um produto       |
| DELETE | `/produtos/{id}` | Remove um produto                     |

---

## 📘 Exemplo de JSON para cadastro

```json
{
  "nome": "Caderno",
  "preco": 15.90,
  "quantidade": 50
}
```

---

## 📚 Futuras melhorias

- Documentação com Swagger/OpenAPI
- Testes unitários e de integração
- Autenticação com Spring Security
- Deploy em nuvem (Heroku, Vercel, Railway etc.)
- Integração com frontend (React, Angular, etc.)

---

## 👨‍💻 Autor

**Adriano Carvalho**  
Desenvolvedor backend em transição de carreira  

<<<<<<< HEAD
- [Blog pessoal](https://adrianocarva1ho.blogspot.com)  
- [LinkedIn](https://www.linkedin.com/adrianocarva1ho)
=====
