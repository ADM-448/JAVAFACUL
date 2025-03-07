package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções de notificação
        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        System.out.println("3 - Push Notification");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        // Mapeia a escolha do usuário para o tipo de notificação
        String notificationType = "";
        switch (choice) {
            case 1:
                notificationType = "email";
                break;
            case 2:
                notificationType = "sms";
                break;
            case 3:
                notificationType = "push";
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(1);
        }

        // Solicita a mensagem a ser enviada
        System.out.print("Digite a mensagem: ");
        String message = scanner.nextLine();

        // Cria a notificação usando a fábrica
        Notification notification = NotificationFactory.createNotification(notificationType);

        // Envia a notificação
        notification.send(message);

        scanner.close();
    }
}