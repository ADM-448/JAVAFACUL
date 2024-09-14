package org.example;

public class MeioPeriodo extends Funcionario{
    private int horasTrabalhadas;
    private float valorHora;

    public MeioPeriodo(String nome, int cpf, double salario, int horasTrabalhadas, float valorHora) {
        super(nome, cpf, salario);
        this.horasTrabalhadas=horasTrabalhadas;
        this.valorHora=valorHora;
    }
    @Override
    public double calcularSalario(){
        return getSalario()+(horasTrabalhadas*valorHora);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor por Hora: " + valorHora);
    }

}
