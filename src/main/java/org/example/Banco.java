package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void imprimirContas(){
        System.out.println("\n=== Lista de Contas ===\n");
        for (Conta conta : contas){
            conta.listaContas();
        }

    }

}
