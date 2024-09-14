package org.example;

public class Studeo {

    public static void main(String[] args) {

        Endereco maringa = new Endereco();//objeto

        Pessoa a = new Aluno("Ricardo",  2434, "Sumare");
        Pessoa b = new Professor("Cidao", 98989, "Maringa");


        Aluno ademar = new Aluno("Ademar", 123, "Maringá");
        Professor maurilio = new Professor("Maurilio", 13223131, "Maringá");
        Professor joao = new Professor("Joao", 234234, "Maringá");

        ademar.addProfessor(maurilio);
        ademar.addProfessor(joao);

        for (Professor prof : ademar.getProfessores()){
            System.out.println("prof = " + prof.getNome());
        }

        boolean check = true;

        if (check){
            Pessoa cadastro = new Professor("Maurilio", 13223131, "Maringá");
        }else {
            Pessoa cadastro = new Aluno("Ademar", 123, "Maringá");
        }

        //ademar.addProfessor(maurilio);
        //ademar.addProfessor(joao);
        //ademar.addProfessor(joao);

        //System.out.println("Qual Aluno? " + ademar.getNome());
        //System.out.println("Quais são os Professores? " + ademar.getProfessores().get(0).getNome());
        //System.out.println("Quais são os Professores? " + ademar.getProfessores().get(1).getNome());
        //System.out.println("Quais são os Professores? " + ademar.getProfessores().get(2).getNome());

    }

}