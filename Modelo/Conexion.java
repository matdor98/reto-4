package Modelo;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection connection;
    private String driver ="com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String urlConexion = "jdbc:mysql://localhost:3306/dbm_reto1";
    public Conexion(){
        try {
            Class.forName(driver);
            connection=(Connection)DriverManager.getConnection(urlConexion,user,password);
            
            if(connection !=null){
                System.out.println("Conexión exitosa");
            }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Fallo en la conexión"+e);
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void finalizarConexion(){
        if(connection !=null){
            try{
                connection.close();
                connection = null;
            }catch(SQLException e){
                System.out.println("error");
            }
        }
    }
    
}
