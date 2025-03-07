package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = generateBoletoCode();
        System.out.println("Pagamento de R$" + amount + " via Boleto.");
        System.out.println("Código do Boleto: " + boletoCode);
        System.out.println("Pagamento processado com sucesso!");
    }

    private String generateBoletoCode() {
        Random random = new Random();
        return "BOLETO" + random.nextInt(100000);
    }
}