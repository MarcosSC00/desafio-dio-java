# desafio-dio-java-basico

Nesse projeto aplico as habilidades desenvolvidas durante o curso de `Trilha Java Básico` oferecido pela [DIO](http://www.dio.me/).

Esse programa simula uma conta bancária onde o usuário fornce seus dados e recebe uma mensagem de rotorno.

>[!NOTE]
>Tanto a exibição da mensagem quanto os dados passados pelo usuário são feitos via terminal.

Também é verficado se os dados informados pelo usuário estão de acordo com as condições específicadas no programas.
A tabela abaixo mostra os atributos exigidos ao usuário e sua respectivas condições de válidade.

|Atributos|Condição|
|--------|----------|
|Nome do usuario|`!null` |
|Número|`positivo`|
|Agência|`5 caracteres do tipo int`|
|Saldo|`positivo`|

>[!NOTE]
>Os nomes dos atributos na tabela acima não correspondem aos atributos criados no programa.

>[!IMPORTANT]
>O valor para o `Saldo` deve utilizar a `,` como separador das casas decimais.

>[!TIP]
>Caso o usuário exceda os cinco caracteres no atributo `Agencia` é aplicada uma máscara onde apenas os cinco primeiros valores são selecionados. 
