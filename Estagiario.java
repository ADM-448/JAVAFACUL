package org.example;

public class Estagiario extends Funcionario{
    private String instiuiçãoEnsino;
    private double bolsaAuxilio;

    public Estagiario(String nome, int cpf, double salario, String instiuiçãoEnsino, double bolsaAuxilio) {
        super(nome, cpf, salario);
        this.bolsaAuxilio=bolsaAuxilio;
        this.instiuiçãoEnsino=instiuiçãoEnsino;
    }
    @Override
    public double calcularSalario(){
        return bolsaAuxilio+getSalario();
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Instituição de Ensino: " + instiuiçãoEnsino);
        System.out.println("Bolsa Auxílio: " + bolsaAuxilio);
        System.out.println("Salario: " + getSalario());
    }


}
