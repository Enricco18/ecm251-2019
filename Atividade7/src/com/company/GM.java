package com.company;

public class GM extends Usuario {
    public GM(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public boolean autentica(String senha) {
        return false;
    }
}
