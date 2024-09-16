package org.example;

public class Workshop extends Evento {
    private int participantes;
    private final int limiteParticipantes = 30;

    public Workshop(String nome, String local, String data, boolean publico, int participantes) {
        super(nome, local, data, publico);
        this.participantes = participantes;
    }

    public String inscreverParticipante(int qtdParticipantes) {
        if (qtdParticipantes <= limiteParticipantes) {
            return "Workshop " + nome + " com " + qtdParticipantes + " participantes foi inscrito.";
        } else {
            return "Número de participantes excede o limite de " + limiteParticipantes;
        }
    }
}
