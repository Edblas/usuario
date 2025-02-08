# 📝 Agendador de Tarefas

## 📖 Descrição
Este é um **agendador de tarefas** desenvolvido com **Java Spring Boot e microsserviços**. O sistema permite criar, editar e gerenciar tarefas de forma eficiente, suportando notificações, priorização e integração com APIs externas.

## 🚀 Tecnologias Utilizadas
- **Java 17**  
- **Spring Boot**  
- **Spring Cloud**  
- **Spring Security (JWT)**  
- **PostgreSQL**  
- **Docker**  
- **RabbitMQ/Kafka (Mensageria - Opcional)**  
- **Swagger (Documentação da API)**  

## 📂 Estrutura do Projeto
O projeto segue a arquitetura de **microsserviços**, contendo os seguintes módulos:

- **Config Server** → Gerencia configurações centralizadas  
- **Discovery Server (Eureka)** → Serviço de descoberta para comunicação entre microsserviços  
- **Gateway API** → Roteia as requisições e gerencia autenticação  
- **Task Service** → Responsável pelo CRUD de tarefas  
- **User Service** → Gerencia usuários e autenticação  

## 📦 Como Rodar o Projeto

### Pré-requisitos:
- **Java 17+**
- **Docker (Opcional, para rodar PostgreSQL e outros serviços)**
- **Maven**
