package proyecto.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroModelo {
    
    public void registrarUsuario(Usuario usuario) {
        try {
            Conexion conexion = new Conexion();
            Connection dbConexion = conexion.get_connection();
            String sql = "INSERT INTO usuario (nombre, apellido, email, contrasena) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = dbConexion.prepareStatement(sql)) {
                statement.setString(1, usuario.getNombre());
                statement.setString(2, usuario.getApellido());
                statement.setString(3, usuario.getEmail());
                statement.setString(4, usuario.getContrasena());
                statement.executeUpdate();
            }

            System.out.println("Usuario registrado en la base de datos");
        } catch (SQLException e) {
            System.err.println("Error al registrar el usuario: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
