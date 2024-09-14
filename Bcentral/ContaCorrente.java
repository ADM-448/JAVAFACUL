package org.example;

    public class ContaCorrente extends ContaBancaria{

    private double limiteConta;

    public double getLimiteConta() {
        return limiteConta;
    }

    public ContaCorrente(String numeroConta, double saldo, double limiteConta) {
        super(numeroConta, saldo);
        this.limiteConta = limiteConta;
    }

    @Override
    public void sacar(double saque) {
        double total = getSaldo() + limiteConta;
        if (total>= saque){
          double resultado = getSaldo() - saque;
          setSaldo(resultado);
          // Ou setSaldo(getSaldo()-saque);
        }
    }

    @Override
    public void imprimirTipoConta() {
        System.out.println("Conta Corrente");
    }
}
