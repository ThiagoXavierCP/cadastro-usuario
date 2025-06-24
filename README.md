# 📋 CRUD de Usuário

Este é um projeto de exemplo de CRUD de usuários utilizando **Spring Boot**, **Spring Data JPA**, **Lombok** e banco de dados **H2** em memória.

---

## 🚀 Tecnologias utilizadas

- **Java 24**
- **Spring Boot 3.5.3**
- **Spring Data JPA**
- **Spring Web**
- **Lombok**
- **H2 Database**
- **Maven**

---

## 🏗️ Estrutura do Projeto

src/
├── main
│ ├── java
│ │ └── com.thiagoxavier.cadastro_usuario
│ │ ├── CadastroUsuarioApplication.java
│ │ ├── business # Camada de serviço
│ │ ├── controller # Camada de controle (API REST)
│ │ └── infrastructure
│ │ └── entitys # Entidades JPA
│ │ └── repository # Repositórios Spring Data
│ └── resources
│ └── application.properties
└── test

---

## ⚙️ Como executar o projeto

### Pré-requisitos:
- Java 17+ (preferencialmente a versão 21 ou 24)
- Maven 3.8+

### Passos:

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/cadastro-usuario.git
cd cadastro-usuario

# Execute com Maven
./mvnw spring-boot:run
```

O projeto irá rodar por padrão na porta http://localhost:8080.

🧪 Testes
O projeto já inclui estrutura para testes com spring-boot-starter-test. Para rodar os testes:
./mvnw test

🗃️ Banco de Dados
O projeto utiliza banco H2 em memória:

Acesse o console H2 em:
http://localhost:8080/h2-console

Credenciais padrão:

URL JDBC: jdbc:h2:mem:testdb

Usuário: sa

Senha: (em branco)

📦 Dependências principais
spring-boot-starter-web - Criação de APIs REST.

spring-boot-starter-data-jpa - Persistência com JPA.

h2 - Banco de dados leve para testes.

lombok - Geração automática de getters/setters e construtores.

spring-boot-starter-test - Suporte a testes automatizados.
