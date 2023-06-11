package DAO;


import java.sql.Connection;
import java.sql.DriverManager;


public class ClienteDAO {
    
    public void conectar(){
        String baseDatos = "gestion_clientes";
        String usuario = "root";
        String password = "";
        String hosting = "localhost";
        String puerto = "3306";
        String driver = "com.mysql.cj.jdbc.Driver";
        String conexionUrl = "jdbc:mysql://" + hosting + ":" + puerto + "/" + baseDatos + "?useSSL=false";
        
        Connection conexion = null;

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(conexionUrl, usuario, password);


        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
}
