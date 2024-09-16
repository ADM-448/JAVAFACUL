package org.example;
public class Main {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();

        // Criando e agendando um workshop
        Workshop workshop = new Workshop("Workshop Java", "Sala 1", "2024-10-10", true, 25);
        System.out.println(workshop.inscreverParticipante(25));
        System.out.println(calendario.agendarEvento(workshop));

        // Criando e agendando uma reunião privada
        Reuniao reuniaoPrivada = new Reuniao("Reunião de Projeto", "Sala 2", "2024-09-20", false);
        System.out.println(reuniaoPrivada.definirSenha("1234"));
        System.out.println(calendario.agendarEvento(reuniaoPrivada));

        // Criando e agendando um evento corporativo
        EventoCorporativo eventoCorporativo = new EventoCorporativo("Conferência Anual", "Auditório", "2024-11-05", true, "Sala de Conferências");
        System.out.println(eventoCorporativo.reservarAmbiente());
        System.out.println(calendario.agendarEvento(eventoCorporativo));

        // Listando todos os eventos agendados
        System.out.println("\nLista de eventos agendados:");
        calendario.listarEventos();
    }
}
