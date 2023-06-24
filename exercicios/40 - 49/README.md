### Estrutura de Decisão


> 40 - Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
> "Telefonou para a vítima?"
> "Esteve no local do crime?"
> "Mora perto da vítima?"
> "Devia para a vítima?"
> "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

> 41 - Um posto está vendendo combustíveis com a seguinte tabela de descontos:
> Álcool:
> até 20 litros, desconto de 3% por litro
> acima de 20 litros, desconto de 5% por litro
> Gasolina:
> até 20 litros, desconto de 4% por litro
> acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.


> 42 - Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg           Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

> 43 - O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
Até 5 Kg Acima de 5 Kg
File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar apenas um dos
> tipos de carne da promoção, porém não há limites para a
> quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

> 44 - Em uma eleição presidencial
> existem quatro candidatos. Os votos são informados 
> por meio de código. Os códigos utilizados são:
> 1 , 2, 3, 4  - Votos para os respectivos candidatos
> (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
> 5 - Voto Nulo
> 6 - Voto em Branco
> Faça um programa que calcule e mostre:
> O total de votos para cada candidato;
> O total de votos nulos;
> O total de votos em branco;
> A percentagem de votos nulos sobre o total de votos;
> A percentagem de votos em branco sobre o total de votos.
> Para finalizar o conjunto de votos tem-se o valor zero.

>
>Exercício 45 -
Sistema de Matrículas
Uma faculdade pretende informatizar seu sistema de matrículas
A secretaria da faculdade gera o currículo para cada semestre
e mantém as informações sobre as disciplinas, professores e
alunos.
Cada curso tem um nome, um determinado número de créditos
e é constituído por diversas disciplinas.
Os alunos podem se matricular a 4 disciplinas como 1ª opção e
a mais 2 outras alternativas.
Há períodos para efetuar matrículas, durante os quais um aluno
pode acessar o sistema para se matricular em disciplinas e/ou
para cancelar matrículas feitas anteriormente.
Uma disciplina só fica ativa, isto é, só irá funcionar no semestre
seguinte se, no final do período de matrículas tiver,
pelo menos, 3 alunos inscritos (matriculados). Caso
contrário, a disciplina será cancelada. O número máximo de
alunos inscritos a uma disciplina é de 10 e quando este
número é atingido, as inscrições (matrículas) a essa disciplina
são encerradas.
Após um aluno se inscrever para um semestre, o sistema
de cobranças é notificado pelo sistema de matrículas, de
modo que o aluno possa ser cobrado pelas disciplinas daquele
semestre.
Os professores podem acessar o sistema para saber quais são
os alunos que estão matriculados em cada disciplina.
Todos os usuários do sistema têm senhas que são utilizadas
para validação do respectivo login.
a) Elabore um diagrama de casos de uso
referente ao sistema;
b) Elabore um diagrama de classes relativo
ao sistema;
c) Elabore um diagrama de estados referente à
classe Disciplina;
d) Elabore os diagramas de sequência
correspondente ao seguinte cenário:
Um aluno acessa a tela inicial do sistema de matrículas, onde
introduz a sua chave de acesso.
O sistema valida o acesso (login+senha), identifica o aluno em
questão e pede para ele escolher o ano e o semestre letivo.
O aluno escolhe o ano e o semestre letivo e pede para criar
uma matrícula nova.
O sistema apresenta as disciplinas do curso,
correspondentes ao ano e semestre letivo introduzidos, em
que o aluno ainda não está inscrito.
O aluno escolhe umas das disciplinas e indica se é 1ª
opção ou disciplina alternativa.
O sistema verifica se está matrícula cumpre os pré-requisitos
necessários (cada aluno pode escolher quatro disciplinas como
1ª opção e duas alternativas) e adiciona-o a lista da disciplina.
O sistema apresenta uma mensagem para confirmar que a
matrícula foi realizada e pergunta se o aluno quer imprimir o
formulário de matrícula.
O aluno indica que quer imprimir o
formulário.
O sistema imprime o formulário de matrícula
do aluno.
O sistema envia a informação referente à matrícula do aluno na
disciplina para ser processada pelo sistema de cobranças.


> Exercício 46
Sistema de Aluguel de Automóveis
Pretende-se desenvolver um sistema para apoio à gestão de
aluguéis de automóveis que permita efetuar, cancelar e modificar
pedidos através da Internet. Após a análise inicial de requisitos do
sistema foram levantadas as seguintes informações:
O sistema só pode ser utilizado após
cadastro prévio.
Os usuários individuais (clientes) podem introduzir,
modificar, consultar e cancelar pedidos de aluguel. Por outro
lado, os agentes (empresas e bancos) podem modificar e
avaliar pedidos.
Após introdução no sistema, os pedidos são analisados do
ponto de vista financeiro pelos agentes e, em caso de
parecer positivo, são colocados à sua consideração para
execução do contrato.
Sobre os contratantes do aluguel, armazenam-se os dados de
identificação (RG, CPF, Nome, Endereço), profissão, as
entidades empregadoras e os respectivos rendimentos
auferidos (máximo 3).
Dependendo do tipo de contrato, os automóveis
alugados podem ser registrados como propriedade dos
clientes, empresas ou bancos.
Sobre os automóveis, o sistema registra a matrícula, ano,
marca, modelo e placa.
O aluguel de um automóvel pode estar associado com um
contrato de crédito, o qual foi concedido por um dos bancos
agentes.
Em termos do sistema, o servidor central encontra-se ligado
aos computadores locais dos clientes e aos diversos agentes
aderentes através da Internet.
O sistema pode ser subdividido em dois subsistemas: um
para gestão de pedidos e contratos; e outro para a construção
dinâmica das páginas WWW.
a) Elabore um diagrama de casos de uso e um diagrama de
classes do sistema;
b) E s c o l h a u m a f u n c i o n a l i d a d e p a r a
i m p l e m e n t a r u m d i a g r a m a d e s e q u ê n c i a
d o s i s t e m a
c) Elabore possíveis diagramas para arquitetura lógica e de
componentes do sistema.
d) Elabore o diagrama de classes ilustrando a arquitetura, com
o uso de Web Application Extension (WAE) para UML, no
subsistema para a construção dinâmica de páginas WWW.


> Exercício 47 (in En)
Consider this Texas Hold 'em poker game system:
→ 2 to 8 human or computer players
→ Each player has a name and stack of chips
→ Computer players have a difficulty setting: easy, medium, hard
→ Summary of each hand:
→ Dealer collects ante from appropriate players, shuffles the deck, and
deals each player a hand of 2 cards from the deck.
→ A betting round occurs, followed by dealing 3 shared cards from the
deck.
→ As shared cards are dealt, more betting rounds occur, where each
player can fold, check, or raise.
→ At the end of a round, if more than one player is remaining, players'
hands are compared, and the best hand wins the pot of all
chips bet so far.
Answer:
→ What classes are in this system? What are their responsibilities?
Which classes collaborate?
→ Draw a class diagram for this system. Include relationships between
classes (generalization and associational).
Ps: Esta é uma boa oportunidade para quem não conhece pôquer
tentar aprender para modelar um sistema que implemente o
jogo. Há vários tutoriais interessantes no youtube.


Exercício 47
Para a especificação de requisitos abaixo:
Especificação dos Requisitos
Sistema Bancário
A. Lançamentos diversos:
1. O sistema deve permitir o cadastro e alteração de clientes do banco os seguintes
   atributos: nome, endereço (rua, número, bairro, cep), telefone, data de
   nascimento para pessoa física, data de fundação para pessoa jurídica, e-mail, cpf
   (pessoa física) e cnpj (pessoa jurídica);
2. O sistema deve permitir o cadastro e alteração dos bancos com os seguintes
   atributos: código e nome;
3. O sistema deve permitir o cadastro e alteração das agências bancárias com os
   seguintes atributos: número da agência, nome, endereço (rua, número, bairro,
   cep), telefone, e-mail. Sabe-se que um banco pode ter várias agências. Uma
   agência pertence apenas a um banco;
4. O sistema deve permitir a criação de contas nos(as) bancos/agências com os
   seguintes atributos: número da conta e saldo. Sabe-se que um cliente pode ter
   várias contas e uma conta pode ter mais de um cliente como administrador
   (contas conjuntas, contas empresariais, etc).
5. Uma agência pode ter apenas dois tipos de contas: corrente e poupança. Para
   diferenciá-las é utilizado apenas a adição de (\1) no final da conta corrente.
   Exemplo: cc 5187, cp 5187\1;
6. O sistema deve permitir que os clientes efetuem operações de saque, depósito,
   transferências e agendamento (futuro) em uma conta. O sistema deve manter o
   registro de todas operações efetuadas pelos clientes;
7. Os agendamentos de operações devem verificar a data do lançamento da
   operação para que a data informada não seja inferior à data atual;
   Faça os seguintes diagramas:
   a. Diagrama de classes do sistema.
   i. Faça a organização do sistema em pacotes.
   b. Diagrama de caso de uso para efetuar uma transação futura.
   i. O diagrama deve contemplar tanto o fluxo normal quanto o
   fluxo alternativo.
   c. Diagrama de sequência para realizar uma operação no terminal
   ATM.
   i. O diagrama deve contemplar tanto o fluxo normal quanto o
   fluxo alternativo.
 