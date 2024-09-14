import java.util.Scanner;

// Definição da classe FizzBuzz
public class FizzBuzz {
    private int N;  // Atributo privado que armazena o valor de N

    // Construtor que recebe o valor de N
    public FizzBuzz(int N) {
        this.N = N;  // Inicializa o valor de N ao instanciar a classe
    }

    // Método auxiliar privado para verificar se o número é divisível por 3
    private boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    // Método auxiliar privado para verificar se o número é divisível por 5
    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    // Método principal que executa a lógica do FizzBuzz
    public void executarFizzBuzz() {
        for (int i = 1; i <= N; i++) {
            if (isDivisibleBy3(i) && isDivisibleBy5(i)) {
                System.out.println("FizzBuzz");
            } else if (isDivisibleBy3(i)) {
                System.out.println("Fizz");
            } else if (isDivisibleBy5(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // Método main para iniciar o programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria um scanner para receber a entrada do usuário

        // Solicita o valor de N ao usuário
        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();  // Lê o valor de N

        // Cria uma instância de FizzBuzz e chama o método para executar a lógica
        FizzBuzz fizzBuzz = new FizzBuzz(N);  // Instanciação da classe FizzBuzz
        fizzBuzz.executarFizzBuzz();  // Chamada ao método responsável pela execução do FizzBuzz

        scanner.close();  // Fecha o scanner para evitar vazamento de recursos
    }
}
