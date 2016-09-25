# Consulta de Viagens

Aplicação JEE componentizada, no qual um componente é responsável por consumir o web service para consulta de viagens da Lemontech disponibilizando as informações numa fila para que outro componente faça a persistência no banco de dados.

Resumidamente, o fluxo básico consiste em consumir os dados do serviço, efetuar uma validação do conteudo retornado e exibir na tela, aonde o usúario poderá:

*  Visualizar o conteudo retornado pelo ws, além de um status adicional por registro com intuito de identificar se todos os objetos da hierarquia daquele registro (id solicitação) foram retornados pelo serviço consumido.
* Executar por demanda novas chamadas ao serviço, navegando pelas telas de listagem através de páginação (20 registros por página)

Após cada requisição, além de serem listados na tela, os dados são imediatamente encaminhados a uma fila responsável por entregar por meio de mensageria, os registros ao componente de persistência.

# Arquitetura do Sistema

A arquitetura escolhida segue a especificação JEE 7, utilizando-se de grande parte dos recursos oferecidos.
Para se beneficiar de um ambiente transacional totalmente gerenciado pelo servidor, foi escolhido o web server WildFly. Embora a configuração para esse ambiente seja mais complexa, contribuiu para a escolha o fato de que há grandes benefícios em termos de legibilidade e assertividade no código escrito.

### Tecnologias

* JDK 8
* JEE 7
* CDI 1.2
* JTA 1.2
* JPA 2.1
* JSF 2.2
* MAVEN 3.3

### Banco de dados

* MySQL 5.5

### Server

* WildFly 8
* HornetQ 2.4 (middleware mensageria)

# Configuração do ambiente

* Banco de dados

Para criação do banco de dados e tabela, basta executar o script create.sql localizado no diretório raiz do projeto.

Antes de inicializar o server WildFly, referencie o arquivo standalone-full.xml para que ele utilize as configurações de mensageria do servidor já declaradas.

* WildFly

Para executar a aplicação, é necessário configurar o data source no wildfly com as suas credenciais de acesso.

Se estiver utilizando o MySQL, inclua o trecho abaixo no arquivo standalone-full.xml, dentro da tag <datasources>. Lembre-se de substituir {user} e {pass} por seu usuário e senha de conexão com o database.

<datasource jndi-name="java:jboss/datasources/fullstackDS" pool-name="fullstackDS" enabled="true">
 <connection-url>jdbc:mysql://localhost:3306/fullstack_java</connection-url>
 <driver>mysql</driver>
 <security>
  <user-name>{user}</user-name>
  <password>{pass}</password>
 </security>
</datasource>

Também é necessária a inclusão do do trecho abaixo dentro da tag <drivers>

<driver name="mysql" module="com.mysql">
 <driver-class>com.mysql.jdbc.Driver</driver-class>
</driver>

A instalação padrão do WildFly não trás o jar do connector My SQL, então é necessário criar uma estrutura de diretórios nomeados mysql/main dentro de <dir_instalacao_wildfly>/dir/modules/system/layers/base/com e incluir os seguintes arquivos:

  - module.xml
  - mysql-connector-java-5.1.39-bin.jar

Ambos arquivos estão dentro do diretório conf-wildfly que se encontra na raiz do projeto.

Obs. Apenas para referência, no diretório conf-wildfly que se encontra na raiz do projeto, existe uma cópia do arquivo standalone-full.xml usado no desenvolvimento do projeto. É importante frisar que ao ser inicializado, o Wildfly utilizará por padrão as configurações do arquivo standalone.xml. Nesse caso, acho válido deixá-lo com o mesmo conteudo do standalone-full.xml não somente por conta das configurações de data source, mas também pelos outros recursos JEE cujo gerenciamento fica a cargo do server (mensageria, etc).
