package org.example;

public class EventoCorporativo extends Evento {
    private String reservas;

    public EventoCorporativo(String nome, String local, String data, boolean publico, String reservas) {
        super(nome, local, data, publico);
        this.reservas = reservas;
    }

    public String reservarAmbiente() {
        return "Ambiente reservado para " + nome + " em " + local + ".";
    }
}
