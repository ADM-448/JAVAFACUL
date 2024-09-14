package org.example;

public class Integral extends Funcionario{

    private double bonus;

    public Integral(String nome, int cpf, double salario, double bonus) {
        super(nome, cpf, salario);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }
    @Override
    public double calcularSalario(){
        return getSalario()+(getSalario()*bonus/100);
    }
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salario: " + getSalario());
        System.out.println("Bonus: " + getBonus());
    }

}
