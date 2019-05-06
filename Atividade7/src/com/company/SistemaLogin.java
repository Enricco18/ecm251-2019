package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SistemaLogin
{
    private List<Usuario> list;

    public SistemaLogin() {
        this.list = new LinkedList<Usuario>();
    }

    public void Monitorar(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            ExibirMenu();
            int op = scanner.nextInt();
            AvaliarEscolha(op);
        }
    }

    private void AvaliarEscolha(int op) {
       switch (op){
           case 0: System.exit(0);break;
           case 2: CadastrarUsuario();break;
           case 3: ExibirLista();break;
           default:
               System.out.println("Sera implementado nas prox atu");break;
       }

}

    private void ExibirLista() {
        System.out.println("Usuarios cadastrados");
        for(Usuario user:list){
            System.out.println(user.getNome()+ " - " + user.getEmail());
        }
    }

    private void CadastrarUsuario() {
        System.out.println("Passa nome,email e senha:");
        Scanner scanner=new Scanner(System.in);
        String nome,email,senha;
        nome= scanner.next();
        email=scanner.next();
        senha=scanner.next();
        list.add(new Player(nome,email,senha));
        System.out.println("Cadastrado!");

    }

    private void ExibirMenu(){
        System.out.println("Logar");
        System.out.println("Novo Usuário");
        System.out.println("Usuarios cadastrados");
        System.out.println("trocar senha");
        System.out.println("sair");
    }
}
