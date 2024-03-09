<h1 align="center"> Situação de Aprendizagem 5 - Mainbooks </h1>
<br>

 ### O projeto Mainbooks é uma aplicação desenvolvida em java voltada para o cadastro, alteração e listagem de
 registros armazenados em um banco de dados MySQL.
<br>

 ## 🔧 Tecnologias

Este projeto foi desenvolvido utilizando as seguintes tecnologias e dependências:
- Java
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- MySQL
- Thymeleaf
- Lombok
- Validation

## ⚙️ Como Usar

### Instalação
1. Clone o repositório:
``` bash
https://github.com/aquelevitor/SA5.git
```
2. Importe o projeto para o IntelliJ:

Para importar o projeto você deve ir ao canto superior esquerdo e clicar no ícone de "Sanduíche". Depois, basta clicar
em "New" e em "Project from Existing Sources...". Por fim, selecione a pasta do projeto (SA5).

![image](https://github.com/aquelevitor/SA5/assets/102384518/1a71001b-a54a-4ca3-ba8f-9342b8543882)

3. Criando um Banco de Dados no MySQL:

Para criar um banco de dados deve-se clicar com o botão direito na aba de "SCHEMAS" e clicar em "Create Schema...".
Nomeie o banco com quiser e clique em "Apply" até que o banco seja criado.

4. Configurando o Projeto:

Com o projeto aberto no IntelliJ, vá em "resources" e abra o arquivo "application.properties". Edite a linha 5,
apagando a parte final e inserindo o nome que foi dado ao banco de dados, depois insira o nome do seu usuário MySQL na
linha e 6 e insira a sua senha na linha 7.

![image](https://github.com/aquelevitor/SA5/assets/102384518/cb4affbd-2a97-422d-9a86-1ea54095a23c)

5. Rodando o Projeto:

Para iniciar o projeto, basta clicar no botão play verde no canto superior direito da tela e esperar a aplicação iniciar. Caso seu navegador não seja aberto automaticamente, bastar ir na barra de pesquisa do navegador e colar este link:
``` bash
http://localhost:8081/livro/
```
