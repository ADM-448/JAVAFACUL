package org.example;

public class Main {
    public static void main(String[] args) {
        // Testando ContaCorrente
        ContaCorrente cc = new ContaCorrente("12345", "João", 1000, 500);
        cc.exibirInformacoes();
        cc.sacar(1200);
        cc.exibirInformacoes();

        // Testando ContaPoupanca
        ContaPoupanca cp = new ContaPoupanca("67890", "Maria", 2000);
        cp.exibirInformacoes();
        cp.sacar(2500);
        cp.exibirInformacoes();

        // Testando ContaInvestimento
        ContaInvestimento ci = new ContaInvestimento("54321", "Carlos", 3000);
        ci.exibirInformacoes();
        ci.sacar(1000);
        ci.exibirInformacoes();

        // Testando ContaSalario
        ContaSalario cs = new ContaSalario("98765", "Ana", 1500, 300);
        cs.exibirInformacoes();
        cs.sacar(500);
        cs.sacar(500);
        cs.exibirInformacoes();

        // Testando ContaInvestimentoAltoRisco
        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("11223", "Pedro", 15000);
        ciar.exibirInformacoes();
        ciar.sacar(5000);
        ciar.exibirInformacoes();
    }
}