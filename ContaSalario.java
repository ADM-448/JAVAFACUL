package org.example;

public class ContaSalario extends ContaCorrente {
    private int saquesGratuitosRestantes;

    public ContaSalario(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
        this.saquesGratuitosRestantes = 1;
    }

    @Override
    public void sacar(double valor) {
        if (saquesGratuitosRestantes > 0) {
            super.sacar(valor);
            saquesGratuitosRestantes--;
        } else {
            double taxa = 5.0;
            if (valor + taxa <= saldo) {
                saldo -= (valor + taxa);
                System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de saque: R$ " + taxa);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
    }
}