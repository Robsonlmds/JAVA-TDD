<div align="center">
  <a href="https://git.io/typing-svg">
    <img src="https://readme-typing-svg.demolab.com?font=Silkscreen&size=20&duration=1500&pause=1000&center=true&vCenter=true&multiline=true&repeat=false&random=false&width=700&height=110&lines=TDD" 
    alt="Typing SVG" />
  </a>

  <h5 align="center"> 
    <b>✅ Completo</b>
  </h5>
</div>

<h1 align="center">
  <img alt="videoSite" title="videoSite" src="CheckCep/assets/checkcep.gif"/>
</h1>

# Projeto: Sistema de Conta Bancária com Testes Unitários

Este projeto é uma implementação básica de um sistema de conta bancária com testes unitários em Java. Ele inclui uma classe `Conta` para representar contas bancárias e uma classe de teste `ContaTest` para validar as funcionalidades da conta.

## Estrutura do Projeto

- `Conta`: Classe que representa a conta bancária, incluindo métodos para depósito, saque e obtenção do número da conta e do saldo.
- `ContaTest`: Classe de testes unitários para verificar o comportamento da classe `Conta` usando o framework AssertJ.

## Funcionalidades

1. **Criação de Conta**
   - A conta é criada com um número de conta e saldo inicial de zero.
   
2. **Obtenção de Dados**
   - É possível obter o número da conta e o saldo atual.
   
3. **Depósito**
   - Permite depositar valores positivos na conta, somando ao saldo atual.
   - Depósitos com valores inválidos (negativos) são ignorados.

4. **Saque**
   - Permite realizar saques na conta, subtraindo do saldo atual.
   - Saques com valores inválidos (zero ou negativos) são ignorados.

## Classe `Conta`

### Métodos

- `Conta(int numConta)`: Construtor que inicializa a conta com o número da conta fornecido.
- `getNumero()`: Retorna o número da conta.
- `getSaldo()`: Retorna o saldo atual da conta.
- `depositar(double valorDeposito)`: Adiciona o valor de `valorDeposito` ao saldo, se o valor for positivo.
- `sacar(double valorSaque)`: Subtrai o valor de `valorSaque` do saldo, se o valor for positivo e suficiente.

### Problemas Identificados

- **Depósito e Saque**: Há problemas nas operações de depósito e saque, que não estão somando e subtraindo corretamente devido a erros de lógica nos operadores.

## Classe `ContaTest`

A classe `ContaTest` contém testes para validar as operações da classe `Conta`. Utiliza o framework AssertJ para verificar os resultados.

### Testes Implementados

- `CriarConta_numeroContaValido_contaCriadaSucesso`: Verifica se a conta foi criada com sucesso.
- `CriarConta_numeroContaValido_numeroContaSejaCorreto`: Verifica se o número da conta foi atribuído corretamente.
- `CriarConta_numeroContaValido_saldoSeraZero`: Verifica se o saldo inicial da conta é zero.
- `depositar_numeroContaValido_saldoSomaDeposito`: Verifica se o saldo aumenta corretamente após um depósito válido.
- `depositar_numeroContaValidoValorInvalido_saldoSomaDeposito`: Verifica que um depósito com valor negativo não altera o saldo.
- `depositar_numeroContaValidoValorInvalido_saldoSubDeposito`: Verifica que um saque com valor negativo não altera o saldo.

## Melhorias Futuras

- Corrigir a lógica dos métodos `depositar` e `sacar` para garantir que somem e subtraiam corretamente do saldo.
- Adicionar testes para verificar se o saldo não fica negativo após um saque.

## Requisitos

- Java 11 ou superior
- Biblioteca de testes AssertJ
- JUnit 5 para execução dos testes

## Como Executar os Testes

Para executar os testes unitários, utilize um IDE compatível com Java e JUnit, como IntelliJ IDEA ou Eclipse. Certifique-se de que os pacotes AssertJ e JUnit 5 estejam configurados.

## Conclusão

Este projeto demonstra o uso de TDD (Test-Driven Development) para criar e validar funcionalidades de uma conta bancária básica em Java. A estrutura de testes permite validar a criação da conta, operações de depósito e saque, e o saldo inicial da conta.

---
<div align="center">

## 👩🏻‍💻 Autor <br>

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/robsonlmds">
        <img src="https://avatars.githubusercontent.com/u/e?email=robsonlmds@hotmail.com&s=500" width="100px;" title="Autor Robson Lucas Messias" alt="Foto de Perfil do GitHub - Robson Lucas Messias"/><br>
        <sub>
          <b>Robson Lucas Messias</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

</div>
 
<h4 align="center">
  Made by: Robson Lucas Messias | <a href="mailto:robsonlmds@hotmail.com">Contato</a>
</h4>

<p align="center">
  <a href="https://www.linkedin.com/in/r-lucas-messias/">
    <img alt="Robson Lucas Messias" src="https://img.shields.io/badge/LinkedIn-R.Lucas_Messias-0e76a8?style=flat&logoColor=white&logo=linkedin">
  </a>
</p>

<h1 align="center">
<img src="https://readme-typing-svg.herokuapp.com/?font=Silkscreen&size=35&center=true&vCenter=true&width=700&height=70&duration=5000&lines=Obrigado+pela+atenção!;" />
</h1>
