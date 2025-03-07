package org.example;

class BoletoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de " + amount + "€ realizado via Boleto.");
    }
}