package org.example;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento de R$" + amount + " via PayPal.");
        System.out.println("Redirecionando para o site do PayPal...");
        System.out.println("Pagamento processado com sucesso!");
    }
}