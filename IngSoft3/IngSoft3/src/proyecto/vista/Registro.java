package proyecto.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto.Modelo.RegistroModelo;
import proyecto.Modelo.Usuario;

public class Registro extends javax.swing.JFrame {

    private RegistroModelo registroModelo;

    public Registro() {
        initComponents();
        registroModelo = new RegistroModelo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registrar = new javax.swing.JButton();
        textoTitulo = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        apellidoUsuario = new javax.swing.JTextField();
        emailUsuario = new javax.swing.JTextField();
        img = new javax.swing.JLabel();
        textoEmail = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoApellido = new javax.swing.JLabel();
        textoContrasena = new javax.swing.JLabel();
        contrasenaUsuario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 203));

        registrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        textoTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textoTitulo.setText("Registro de usuario");

        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });

        apellidoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoUsuarioActionPerformed(evt);
            }
        });

        emailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailUsuarioActionPerformed(evt);
            }
        });

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/fondoDeLogin.png"))); // NOI18N

        textoEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoEmail.setText("Email:");

        textoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoNombre.setText("Nombre:");

        textoApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoApellido.setText("Apellido:");

        textoContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoContrasena.setText("Contraseña:");

        contrasenaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoEmail)
                            .addComponent(apellidoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(emailUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textoTitulo))
                            .addComponent(nombreUsuario)
                            .addComponent(textoContrasena)
                            .addComponent(textoApellido)
                            .addComponent(textoNombre)
                            .addComponent(contrasenaUsuario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(registrar)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoApellido)
                .addGap(2, 2, 2)
                .addComponent(apellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoEmail)
                .addGap(2, 2, 2)
                .addComponent(emailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(textoContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasenaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(registrar)
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        try {
            if (nombreUsuario == null) {
                System.out.println("nombreUsuario es nulo");
            }
            if (apellidoUsuario == null) {
                System.out.println("apellidoUsuario es nulo");
            }
            if (emailUsuario == null) {
                System.out.println("emailUsuario es nulo");
            }
            if (contrasenaUsuario == null) {
                System.out.println("contrasenaUsuario es nulo");
            }

            String nombre = nombreUsuario.getText();
            String apellido = apellidoUsuario.getText();
            String email = emailUsuario.getText();
            String contrasena = contrasenaUsuario.getText();

            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Email: " + email);
            System.out.println("Contraseña: " + contrasena);

            System.out.println("Entrando al bloque de código restante");

            if (nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || contrasena.isEmpty()) {
                System.out.println("Por favor, complete todos los campos.");
                return;
            }

            if (!esValidoEmail(email)) {
                System.out.println("Por favor, ingrese un correo electrónico válido.");
                return;
            }

            Usuario usuario = new Usuario(nombre, apellido, email, contrasena);
            proyecto.Modelo.RegistroModelo insertUsuario = new proyecto.Modelo.RegistroModelo();
            insertUsuario.registrarUsuario(usuario);

            System.out.println("Usuario registrado con éxito");
            if (this != null) {
                this.dispose();
                Login vistaLogin = new Login();
                vistaLogin.setVisible(true);

                this.setVisible(false);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_registrarActionPerformed

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void apellidoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoUsuarioActionPerformed
    }//GEN-LAST:event_apellidoUsuarioActionPerformed

    private void emailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailUsuarioActionPerformed

    }//GEN-LAST:event_emailUsuarioActionPerformed

    private void contrasenaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaUsuarioActionPerformed

    }//GEN-LAST:event_contrasenaUsuarioActionPerformed

    public boolean esValidoEmail(String email) {
        return email.matches("^[\\w-]+(\\.[\\w-]+)*@[\\w]+(\\.[\\w]+)*(\\.[a-z]{2,})$");
    }

    public void setRegistroListener(ActionListener listener) {
        registrar.addActionListener(e -> {
            String nombre = nombreUsuario.getText();
            String apellido = apellidoUsuario.getText();
            String email = emailUsuario.getText();
            String contrasena = new String(contrasenaUsuario.getPassword());

            listener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "registro", System.currentTimeMillis(), 0));
        });
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoUsuario;
    private javax.swing.JPasswordField contrasenaUsuario;
    private javax.swing.JTextField emailUsuario;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel textoApellido;
    private javax.swing.JLabel textoContrasena;
    private javax.swing.JLabel textoEmail;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables
}
