package org.example;
public class Tarefa {
    private String nome;
    private String prazo;
    private boolean concluida;
    // Construtor
    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.concluida = false;
    }
    // Método para criar uma tarefa
    public void criarTarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.concluida = false;
    }

    // Método para marcar a tarefa como concluída
    public void concluirTarefa() {
        this.concluida = true;
    }

    // Método para alterar o prazo da tarefa
    public void alterarPrazo(String novoPrazo) {
        this.prazo = novoPrazo;
    }

    // Método para consultar o status da tarefa
    public boolean isConcluida() {
        return this.concluida;
    }

    // Getters para nome e prazo
    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }
}
