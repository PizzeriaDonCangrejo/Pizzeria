
package asdf;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class menu extends javax.swing.JFrame {
//declaracion de variables y arreglo de usuarios
static String inputNombre;
static String inputContraseña;
static int i=1;
static int o=0;
static usuario UserInfo[]=new usuario[100];
private String [][] UserI=new String[100][2];

    public  JPasswordField getPasswordAsk() {
        return passwordAsk;
    }

    public JTextField getUserAsk() {
        return userAsk;
    }

    
    
    
    public menu() {
        UserI[0][0]=("prueba");
        UserI[0][1]=("prueba");
          for(int a=1;a<100;a++){
      for(int b=0;b<2;b++){
          String u="01927408327804732842379804723948rf79sf87s9f8aysfadñ";
        UserI[a][b]=(u);
      }
          }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passwordAsk = new javax.swing.JPasswordField();
        userAsk = new javax.swing.JTextField();
        iniciarSesion = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        imagenMenu = new javax.swing.JLabel();

        Reg.setText("Registrarse");
        Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inicio_de_seccion_listo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(580, 640));
        setName("menu"); // NOI18N
        getContentPane().setLayout(null);
        getContentPane().add(passwordAsk);
        passwordAsk.setBounds(150, 430, 260, 60);

        userAsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAskActionPerformed(evt);
            }
        });
        getContentPane().add(userAsk);
        userAsk.setBounds(150, 320, 260, 60);

        iniciarSesion.setBackground(new java.awt.Color(255, 153, 0));
        iniciarSesion.setText("Iniciar Sesion");
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarSesion);
        iniciarSesion.setBounds(220, 510, 120, 20);

        registrar.setBackground(new java.awt.Color(255, 153, 0));
        registrar.setText("Registrarse");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar);
        registrar.setBounds(230, 540, 100, 23);

        imagenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inicio_de_seccion_listo.png"))); // NOI18N
        imagenMenu.setText("jLabel1");
        getContentPane().add(imagenMenu);
        imagenMenu.setBounds(-30, -20, 600, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegActionPerformed
        
    }//GEN-LAST:event_RegActionPerformed

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
//esta parte está encargada de convertir el texto del JFrame en un String utilizable facilmente
        inputNombre=userAsk.getText();
        inputContraseña=passwordAsk.getText();
        //esto de acá convierte el usuario y contraseña ingresados en un espacio en blanco al presionar iniciar sesion, los datos
        //ya están en las 2 anteriores variables
        userAsk.setText("");
        passwordAsk.setText("");
        //llamada a iniciar();
        iniciar();
        
    }//GEN-LAST:event_iniciarSesionActionPerformed

    private void userAskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAskActionPerformed

    }//GEN-LAST:event_userAskActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
       
       //encargado del manejo de registro
       //se pide nombre y contraseña
       inputNombre=JOptionPane.showInputDialog(rootPane,"Digita tu nuevo usuario: ");
       inputContraseña=JOptionPane.showInputDialog(rootPane,"Digita tu nueva contraseña: ");
       //verificacion de contraseñas o nombres invalidos
        if(" ".equals(inputNombre)|"".equals(inputNombre)|" ".equals(inputContraseña)|"".equals(inputContraseña)){
                JOptionPane.showMessageDialog(rootPane, "ERROR!\nNo puede ingresar un usuario o\ncontraseña vacios!");
                   
       }else{
           //en caso de ser nombre y contraseña validos, se pasa a verificar que sean nombres no utilizados aún
           int cont=0;
            for (int p=0;p<100;p++){
                if(UserI[p][0].equals(inputNombre)){
                JOptionPane.showMessageDialog(rootPane,"ERROR!\nEL USUARIO YA ESTÁ REGISTRADO!");
                cont=1;
                }
            }
            if(cont==0){
            registrar();
            }
           
           
       }  
       
    }//GEN-LAST:event_registrarActionPerformed

    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reg;
    private javax.swing.JLabel imagenMenu;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordAsk;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField userAsk;
    // End of variables declaration//GEN-END:variables

public void iniciar(){
    int entrar=0;
    
    
 for (int p=0;p<100;p++){
    
          if(UserI[p][0].equals(inputNombre)&&UserI[p][1].equals(inputContraseña)){
              JOptionPane.showMessageDialog(rootPane, "INICIO DE SESION EXITOSO!");
              menu2 abrir2=new menu2();
              abrir2.setVisible(true);
              this.setVisible(false);
              entrar=1;
  }
      
 }

 if(entrar==0){
  JOptionPane.showMessageDialog(rootPane, "USUARIO NO REGISTRADO O USUARIO O CONTRASEÑA INCORRECTOS");  

 }
    
    
    
    
}

public void registrar(){
UserI[i][o]=(inputNombre);
o=o+1;
UserI[i][o]=(inputContraseña);
o=0;
i=i+1;
JOptionPane.showMessageDialog(rootPane, "Registro exitoso!\nAhora vuelve a iniciar sesion!");

}

}
