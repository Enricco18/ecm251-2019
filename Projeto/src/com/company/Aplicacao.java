package com.company;

import auxiliar_database.UsuarioDAO;
import model.Usuario;
import utilities.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    UsuarioDAO usuarioDAO;
    List<Usuario> list;

    public Aplicacao() {
        this.usuarioDAO = new UsuarioDAO(Constants.urlBanco);
        this.list = new ArrayList<>();
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    String nome, email, senha;
                    System.out.println("Nome:");
                    nome = scanner.next();
                    System.out.println("\nEmail:");
                    email = scanner.next();
                    System.out.println("\nSenha:");
                    senha = scanner.next();
                    Usuario user = new Usuario(nome, email, senha);
                    usuarioDAO.insertUser(user);

                    break;
                case 2:
                    list = usuarioDAO.getAllUsers();
                    for (Usuario x : list) {
                        System.out.println("ID:" + x.id + "\tNome:" + x.nome);
                    }
                    break;
//                    case 3:
//                        break;
//                        case 4:
//                            break;
//                            case 5:
//                                break;
            }
        } while (true);
    }

        public void  menu(){
        System.out.println("1-Inserir Usuário");
        System.out.println("2-Mostrar todos os Usuários");
        System.out.println("3-Buscar Usuário");
        System.out.println("4-Atualizar Usuário");
        System.out.println("5-Remover Usuário");
        System.out.println("0- Sair");
    }

}

