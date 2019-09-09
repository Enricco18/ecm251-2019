package utilities;

import model.Usuario;
import sun.reflect.generics.tree.TypeSignature;

public class Constants {
    public static final String urlBanco = "jdbc:sqlite:oi.db";
    public  static final int ID_NULO= -1;
    public static final String TABLE_NAME = "users";
    public static final String SQL_INSERT_USUARIO="INSERT INTO "+TABLE_NAME+" VALUES(?,?,?,?);";
    public static final String selectAll(String table){
        return "SELECT * FROM "+table+";";
    }
    public static final String selectId(String table, int id){
        return "SELECT * FROM "+table+" WHERE id= "+id+";";
    }
    public static final String updateUserById(String table, Usuario user){
        return "UPDATE " + table +" SET " +
                "nome=\""+user.nome +"\"," +
                "email=\""+ user.email+"\","+
                "senha=\""+ user.senha+"\""
                +"WHERE id="+user.id+";";
    }
    public static final String deleteUserById(String table, int id){
        return "DELETE FROM " + table +" WHERE id = "+id+" ;";
    }
    public static final String getInsertStmt(String table,int paramsCount){
        String sqlInsert="INSERT INTO "+table+" VALUES(";

        for (int i=0;1<paramsCount-1;i++){
            sqlInsert += "?,";
        }

        sqlInsert +="?);";
        return sqlInsert;
    }
}
