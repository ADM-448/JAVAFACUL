package org.example;

public abstract class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void sacar(double saque);
    public abstract void imprimirTipoConta();

    public void depositar(double deposito){
        saldo += deposito;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
