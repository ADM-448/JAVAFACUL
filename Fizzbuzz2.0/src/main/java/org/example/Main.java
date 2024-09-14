package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor de N
        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        // Cria uma instância da classe FizzBuzz
        FizzBuzz fizzBuzz = new FizzBuzz(n);

        // Chama o método para aplicar as regras FizzBuzz
        fizzBuzz.aplicarFizzBuzz();

        scanner.close();
    }
}
