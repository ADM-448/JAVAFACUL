package org.example;

public class Reuniao extends Evento {
    private String senha;

    public Reuniao(String nome, String local, String data, boolean publico) {
        super(nome, local, data, publico);
        this.senha = null;
    }

    public String definirSenha(String senha) {
        if (!publico) {
            this.senha = senha;
            return "Senha definida para a reunião privada " + nome + ".";
        } else {
            return "Reuniões públicas não precisam de senha.";
        }
    }
}
