package org.example;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente inter = new ContaCorrente("1231-1", 100.00, 1000.00);
        //inter.imprimirTipoConta();
        //System.out.println("Qual o saldo? " + inter.getSaldo());
        //System.out.println("Qual o limite? " + inter.getLimiteConta());
        //inter.sacar(1100);
        //System.out.println("Qual o Saldo? "+ inter.getSaldo());
        //inter.depositar(123);
        //System.out.println("Qual o Saldo? "+ inter.getSaldo());
        ContaPoupanca nu = new ContaPoupanca("123-1",100,0.05);
        System.out.println("Qual o saldo? "+ nu.getSaldo());
        nu.sacar(100);
        System.out.println("Qual o saldo? "+ nu.getSaldo());
        nu.depositar(100);
        System.out.println("Qual o saldo? "+ nu.getSaldo());
        nu.aplicacao();
        System.out.println("Qual o saldo? "+ nu.getSaldo());
        nu.aplicacao();
        nu.aplicacao();
        System.out.println("Qual o saldo? "+ nu.getSaldo());
    }
}
