package org.example;

import java.util.ArrayList;

public class Calendario {
    private ArrayList<Evento> eventos;

    public Calendario() {
        this.eventos = new ArrayList<>();
    }

    public String agendarEvento(Evento evento) {
        eventos.add(evento);
        return evento.agendar();
    }

    public void listarEventos() {
        for (Evento evento : eventos) {
            System.out.println(evento.agendar());
        }
    }
}
