# Desafio
## Projeto: Validações Personalizadas com Annotations — UsuarioValidatorDemo
 Descrição do Desafio

O desafio consiste em criar anotações de validação personalizadas (custom annotations) utilizando o Bean Validation (Jakarta Validation) dentro de um projeto Spring Boot.
O objetivo foi demonstrar como desenvolver validações específicas para atributos de uma classe de modelo, aplicando boas práticas de modularização e reaproveitamento de código.<hr>

Objetivo Principal

O foco do projeto é mostrar como construir anotações customizadas e validadores específicos que verifiquem campos de um objeto antes de sua persistência ou processamento.
A ideia é permitir que cada validação tenha sua própria regra, mensagem de erro e lógica de funcionamento, mantendo o código limpo e organizado.<hr>
Estrutura do Projeto

O projeto foi dividido em camadas, seguindo a estrutura padrão do Spring Boot:

controller → recebe as requisições HTTP e aciona as validações.

model → contém a classe Usuario, onde são aplicadas as anotações de validação.

validation → concentra as anotações personalizadas e seus validadores.

exception → responsável por capturar e retornar mensagens de erro personalizadas.

main application → inicializa o projeto e ativa as configurações do Spring Boot.<hr>
Funcionamento Geral

Ao enviar uma requisição de cadastro de usuário, o sistema verifica automaticamente os dados informados com base nas anotações aplicadas nos campos da classe Usuario.

Essas validações são executadas antes do processamento da requisição, garantindo que apenas dados válidos cheguem à aplicação.
Caso alguma validação falhe, o sistema retorna uma resposta em formato JSON com as mensagens de erro específicas para cada campo.<hr>
Anotações Criadas

Foram desenvolvidas três anotações personalizadas para demonstrar o uso do Bean Validation:

@Cpf → valida se o CPF está no formato correto (XXX.XXX.XXX-XX).

@EmailCorporativo → valida se o e-mail informado pertence a um domínio corporativo (termina com @empresa.com).

@IdadeMinima → valida se o usuário possui a idade mínima exigida (exemplo: 18 anos).

Cada uma delas possui um validador dedicado que contém a lógica de verificação e a mensagem de erro correspondente.<hr>
Fluxo de Validação

O usuário envia uma requisição POST com os dados do cadastro.

O Spring Boot, junto com o Bean Validation, identifica as anotações aplicadas no modelo.

Cada campo é validado de acordo com as regras definidas nas anotações personalizadas.

Caso algum campo seja inválido, o GlobalExceptionHandler intercepta o erro e retorna uma mensagem descritiva em formato JSON.

Se todas as validações forem bem-sucedidas, a resposta confirma o sucesso do cadastro.<hr>
Tecnologias Utilizadas

Java 17+

Spring Boot

Jakarta Validation (Bean Validation)

REST API (Spring Web)

Maven 
<hr>
<h5> Conclusão</h5> 

O projeto UsuarioValidatorDemo foi desenvolvido para demonstrar, de forma prática, o uso de annotations personalizadas e validações automáticas no Spring Boot.
Essa abordagem aumenta a clareza, reutilização e manutenibilidade do código, permitindo que regras de negócio sejam implementadas de forma elegante e desacoplada.<hr>
<h1>Descrição do Desafio</h1>

Este projeto foi desenvolvido com base no desafio proposto pela Comunidade Brasil JUG Devs Java, disponível no repositório oficial:
🔗 Desafio Annotations — Comunidade Brasil JUG

(https://github.com/comunidadebrasiljug/desafio-annotations)
