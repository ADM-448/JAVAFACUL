package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções de pagamento
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");
        System.out.println("4 - PayPal");
        int choice = scanner.nextInt();

        // Solicita o valor da transação
        System.out.print("Digite o valor da transação: ");
        double amount = scanner.nextDouble();

        // Cria a estratégia de pagamento com base na escolha do usuário
        PaymentStrategy paymentStrategy = null;
        switch (choice) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
            case 4:
                paymentStrategy = new PayPalPayment();
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(1);
        }

        // Processa o pagamento
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentStrategy(paymentStrategy);
        paymentProcessor.processPayment(amount);

        scanner.close();
    }
}