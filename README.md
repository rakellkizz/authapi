# Autenticação de Senha de Usuário - API

Este repositório implementa um sistema de autenticação para uma API usando senhas de usuários. A autenticação é realizada através de um endpoint específico que valida as credenciais do usuário e gera um token de acesso para autenticação subsequente.

## Funcionalidades

- **Autenticação com senha:** O usuário envia seu nome de usuário e senha para a API.
- **Validação de credenciais:** A API verifica as credenciais fornecidas e autentica o usuário.
- **Token de acesso:** Caso as credenciais estejam corretas, um token de acesso JWT (JSON Web Token) é retornado. Esse token deve ser usado para autenticação nas requisições subsequentes.
- **Proteção de endpoints:** Apenas usuários autenticados com um token válido podem acessar endpoints protegidos da API.

## Como Funciona

1. **Requisição de Login:** O usuário envia uma solicitação `POST` com seu nome de usuário e senha para o endpoint `/login`.
   
   Exemplo de requisição:
   ```bash
   POST /login
   Content-Type: application/json
   {
     "username": "usuario",
     "password": "senha123"
   }
   Validação: A API valida as credenciais. Se o nome de usuário e a senha estiverem corretos, a API gera um JWT.

Resposta com Token: Se a autenticação for bem-sucedida, a API retorna um token JWT que pode ser usado nas requisições subsequentes.

Exemplo de resposta:
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX3NjaGVtYSI6ImFkbWluIn0.sD6_U9AJeXFdU7RZTjzy3VQXYlQgg3G9K80g6l5nAwE"
}
2. Validação: A API valida as credenciais. Se o nome de usuário e a senha estiverem corretos, a API gera um JWT.

3.Resposta com Token: Se a autenticação for bem-sucedida, a API retorna um token JWT que pode ser usado nas requisições subsequentes.

Exemplo de resposta:
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX3NjaGVtYSI6ImFkbWluIn0.sD6_U9AJeXFdU7RZTjzy3VQXYlQgg3G9K80g6l5nAwE"
}
4. Uso do Token: Para acessar endpoints protegidos, o usuário deve incluir o token de autenticação no cabeçalho da requisição:
Exemplo de requisição protegida:

GET /api/protected
Authorization: Bearer <token>
Pré-requisitos
. Node.js (ou qualquer outra linguagem/tecnologia usada na implementação)
. Framework para criação de APIs (Express, Flask, etc.)
. Biblioteca para geração de tokens JWT (ex: jsonwebtoken para Node.js)

Configuração do Projeto
1- Clone o repositório:
git clone https://github.com/usuario/repositorio.git

2. Instale as dependências:
npm install

3. Inicie o servidor da API:
npm start

Exemplos de Uso
Requisição de Login
Enviando um pedido POST para o endpoint /login com um corpo de solicitação JSON contendo username e password.

Acesso a Endpoints Protegidos
Inclua o token gerado no cabeçalho Authorization ao fazer requisições para endpoints protegidos.

Authorization: Bearer <token>

Contribuição
Se você deseja contribuir para este projeto, fique à vontade para abrir uma pull request ou um issue.
1. Fork o repositório
2. Crie uma nova branch (git checkout -b feature/nova-funcionalidade)
3. Faça as alterações necessárias
4. Envie para a branch principal (git push origin feature/nova-funcionalidade)
5. Abra uma pull request explicando as mudanças







