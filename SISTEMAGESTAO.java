package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SISTEMAGESTAO {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();

        String nome;
        int n=0;
        int cpf;
        double salario;
        double bolsaAuxilio;
        String instiuiçãoEnsino;
        float valorHora;
        int horasTrabalhadas;
        double bonus;


      while (n!=5) {
          System.out.println("Qual funcionario cadastrar?");
          System.out.println("1-Estagiario\n" + "2-MeioPeriodo\n" + "3-Integral\n"+ "4-Exibir lista\n" + "5-Encerrar Programa");
          n = scanner.nextInt();

          switch (n) {
              case 1:
                  System.out.println("Nome: ");
                  nome = scanner.next();
                  System.out.println("CPF: ");
                  cpf = scanner.nextInt();
                  System.out.println("Salario: ");
                  salario = scanner.nextDouble();
                  System.out.println("Instiuição Ensino: ");
                  instiuiçãoEnsino = scanner.next();
                  System.out.println("Bolsa: ");
                  bolsaAuxilio = scanner.nextInt();
                  lista.add(new Estagiario(nome, cpf, salario,instiuiçãoEnsino, bolsaAuxilio));

                  break;
              case 2:
                  System.out.println("Nome: ");
                  nome = scanner.next();
                  System.out.println("CPF: ");
                  cpf = scanner.nextInt();
                  System.out.println("Salario: ");
                  salario = scanner.nextDouble();
                  System.out.println("Horas Trabalhadas: ");
                  horasTrabalhadas = scanner.nextInt();
                  System.out.println("Valor por Hora: ");
                  valorHora = scanner.nextInt();
                  lista.add(new MeioPeriodo(nome, cpf, salario,horasTrabalhadas, valorHora));

                  break;
              case 3:
                  System.out.println("Nome: ");
                  nome = scanner.next();
                  System.out.println("CPF: ");
                  cpf = scanner.nextInt();
                  System.out.println("Salario: ");
                  salario = scanner.nextDouble();
                  System.out.println("Bonus: ");
                  bonus = scanner.nextDouble();
                  lista.add(new Integral(nome, cpf, salario,bonus));

                  break;

              case 4:
                  System.out.println("===================================");
                    for (Funcionario a : lista){
                        a.exibirDados();
                    }
                  System.out.println("===================================");
                  break;

              case 5:
                  System.out.println("Encerrando...");
                  break;
              default:
                  System.out.println("Selecione uma opção válida Jegue");
          }
      }
    }
}
