package org.example;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pagamento de R$" + amount + " via Cartão de Crédito.");
        System.out.print("Digite o número do cartão (fictício): ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento processado com sucesso para o cartão: " + cardNumber);
    }
}