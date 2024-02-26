package proyecto.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Conexion {
    public Connection get_connection() {
        Connection conection = null;
        try {
            System.err.println("Va a conectar");
            conection = DriverManager.getConnection ("jdbc:mysql://localhost/u","root", "1234");        
            System.out.println("Conecto");
        } catch(SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
}