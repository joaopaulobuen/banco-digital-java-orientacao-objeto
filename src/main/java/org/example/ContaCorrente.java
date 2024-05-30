package org.example;

import lombok.Getter;

@Getter
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void listaContas() {
        System.out.println("=== Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
