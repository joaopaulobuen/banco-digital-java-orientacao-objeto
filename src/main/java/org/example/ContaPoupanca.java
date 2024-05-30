package org.example;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void listaContas() {
        System.out.println("=== Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
