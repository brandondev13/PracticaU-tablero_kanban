package proyecto.controlador;

import proyecto.Modelo.RegistroModelo;
import proyecto.Modelo.Usuario;
import proyecto.vista.Registro;

public class ControladorRegistro {

    public Registro vistaRegistro;
    public RegistroModelo modeloRegistro;

    public ControladorRegistro(Registro vistaRegistro, RegistroModelo modeloRegistro) {
        this.vistaRegistro = vistaRegistro;
        this.modeloRegistro = modeloRegistro;
        this.vistaRegistro.setRegistroListener(this::realizarRegistro);
    }

    public void setVistaRegistro(Registro vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
        this.vistaRegistro.setRegistroListener(this::realizarRegistro);
    }

    public void realizarRegistro(String nombre, String apellido, String email, String contrasena) {
        Usuario nuevoUsuario = new Usuario(nombre, apellido, email, contrasena);
        modeloRegistro.registrarUsuario(nuevoUsuario);
    }

    public static void main(String[] args) {
        RegistroModelo modeloRegistro = new RegistroModelo();
        Registro vistaRegistro = new Registro();
        ControladorRegistro controladorRegistro = new ControladorRegistro(vistaRegistro, modeloRegistro);
        vistaRegistro.setVisible(true);
    }
}
