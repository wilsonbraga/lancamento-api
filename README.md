# lancamento-api
API desenvolvida com Spring Boot no back-end e Angular no front-end 

## Índice
* [Introdução](https://github.com/wilsonbraga/lancamento-api#1-lancamento-api)
* [1. Diagrama de Classe](https://github.com/wilsonbraga/lancamento-api#1-diagrama-de-classe)
* [2. Tecnologias Utilizadas](https://github.com/wilsonbraga/lancamento-api#2-tecnologias-utilizadas)
* [3. Interface do sistema](https://github.com/wilsonbraga/lancamento-api#3-interface-do-sistema)
* [4. Login](https://github.com/wilsonbraga/lancamento-api#4-login)
   * [4.1 Erro ao logar](https://github.com/wilsonbraga/lancamento-api#41-erro-ao-logar)
* [5. Tela Inicial](https://github.com/wilsonbraga/lancamento-api#5-tela-inicial)
* [6. Menu Lateral](https://github.com/wilsonbraga/lancamento-api#6-menu-lateral)
* [7. Lançamentos](https://github.com/wilsonbraga/lancamento-api#7-lan%C3%A7amentos)
   * [7.1 Lançamentos Novo](https://github.com/wilsonbraga/lancamento-api#71-lan%C3%A7amentos-novo)
   * [7.2 Lançamentos Edição](https://github.com/wilsonbraga/lancamento-api#72-lan%C3%A7amentos-edi%C3%A7%C3%A3o)
   * [7.3 Lançamentos Exclusão](https://github.com/wilsonbraga/lancamento-api#73-lan%C3%A7amentos-exclus%C3%A3o)
   * [7.4 Lançamentos E-mail](https://github.com/wilsonbraga/lancamento-api#74-lan%C3%A7amentos-e-mail)
* [8. Pessoas](https://github.com/wilsonbraga/lancamento-api#8-pessoas)
   * [8.1 Pessoas Novo](https://github.com/wilsonbraga/lancamento-api#81-pessoas-novo)
   * [8.2 Pessoas Edição](https://github.com/wilsonbraga/lancamento-api#82-pessoas-edi%C3%A7%C3%A3o)
   * [8.3 Pessoas Exclusão](https://github.com/wilsonbraga/lancamento-api#83-pessoas-exclus%C3%A3o)
 * [9. Relatórios](https://github.com/wilsonbraga/lancamento-api#9-relat%C3%B3rios)

----------------------------------

# Introdução 

&nbsp;&nbsp;&nbsp;&nbsp;API desenvolvida com Spring Boot no back-end e Angular no front-end, seu objetivo é agilizar as consultas na base de dados bem como fazer as impressões dos arquivos em PDF, upload de arquivos no Bucket do Amazom S3 ou fazer a remoção desse arquivo apos um dia caso ele não venha ser utilizado, também fazemos buscas com gráficos de lançamentos por categorias e lançamentos por dia e envio de e-mail para lançamentos vencidos com auxílio de eventos as 06h da manhã, controle e cadastro de pessoas.

#### 1. Diagrama de Classe

&nbsp;&nbsp;&nbsp;&nbsp;A **figura 1** descreve a estrutura do sistema de Lançamentos modelando suas classes descrevendo seus atributos e as relações entre objetos.

<img src="http://uploaddeimagens.com.br/images/002/083/847/full/diagrama_de_classe.png?1556897540" alt="Diagrama de classe" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 1 - Diagrama de classe</b> 
  </p> 
</img>
  
#### 2. Tecnologias Utilizadas
&nbsp;&nbsp;&nbsp;&nbsp;A seguir serão listadas todas as tecnologias utilizadas no desenvolvimento do sistema de Lançamentos

 - **Java 8** - Linguagem de programação utilizada para o desenvolvimento do sistema.
 
 - **Spring Boot** - Frameworks responsável pela arquitetura MVC e seguranças com **BCrypt** no projeto. 

 - **Angular 7** - framework JavaScript código aberto, que auxilia na execução de single-page applications, utilizado na construção de layout das telas.
 
 - **Thymeleaf** - Template engine do projeto responsável por transmitir dados para tela, usado no layout da telas de e-mail.
 
  - **PrimeNG** - Usada para codificação e estilização do projeto, PrimeNG é uma coleção de componentes de UI ricos para Angular. Todos os widgets são open source e gratuitos para uso sob licença MIT.

 - **JPA/Hibernate** - Utilizada a especificação do **JPA**  para persistência dos dados utilizando a implementação do **Hibernate**.

 - **Maven** - Para arquitetura inicial de projeto e controle de dependências.

 - **Flyway** Para a utilização de banco de dados incremental.
 
 - **MySql** - Linguagem de banco de dados utilizada.

 - **Log4j** - Para controle dos log da aplicação.

 - **Bean Validation e Hibernate Validator** - Usado validação de entidades e validações de campos.

 - **Spring Mail** - Responsável pelos envio de e-mail utilizando serviço do **sendgrid**.

 - **ChartJS** - Para geração de gráficos.
 
 - **JasperReport** - Para geração de relatórios do sistema.
 
 - **Amazom S3** - O Amazon S3 ou o Amazon Simple Storage Service é um "serviço de armazenamento simples" oferecido pelo Amazon Web Services que fornece armazenamento de objetos por meio de uma interface de serviço da web
 
#### 3. Interface do sistema
&nbsp;&nbsp;&nbsp;&nbsp;Nesse tópico serão mostradas as principais telas do sistemas seguindo de suas funcionalidades.
 
##### 4. Login
&nbsp;&nbsp;&nbsp;&nbsp;Inicialmente o sistema inicia na tela de “login” onde o usuário irá entrar com seus dados de autenticação, como mostrado na **figura 4**.

<img src="http://uploaddeimagens.com.br/images/002/083/808/full/Login.png?1556897002" alt="Tela de login" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 4 - Tela de login</b> 
  </p> 
</img>

#### 4.1 Erro ao logar
&nbsp;&nbsp;&nbsp;&nbsp;Na figura 4.1 é mostrado a mensagem de Ocorreu um erro ao processar sua solicitação.

<img src="https://uploaddeimagens.com.br/images/002/083/806/full/Login_valida%C3%A7%C3%A3o.png?1556896991" alt="Mensagem de falha ao tentar logar" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 4.1 - Mensagem de falha ao tentar logar</b> 
  </p> 
</img>

#### 5. Tela Inicial
&nbsp;&nbsp;&nbsp;&nbsp;A tela inicial do sistema é composta por dois gráficos, lançamentos por categoria e lançamentos por dia logo ao lado esquerdo temos o botão do menu.

<img src="https://uploaddeimagens.com.br/images/002/083/791/full/Dashboard.png?1556896841" alt="Dashboard - Tela inicial do sistema" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 5 - Dashboard - Tela inicial do sistema com gráficos</b> 
  </p> 
</img>

#### 6. Menu Lateral
&nbsp;&nbsp;&nbsp;&nbsp;No botão menu lateral temos 5 menus que irei listar suas funcionalidades logo abaixo.
	
<img src="https://uploaddeimagens.com.br/images/002/083/785/full/Dashboard_menu.png?1556896791" alt="Dashboard - Tela inicial do sistema com menu" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 6 - Dashboard - com menu</b> 
  </p> 
</img>

#### 7. Lançamentos
&nbsp;&nbsp;&nbsp;&nbsp; Na tela de Lançamentos mostramos todos os dados de lançamentos já cadastrados no banco de dados.

<img src="https://uploaddeimagens.com.br/images/002/083/802/full/Lancamentos_pesquisa.png?1556896965" alt="Tela de Pesquisa Lançamentos"   title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 7 - Tela de pesquisa lançamentos</b> 
  </p> 
</img>

#### 7.1 Lançamentos Novo
&nbsp;&nbsp;&nbsp;&nbsp;Lançamentos Novo encontra-se 2 botões de informações “Receita”, “Despesa” e os campos para as informações do lançamento que você deseja salvar, o campo Descrição faz a validação de no mínimo 5 caracteres, temos o botão para anexar um arquvio esse arquvio será armazenado no Amazon s3.
<img src="https://uploaddeimagens.com.br/images/002/083/799/full/Lancamentos_novo.png?1556896938" alt="Tela Novo Lançamentos" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 7.1 - Tela de novo lançamento</b> 
  </p> 
</img>

#### 7.2 Lançamentos Edição
&nbsp;&nbsp;&nbsp;&nbsp;Utilizamos a mesma tela de novo lançamento para fazer a edição, com o id do lançamento que você deseja editar.

<img src="https://uploaddeimagens.com.br/images/002/083/796/full/Lancamentos_edi%C3%A7%C3%A3o.png?1556896896" alt="Tela de edição de lançamento" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 7.2 - Tela de edição de lançaemnto</b> 
  </p> 
</img>

#### 7.3 Lançamentos Exclusão

&nbsp;&nbsp;&nbsp;&nbsp;Na tela de exclusão de lançamento temos um dialogo de confirmaçã para você confirmar a exclusão do lançamento. 

<img src="https://uploaddeimagens.com.br/images/002/083/797/full/Lancamentos_excluir.png?1556896922" alt="Tela de exlussão de lançamento" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 7.3 - Tela de Exclusão de Lançamento</b> 
  </p> 
</img>


#### 7.4 Lançamentos E-mail

&nbsp;&nbsp;&nbsp;&nbsp;Na tela e-mail de lançamentos temos despesas em vermelho e receitas em azul, a um evento para mandar um aviso de lançamentos vencidos por e-mail as 06h da manhã para cada usuário que esteja com email válido cadastrado no sistema. 

<img src="https://uploaddeimagens.com.br/images/002/092/171/full/email.png?1557235919" alt="Tela de e-mail " title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 7.4 - Tela de email com os lançamentos</b> 
  </p> 
</img>

#### 8. Pessoas
&nbsp;&nbsp;&nbsp;&nbsp;Na tela mostramos todos as informações das Pessoas já cadastrados no banco de dados, logo embaixo temos o botão para cadastrar uma nova pessoa e os botões de editar e excluir uma pessoa.

<img src="https://uploaddeimagens.com.br/images/002/083/802/full/Lancamentos_pesquisa.png?1556896965" alt="Tela de Pesquisa Lançamentos"   title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 8 - Tela de Pesquisa de Pessoa</b> 
  </p> 
</img>

#### 8.1 Pessoas Nova

&nbsp;&nbsp;&nbsp;&nbsp;Na tela temos os campos para as informações da pessoa, temos validação de no mínimo 5 caracteres também temos os campo Estado e Cidade que são campos dependentes, quando você selecionar um estado automaticamente será listadas as cidades referente a esse estad e também temos um botão Novo para cadastrar o endereço da pessoa.
<img src="https://uploaddeimagens.com.br/images/002/084/310/full/Nova_Pessoa_.png?1556905564" alt="Tela Novo Lançamentos" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 8.1 - Tela de Nova de Pessoa</b> 
  </p> 
</img>

#### 8.2 Pessoas Edição

&nbsp;&nbsp;&nbsp;&nbsp;Utilizamos a mesma tela de nova pessoa para fazer a edição, com o id da pessoa que você deseja editar, também temos um dialogo para editar o endereço da pessoa.

<img src="https://uploaddeimagens.com.br/images/002/083/812/full/Pessoa_edi%C3%A7%C3%A3o.png?1556897025" alt="Tela de edição de pessoas" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 8.2 - Tela de Edição de pessoa</b> 
  </p> 
</img>

#### 8.3 Pessoas Exclusão

&nbsp;&nbsp;&nbsp;&nbsp; Na tela de exclusão de pessoa temos um dialogo de confirmaçã para você confirmar a exclusão da pessoa. 

<img src="https://uploaddeimagens.com.br/images/002/084/374/full/Pessoa_excluss%C3%A3o.png?1556906444" alt="Tela de exlussão de pessoa" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 8.3 - Tela de exclusão de Pessoa</b> 
  </p> 
</img>

#### 9. Relatórios
&nbsp;&nbsp;&nbsp;&nbsp;O menu de relatório possui a função de buscar os lançamentos da pessoa  entre uma data.

<img src="https://uploaddeimagens.com.br/images/002/083/817/full/relat%C3%B3rios.png?1556897044" alt="Tela de relatórios" title="Clique para ampliar">
  <p align="center"> 
    <b>Figura 9. - Tela de relatórios</b> 
  </p> 
</img>
