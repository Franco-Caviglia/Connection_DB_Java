package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


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
            //Sentencia que va a recibir;
            String sql = "INSERT INTO usuarios (id, nombre, apellido, fecha_nacimiento, telefono, user_id) VALUES (NULL, 'Franco', 'Cavi', '2000-09-16', '15585660', '1');";

            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(sql);
            
            // ps = conexion.prepareStatement(sql);
            // rs = ps.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
}
