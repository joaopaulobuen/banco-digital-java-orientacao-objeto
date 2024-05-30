package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente joao = new Cliente();
        Cliente jose = new Cliente();

        joao.setNome("Joao");
        jose.setNome("Jose");

        Conta ccJoao = new ContaCorrente(joao);
        Conta ccJose = new ContaCorrente(jose);
        Conta poupanca = new ContaPoupanca(joao);

        banco.adicionarConta(ccJoao);
        banco.adicionarConta(ccJose);
        banco.adicionarConta(poupanca);

        ccJoao.depositar(100);
        ccJoao.transferir(100, poupanca);

        ccJoao.imprimirExtrato();
        ccJose.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.imprimirContas();

    }
}