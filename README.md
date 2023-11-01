# ContaBanco - Desafio de Sintaxe

Este é um projeto criado para exercitar e aplicar os conceitos de sintaxe em Java, especificamente para a criação de uma aplicação que simula um sistema de informações de contas bancárias.

## Linguagem e IDE

- **Linguagem:** Java
- **IDE Recomendada:** Visual Studio Code

## Descrição do Desafio

O desafio consiste em criar o projeto `ContaBanco`, que receberá dados via terminal representando as características de uma conta bancária. Essas características incluem:

- **Número:** Inteiro (ex: 1021)
- **Agência:** Texto (ex: 067-8)
- **Nome do Cliente:** Texto (ex: MARIO ANDRADE)
- **Saldo:** Decimal (ex: 237.48)

A classe `ContaTerminal.java` será responsável por codificar o programa e realizar a interação com o usuário via terminal.

### Tópicos Abordados no Desafio

O desafio cobre os seguintes tópicos, entre outros:

- Regras de declaração de variáveis em Java
- Uso de argumentos na função `main` e a classe `Scanner` para entrada de dados pelo terminal
- Concatenação e manipulação de strings com métodos da classe `String`

### Instruções

O programa solicitará ao usuário que insira as informações da conta. Cada dado será solicitado individualmente via terminal, conforme exemplo a seguir:

Programa: "Por favor, digite o número da Agência!"
Usuário: 1021 (pressiona ENTER para o próximo campo)


Após inserir todas as informações, o sistema exibirá a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."


Os campos entre `[ ]` serão substituídos pelas informações inseridas pelo usuário.

## Execução do Programa

Para executar o programa `ContaTerminal.java` no Visual Studio Code, siga estas etapas:

1. Abra o Visual Studio Code.
2. Abra a pasta do projeto.
3. Compile o código-fonte, se necessário.
4. Execute o programa e siga as instruções apresentadas no terminal para inserir os dados da conta.

## Exemplo de Uso

$ javac ContaTerminal.java
$ java ContaTerminal
Por favor, digite o número da Agência:
1021
Por favor, digite o nome do Cliente:
MARIO ANDRADE
Por favor, digite o Saldo:
237.48


Após inserir todos os dados, o programa exibirá:
"Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque."


## Contribuição

Contribuições são bem-vindas. Se deseja melhorar este projeto ou adicionar mais funcionalidades, fique à vontade para fazer um fork e enviar um pull request.


