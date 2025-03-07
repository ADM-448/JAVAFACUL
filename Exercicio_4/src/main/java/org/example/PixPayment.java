package org.example;

import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = generatePixCode();
        System.out.println("Pagamento de R$" + amount + " via PIX.");
        System.out.println("Código PIX: " + pixCode);
        System.out.println("Pagamento processado com sucesso!");
    }

    private String generatePixCode() {
        Random random = new Random();
        return "PIX" + random.nextInt(100000);
    }
}