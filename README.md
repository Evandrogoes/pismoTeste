# pismoBank
Pismo Bank 

## Descrição do Projeto
<p align="justify"> Projeto de teste. Simulando criação de contas e transações </p>

> Status do Projeto: Em desenvolvimento :warning:


## Para Execução requer:

* JDK 1.8 (https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
* Tomcat 9.0.44 (https://downloads.apache.org/tomcat/tomcat-9/v9.0.44/bin/)
* Maven 3.6.3 (https://maven.apache.org/download.cgi)

## Dependencias do Projeto Maven:

* SpringBoot
* JPA
* Swagger
* SpringFox
* JUnit5
* H2 (Banco de dados em memória)



## Como executar: 

Para executar o projeto basta configurar a IDE de sua preferenciar com JDK, Maven e Tomcat referenciados no tópico "Para Execução Requer",
clonar o docidgo fonte, executar o camando maven install e fazer o deploy, pela propria IDE, no tomcat. 
Caso esteja com a configuração padrão do Tomcat o caminho para testar a aplicação ficaria assim : http://localhost:8080/pismoBank/ . 
Você pode testar o path http://localhost:8080/pismoBank/accounts/1.  A API utiliza banco de dados em memoria e no /resources da aplicação existe um arquivo de carga inicial de informações (data.sql).

A API implementa 3 endpoins:

relative path : /pismoBank

/accounts - Para criação de conta 
/accounts/:accountId - Consulta de informações de conta passando o identificador da conta como parametro.
/transactions - Criar uma transação passando como parametros: identificador da conta, tipo de operação e valor da transação


Para acessar a documentação mais detalhada da API, rode a aplciação e acesse o caminho  {baseUrl}/pismoBank/swagger-ui/index.html#/, 
exemplo : http://localhost:8080/pismoBank/swagger-ui/index.html#/

