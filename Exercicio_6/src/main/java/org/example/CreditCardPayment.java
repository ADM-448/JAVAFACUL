package org.example;

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de " + amount + "€ realizado via Cartão de Crédito.");
    }
}