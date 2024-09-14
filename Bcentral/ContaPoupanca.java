package org.example;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldo, double taxaRendimento) {
        super(numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public void sacar(double saque) {
        if (getSaldo() >= saque){
            setSaldo(getSaldo() - saque);
        }
    }

    @Override
    public void imprimirTipoConta() {
        System.out.println("Conta Poupança.");
    }

    public void aplicacao(){
        double resultado = (getSaldo() * taxaRendimento) + getSaldo();
        setSaldo(resultado);
    }

}
