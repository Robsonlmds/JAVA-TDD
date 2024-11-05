package br.com.user.tdd.model;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class ContaTest {
    
    @Test
    void CriarConta_numeroContaValido_contaCriadaSucesso(){
        int numConta = 123;
        Conta conta = new Conta(numConta);

        assertThat(conta).isNotNull();
    }

    @Test
    void CriarConta_numeroContaValido_numeroContaSejaCorreto(){
        int numConta = 123;
        Conta conta = new Conta(numConta);

        assertThat(conta.getNumero()).isEqualTo(numConta);
    }

    @Test
    void CriarConta_numeroContaValido_saldoSeraZero(){
        int numConta = 123;

        Conta conta = new Conta(numConta);

        assertThat(conta.getSaldo()).isEqualTo(0);
    }

    @Test
    void depositar_numeroContaValido_saldoSomaDeposito(){
        int numConta = 123;
        double valorDeposito = 100;
        Conta conta = new Conta(numConta);

        conta.depositar(valorDeposito);
        assertThat(conta.getSaldo()).isEqualTo(100);
    }

    @Test
    void depositar_numeroContaValidoValorInvalido_saldoSomaDeposito(){
        int numConta = 123;
        double valorDeposito = -100;
        Conta conta = new Conta(numConta);

        conta.depositar(valorDeposito);
        assertThat(conta.getSaldo()).isEqualTo(0);
    }

    @Test
    void depositar_numeroContaValidoValorInvalido_saldoSubDeposito(){
        int numConta = 123;
        double valorSaque = 100;
        Conta conta = new Conta(numConta);

        conta.sacar(valorSaque);
        assertThat(conta.getSaldo()).isEqualTo(0);
    }
}
