package proyecto.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

public class LoginModelo {
    private Conexion conexion;

    public LoginModelo() {
        this.conexion = new Conexion();
    }

    public boolean validarUsuario(String email, char[] contrasena) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = conexion.get_connection();
            if (con != null) {
                String query = "SELECT * FROM usuario WHERE email = ? AND contrasena = ?";
                pst = con.prepareStatement(query);
                pst.setString(1, email);
                pst.setString(2, new String(contrasena)); 
                rs = pst.executeQuery();
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
