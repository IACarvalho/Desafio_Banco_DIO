package com.desafiobancojava;

import java.util.List;

import lombok.Data;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas;

    public void listarClientes() {
        for (Conta conta : contas) {
            conta.imprimirInfosComuns();
        }
    }

}
