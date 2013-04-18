Narrative: Calculadora básica.

GivenStories: com/madruga/jbehaveweb/stories/inicio.story

Scenario: usuario efetua uma soma
Given o usuario esta na tela calculadora
When o usuario informa os numeros 10 e 20
And o usuario seleciona a operacao somar
And o usuario seleciona o botao calcular
Then o resultado sera igual a 30

Scenario: usuario limpa os campos
Given o usuario esta na tela calculadora
When o usuario informa os numeros 10 e 20
And o usuario seleciona a operacao somar
And o usuario seleciona o botao calcular
And o usuario seleciona o botao limpar campos
Then o operandoUm sera igual a 0
And o operandoDois sera igual a 0
And o resultado sera igual a 0

Scenario: usuario efetua uma multiplicacao
Given o usuario esta na tela calculadora
When o usuario informa os numeros 5.2 e 20.0
And o usuario seleciona a operacao multiplicar
And o usuario seleciona o botao calcular
Then o resultado sera igual a 104

Scenario: usuario efetua uma divisao com numero negativo
Given o usuario esta na tela calculadora
When o usuario informa os numeros 15.64 e -3.4
And o usuario seleciona a operacao dividir
And o usuario seleciona o botao calcular
Then o resultado sera igual a -4.6
