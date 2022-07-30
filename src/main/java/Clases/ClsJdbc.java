package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Luirhsiño Sanchez Surincho
 */
public class ClsJdbc {
    String driver = "com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String contrasenha = "";
    String bd = "db_votaciones";
    String url = "jdbc:mysql://localhost:3306/" + this.bd;
    
    public Connection conexion;
    
    public void CrearConexion(){
    
        try {
            
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(url, usuario, contrasenha);
            
            if(this.conexion != null){
                System.out.println("Conexión exitosa");
            }
            
        } catch (Exception error) {
            
            System.out.println("Ocurrió un error en la conexión: "+ error.getMessage());
        }
    }
}
