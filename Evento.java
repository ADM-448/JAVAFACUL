package org.example;

public class Evento {
    protected String nome;
    protected String local;
    protected String data;
    protected boolean publico;  // Se é público ou privado

    public Evento(String nome, String local, String data, boolean publico) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.publico = publico;
    }

    public String agendar() {
        return "Evento " + nome + " agendado para " + data + " no local " + local;
    }
}
