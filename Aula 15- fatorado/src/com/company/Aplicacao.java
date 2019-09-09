package com.company;

import auxiliar_database.SingletonUsuarioDao;
import model.Usuario;
import utilities.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    List<Usuario> list;

    public Aplicacao() {

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
                    SingletonUsuarioDao.getInstance().insertUser(user);

                    break;
                case 2:
                    list = SingletonUsuarioDao.getInstance().getAllUsers();
                    for (Usuario x : list) {
                        System.out.println("ID:" + x.id + "\tNome:" + x.nome);
                    }
                    break;
                    case 3:
                        System.out.println("Informe o Id:");
                        Usuario usuario = usuarioDAO.getUser(scanner.nextInt());
                        if(usuario==null)
                            System.out.println("Usuário não encontrado");
                        else
                            System.out.println("ID:" + usuario.id + "\tNome:" + usuario.nome + "\temail:"+usuario.email );
                        break;
                        case 4:
                            System.out.println("Informe o Id:");
                            usuario = usuarioDAO.getUser(scanner.nextInt());
                            if(usuario==null)
                                System.out.println("Usuário não encontrado");
                            else {
                                System.out.println("ID:" + usuario.id + "\tNome:" + usuario.nome + "\temail:" + usuario.email);
                                System.out.println("Qual campo alterar?");
                                System.out.println("1-Nome");
                                System.out.println("2-Email");
                                System.out.println("3-Senha");
                                op = scanner.nextInt();
                                System.out.println("Novo valor:");
                                String temp = scanner.next();
                                switch (op){
                                    case 1: usuario.nome = temp;break;
                                    case 2: usuario.email = temp;break;
                                    case 3: usuario.senha = temp;break;
                                }
                                usuarioDAO.updateUserById(usuario);
                            }
                           break;
                            case 5:
                                System.out.println("Informe o Id:");
                                usuarioDAO.deleteUserById(scanner.nextInt());

                                break;
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

