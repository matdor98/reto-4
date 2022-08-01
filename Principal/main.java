package Principal;
import Modelo.*;
import Vistas.*;

public class main {

    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        conexion.getConnection();
        //DatosModeloDB datosModeloDB = new DatosModeloDB();
        //datosModeloDB.pruebaFunciones();
        Login login = new Login();
        login.setVisible(true);
    }
}
