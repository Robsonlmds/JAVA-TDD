package br.com.user.tdd.model;

public class Conta {

    private int numConta;
    private double saldo;

    public Conta(int numConta){
        this.numConta = numConta;
    }

    public int getNumero(){
        return numConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean depositar(double valorDeposito){

        if(valorDeposito >= 0){
            return false;
        }
        valorDeposito =+ saldo;
        return true;
    }

    public boolean sacar(double valorSaque){

        if(valorSaque <= 0){
            return false;
        }
        valorSaque =- saldo;
        return true;
    }
}
