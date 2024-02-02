package proyecto;

import proyecto.Modelo.Conexion;
import proyecto.vista.Inicio; 

public class Principal {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        javax.swing.SwingUtilities.invokeLater(() -> {
            if (conexion.get_connection() != null) {
                Inicio inicioVentana = new Inicio();
                inicioVentana.setVisible(true);
            } else {
                System.err.println("Error en la conexión a la base de datos");
            }
        });
    }
}
