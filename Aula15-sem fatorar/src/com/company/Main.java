package com.company;

import auxiliar_database.UsuarioDAO;
import model.Usuario;
import utilities.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Aplicacao app = new Aplicacao();
        app.run();

    }
}
