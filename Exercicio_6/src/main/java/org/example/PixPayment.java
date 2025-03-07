package org.example;

class PixPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de " + amount + "€ realizado via Pix.");
    }
}