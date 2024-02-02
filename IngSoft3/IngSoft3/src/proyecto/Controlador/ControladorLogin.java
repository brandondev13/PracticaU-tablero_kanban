package proyecto.controlador;
  
import proyecto.Modelo.LoginModelo;
import proyecto.vista.Login; 
import proyecto.vista.General;

public class ControladorLogin {
    public Login vistaLogin;
    private LoginModelo modeloLogin;

    public ControladorLogin(Login vistaLogin, LoginModelo modeloLogin) {
        this.vistaLogin = vistaLogin;
        this.modeloLogin = modeloLogin; 
        this.vistaLogin.setLoginListener(this::realizarLogin); 
    }
 
    private void realizarLogin(String email, char[] contrasena) { 
        if (modeloLogin.validarUsuario(email, contrasena)) { 
            General vistaGeneral = new General();
            vistaGeneral.setVisible(true); 
        } else { 
            System.out.println("Error en el login");
        }
    } 

    public static void main(String[] args) {
        LoginModelo modeloLogin = new LoginModelo();
        Login vistaLogin = new Login();
        ControladorLogin controladorLogin = new ControladorLogin(vistaLogin, modeloLogin);
        vistaLogin.setVisible(true);
    }
}
