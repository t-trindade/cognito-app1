<p align="center">
 <img src="https://cdn.freebiesupply.com/logos/large/2x/aws-cognito-logo-png-transparent.png" width="100" alt="Banner Flexpag">
</p>

### Prejeto : Demonstração de acesso a aplicações a partir de uma autenticação gerenciada pelo [Cognito](https://aws.amazon.com/pt/cognito/).  

![badge](https://img.shields.io/badge/Java-000000?style=for-the-badge&logo=openjdk&logoColor=white)
![badge](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![badge](https://img.shields.io/badge/Amazon_AWS-FF9900?style=for-the-badge&logo=amazonaws&logoColor=white)
---

## Aplicação:

|    -   | Nome da Aplicação      |                      Link                       |
|--------|------------------------|-------------------------------------------------|
|        |Cognito Gateway API     |https://github.com/t-trindade/cognito-gateway-api|
|&#10004;|Cognito Gateway APP 1   |https://github.com/t-trindade/cognito-app1       |
|        |Cognito Gateway APP 2   |https://github.com/t-trindade/cognito-app2       |

## Função:

#### O APP 1 é uma simulação de microsserviço gerenciado pelo Cognito, portanto, ele só permitirá acesso aos seus endpoints conforme [TOKEN JWT](https://www.alura.com.br/artigos/o-que-e-json-web-tokens).

## Escopo da aplicação no token:
```
IT/INTERNAL
````
> O Token JWT fornecido pelo serviço Cognito possui um escopo de acordo com cada aplicação, esse escopo é utilizado para autorizar o acesso aos endpoint.

## Requisição:
```
Header: Authorization Bearer eyJraWQiOiJ****
```

| Verbo | Escopo      | EndPoint                                    |   Informação                 |
|-------|-------------|---------------------------------------------|------------------------------|
| GET   | IT/INTERNAL | http://localhost:8081/api/conectar          |              -               |
| GET   | IT/INTERNAL | http://localhost:8081/api/conectar/app2     |Faz uma requisição para o APP2|
| GET   | IT/INTERNAL | http://localhost:8081/api/nao-conectar/app2 |Faz uma requisição para o APP2|

> A terceira requisição não conseguira acessar o endpoint do APP2 pois o mesmo possui um escopo de IT/ADMIN e o Token dessa aplicação não possui esse escopo.
