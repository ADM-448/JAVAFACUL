package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento {
    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.05;
        if (saldo >= 10000 && valor + taxa <= saldo) {
            saldo -= (valor + taxa);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de retirada: R$ " + taxa);
        } else {
            System.out.println("Saldo insuficiente para saque ou saldo mínimo não atingido.");
        }
    }
}