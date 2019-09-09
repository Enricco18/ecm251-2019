package model;

import java.util.List;
import static java.sql.Types.NULL;
import static utilities.Constants.ID_NULO;

public class Usuario {
    public int id ;
    public String nome;
    public String email;
    public String senha;

    public Usuario(String nome, String email, String senha) {
        this.id= ID_NULO;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
