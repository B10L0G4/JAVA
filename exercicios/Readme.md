## Lista de Execicios

____________________

Exercicos proposto do Curso de Java 

Lists

Resolva o exercicios propostos utilizando linkedList: 
System.out.println("Crie uma lista chamando notas2" + 
"e coloque todos os elementos da list Arraylist dentro desta nova lista: ");

System.out.println("Mostre a primeira nota desta nova lista sem removê-lo: ");
System.out.println("Mostre a primeira nota da nova lista removendo-o: ");

_____________________
List 

1 - Faça um programa que receba a temperatura média dos 
últimos 6 primeiros meses do ano e armazene em uma 
lista.
Após isto, calcule a média semestral das temperaturas
e mostre todas as temperaturas acima desta média, e em
que mês elas ocorreram (mostrar o mês por extenso: 1 –
Janeiro, 2 – Fevereiro, . . . ).

2 - Utilizando listas faça um programa que faça 5 perguntas para 
uma pessoa sobre um crime. As perguntas são:

1 - "Telefonou para a vítima?"
2 - "Esteve no local do crime?"
3 - "Mora perto da vítima?"
4 - "Devia para a vítima?"
5 - "Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".


___________________
Set 

1 - Criar um conjunto contendo as cores do arco-iris

 a- Exiba todas as cores uma abaixo da outra 
 b- A quantidade de cores que o arco-iris tem
 c- Exiba as cores em ordem alfabética
 d- Exiba as cores na ordem inversa da que foi informada
 e- Exiba todas as cores que começam com a letra ”v”
 f- Remova todas as cores que não começam com a letra ”v”
 g- Limpe o conjunto
 d- Confira se o conjunto está vazio

2 - Crie uma classe LinguagemFavorita que possua os atributos nome, 
anoDeCriacao e ide. Em seguida, crie um conjunto com 3 linguagens e 
faça um programa que ordene esse conjunto por:
 a - Ordem de Inserção
 b- Ordem Natural (nome)
 c- IDE
 d - Ano de criação e nome
 e- Nome, ano de criacao e IDE
Ao final exiba as linguagens no console, uma abaixo da outra.

-------------------
Map



> Instruções: Para cada uma das questões, entenda, analise, elabore uma solução e a 
implemente  em Java. Sempre que necessário pesquise no material didático fornecido,
na bibliografia sobre o tema e na Web,ou solicite ajuda ao professor.

```
class Pessoa { 
   private String nome; 
   public Pessoa(String nome) {
      this.nome = nome;
   }
> 
   public String toString() {
      return "Nome: " + nome;
   }
}
```

> 1.Com base na classe Pessoa acima, reutilizando-apor meio de herança, crie uma classe Aluno, que declare: 
(a)uma variável de instância matrícula;(b) um construtor que inicialize o nome e a matrícula 
com base em seus parâmetros;e (c) um método toString() que retorne uma String contendoa matrícula 
e o nome do aluno.

> 2.Quais asformas de reuso de classes estudadas?
Cite as principais diferenças e semelhanças e dê exemplos.

> 3 Quais  são  os  quatro  níveis  de  acesso  e  quais  modificadores  são  usados  para  cada  um? 
> Com  funcionam  as restrições impostas por modificadores de acesso, quando a delegação é adotada? Exemplifique.

> 4.Aprofunde o estudo sobre delegação, dando um novo exemplo.

> 5.Aprofunde o estudo sobre herança, dando um novo exemplo.

> 6.Defina superclasse e subclasse e dê exemplos.

> 7.O  que  podemos  afirmarsobre construtores?  Cite  as  principais  diferenças  e  semelhanças de  um 
> construtor para um método convencional e dê exemplo.

> 8.Para  a  declaração  de  uma variável  de instância  x,  que  permite  que x  seja  acessível DIRETAMENTE a  
> partir  de todas  as  classes  do  mesmo  pacotee  apenas  destas, qual  modificador  de  acesso devemos  ter? 
> Justifique  e demonstre por meio de um exemplo. 

> 9.Para a declaração de uma variável de instância y, que permite que y seja acessível DIRETAMENTE a
> partir de todas  as  classes  de  qualquer  pacote, qual  modificador de  acessodevemos  ter?  
> Justifique  e  demonstre  por meio de um exemplo.

> 10.Para a declaração de uma variável de instância y, que NÃO permite que y 
> seja acessível DIRETAMENTE partir de qualquer  outra classe,  independente  
> de pacote, qual  modificador de  acessodevemos  ter?  Justifique  e demonstre 
> por meio de um exemplo.

> 11.O que ée como se dá a sobreposição de métodos? Qual a diferença para 
> sobrecarga de métodos?O método toString é um exemplo de sobrecarga ou de sobreposição?Explique.

> 12.Explique e dê um exemplo de uso de cada uma das seguintes palavras-chaves: this, super, 
> static.

> 13.Qual método é usado como ponto de entrada para execução de uma classe? Exemplifique.
> 
> 14 Implemente um programa para calcular a área de um trapézio, onde:  
>h = altura  b = base menor  B = base maior  Área = (h . (b + B)) / 2
>
> 15 Faça o programa acima calcular utilizando valores de ponto flutuante e depois imprima na tela duas informações:    
> Valor exato da área:    Valor arredondado para inteiro:
> 
>  16 Calcule o valor das seguintes equações: <br>
> a. 3 – 2 – 1 + 2 + 1 + 3 <br> 
> b. 2 * 3 – 4 * 5 <br>
> c. 2 + 6 – 3 / 7 * 9 <br>
> d. 3 % 4 – 8<br>
> 
> 17 Indique qual o valor verdade das seguintes expressões: <br>
> a. (1 > 2) // exemplo: false<br>
> b. (8 == 8)  // exemplo:true <br>
> c. ((12 – 5) > 6) <br>
> d. (0 < 3) && (8 < 9) <br>
> e. ((i++) > i) <br>
> f. ((10 * 90 / 50 – 2) == 16)<br>

> 18 Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e a multiplicação dos 
> números pares entre 0 e 30.

> 19 Faça um programa para imprimir os números primos de 1 a 123.

> 20 Faça um programa para ler um número do teclado e imprimir na tela se ele é par ou ímpar. Imprima 
> também se ele é primo.

> 21 O valor pago por um Hotel da Praia de Iracema para seus porteiros
> é de R$ 10,25 por hora de trabalho. 
> Faça um programa que pergunte ao usuário quantas horas ele trabalhou e 
> imprima na tela o valor do salário a ser recebido por ele.

> 21-1 Modifique o programa anterior para que o sistema imprima uma mensagem de alerta quando o valor 
> a ser pago ao funcionário seja inferior a R$ 50,00: "Atenção, dirija-se à 
> direção do Hotel!".

> 22 Existem 454 gramas em uma libra, e 1000 gramas em um quilo. 
> Faça um programa que converta quilos para libras e vice-versa. 
> (Dica: use um caractere indicando a ordem da conversão, exemplo 
> "java q 1000"seria o comando para converter 1000 quilos para libra, 
> e "java l 1000" seria o comando para converter 1000 libras para quilo)
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
