# Aplicação Compromissos

### Link direto para a Aplicação: http://www.ondeployment.com.br/aplicacao-compromissos/ 

## Objetivo
Esta é uma aplicação simples onde pode-se adicionar e remover contados e etc, seguindo o padrão de uma aplicão SPA, para demonstração de um Back-End desenvolvido em Java utilizando boas práticas de programação, testes unitários, uso do Framework Spring, e no Front-End o AngularJS e suas principais diretivas e domínio da linguagem JavaScript.

# BACK-END
Implementado Spring Data, Mockito, JUnit, AssertJ, Swagger, Tratamento de Exceções, Paginação e etc.

## DOCKER
Caso Queira Executar tal aplicação Back-End em um Container Docker, ambiente Ubuntu ou Windows, favor executar os passos abaixo.
- Partindo do pressuposto que já tenha instalado o Docker e o Docker-Compose em seu host S.O Linx como : Ubuntu, CentoOS e derivados ou Windows.
 - Somente  à partir do Arquivo `Docker-Compose.Yml` que se encontra na raiz do projeto Back-End-Java, é possível gerar uma imagem Docker e por fim criar o Container.
Basta simplesmente executar com o comando abaixo -- "docker-compose up".

## docker-compose up
* Tudo Será feito de forma automatizada, pacotes seram instalados e ambientado, somente lembrando que no arquivo Docker-Compose.Yml foi criado uma rede para realizar a ligação entre o banco de dados e o Back-End , logo caso a rede já exista em seu Ambiente Docker, dará conflito e não será gerado a imagem. Lembrando que tal comando deve ser executado pelo terminal na raiz do projeto, exatamente onde se encontra o arquivo Docker-Compose.yml. Com o comando acima realizado, a aplicação inteira já está configurada e se tudo deu certo você deverá conseguir acessar a mesma pelo navegador, através do endereço de IP da qual a máquina host que foi instalado o Docker, na porta 8080, melhores informações para execução do projeto logo abaixo.
* Nota: Lembre-se que quando for executar em ambientes como CentOS tais S.O possuem firewall, logo será necessário realizar a liberação das portas no mesmo para poder acessar a aplicação. 

# Heroku
* Fiz o Deploy desta aplicação no Heroku, abaixo segue o Link de acesso a mesma, tal lhe redirecionará para a página de documentação da API Back-End, feita utilizando o Framework Swagger, que através dela, poderá verificar todos os EndPoints disponíveis, bem como a utilização dos mesmos, assim caso queria testar o funcionamento da mesma sem precisar ambientar nada basta clicar no link abaixo, porém lembrando é somente o Back-End.

    * https://back-end-app-compromissos.herokuapp.com/swagger-ui.html  
    
   OBS: Esta é uma conta gratuita do Heroku, então ao tentar acessar a API pela primeira vez, bem provavelmente que irá demorar responder um pouco, pois por se tratar de conta gratuita o ambiente não fica disponível para acesso imediato, existirá um Delay, como uma inicialização do ambiente de onde a mesma está alocada, após aguardar uns instantes, a aplicação está disponível e com funcionamente similar a uma em produção.

## Executando e testando o projeto (Back-End)

### Pré-requisitos
* PostgresSQL (O banco que foi testado).
* Java 8
* Sistema Operacional Windows Pois este tutorial não irá abordar instalação em outros SO.

#### 1 - Instalar o PostgresSQL:

A página oficial contém [links para download](https://www.postgresql.org/download/) do SGBD para diversas plataformas.


1.1 Instalar o PostgreSQL:

1.2 É bastante simples, basta dar um duplo clique no executável que foi baixado no passo a cima e seguir os passos do instalador.

#### 2 - Configurar as propriedades da aplicação 

Caminho até o arquivo de propriedades da aplicação:
`src/main/resources/application.properties`

O usuário e a senha cadastrados durante a instalação do BD deveram ser informados neste arquivo.  

Por exemplo, a string de conexão com o banco de dados `postgres`
seria `jdbc:postgresql://localhost:5432/agenda`. Para configurar usuário `postgres` e senha `postgres`
ou caso a sua própria, utilizar a configuração abaixo: 

`spring.datasource.username=postgres`
`spring.datasource.password=postgres`

#### 3 - Buildar e executar a aplicação

Dentro do diretório root da aplicação executar os passos abaixo.

3.1 Para rodar os testes:

##Obs para rodar os testes lembre-se que o maven precisa estar instalado. 

`$ mvn test #Para rodar os testes`

3.2 Para buildar a aplicação:
`$ mvn clean install #buildando o pacote da aplicação`

3.3 Para executar a aplicação:

O Maven através do `spring-boot-maven-plugin` gera o jar executável.
Então basta entrar no diretório `target/` e executar:

`$ java -jar "apirest-0.0.1-SNAPSHOT.jar"`

OBS: Lembrando que deve informar todo o Diretório, então supondo que a pasta esteja em C:\
Logo o Comando Será : 
`$ java -jar "C:\pastadoprojeto\target\apirest-0.0.1-SNAPSHOT.jar"`

A partir deste ponto se tudo ocorrer corretamente a aplicação estará executando normalmente. 

É possível utilizar o client do swagger através da url [http://localhost:8080/swagger-ui.html]

## Principais tecnologias e frameworks utilizados (Back-End)

- Java 8
- Spring Boot 
- JUnit 5
- Mockito
- Hibernate
- Swagger
- Lombook

# Front-End
A parte do Front-End foi desenvolvida em AngularJS, implementado Serviços, Filtros, Criação de Diretivas e etc.
