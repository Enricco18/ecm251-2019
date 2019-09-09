package auxiliar_database;

import model.Usuario;
import utilities.Constants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection connection;

    public List<Usuario> getAllUsers(){
        List<Usuario> list = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(Constants.selectAll(Constants.TABLE_NAME));
            while (rs.next()){
                Usuario user= new Usuario(
                       rs.getString("nome"),
                       rs.getString("email"),
                       rs.getString("senha")
                        );
                user.id=rs.getInt("id");
                list.add(user);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public UsuarioDAO(String myConnection){
        try {
            connection = DriverManager.getConnection(myConnection);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar:");
            e.printStackTrace();
            connection = null;
        }
    }

    public boolean insertUser(Usuario user){
        if(connection==null)
            return false;
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement(Constants.SQL_INSERT_USUARIO);
            stmt.setNull(1, Types.INTEGER);
            stmt.setString(2,user.nome);
            stmt.setString(3,user.email);
            stmt.setString(4,user.senha);
            stmt.executeUpdate();
            connection.commit();

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }catch (NullPointerException e){
            e.printStackTrace();
            return false;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public  Usuario getUser(int id){
        Usuario user =null;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(Constants.selectId(Constants.TABLE_NAME, id ));
            while (rs.next()) {
                user = new Usuario(
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("senha")
                );
                user.id = rs.getInt("id");
                rs.close();
            }
            } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }
    public boolean updateUserById(Usuario user){
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(Constants.updateUserById(Constants.TABLE_NAME,user));
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }
    public boolean deleteUserById(int id){
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(Constants.deleteUserById(Constants.TABLE_NAME,id));
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }
}
