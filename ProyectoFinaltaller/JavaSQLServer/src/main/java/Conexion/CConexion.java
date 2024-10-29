package Conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "root2";
    String contrasenia = "1234";
    String bd = "Clinica";
    String ip = "localhost";
    String puerto = "1433";
    
    public Connection establecerConexion(){
    
        Connection conectar = null; // Define la variable local
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";"+"databaseName="+bd+";"+"encrypt=true;trustServerCertificate=true";
        conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
        //JOptionPane.showMessageDialog(null, "SE CONECTO CORRECTAMENTE A LA BASE DE DATOS");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "NO SE CONECTO CORRECTAMENTE A LA BASE DE DATOS");
        e.printStackTrace();  // Imprime el error en consola
    }
    return conectar;}
    
    
}
    