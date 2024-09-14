package org.example;

public class FizzBuzz {
    private int n;

    // Construtor
    public FizzBuzz(int n) {
        this.n = n;
    }

    // Método principal que aplica a lógica FizzBuzz
    public void aplicarFizzBuzz() {
        for (int i = 1; i <= n; i++) {
            String resultado = "";
            if (divisivelPor3(i) && divisivelPor5(i)) {
                resultado = "FizzBuzz";
            } else if (divisivelPor3(i)) {
                resultado = "Fizz";
            } else if (divisivelPor5(i)) {
                resultado = "Buzz";
            } else {
                resultado = Integer.toString(i);
            }
            System.out.println(resultado);
        }
    }

    // Métodos auxiliares para verificar divisibilidade
    private boolean divisivelPor3(int numero) {
        return numero % 3 == 0;
    }

    private boolean divisivelPor5(int numero) {
        return numero % 5 == 0;
    }
}
