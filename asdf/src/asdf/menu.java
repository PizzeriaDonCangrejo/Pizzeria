
package asdf;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class menu extends javax.swing.JFrame {
//declaracion de variables y arreglo de usuarios
static String inputNombre;
static String inputContraseña;
static int i=1;
static usuario UserInfo[]=new usuario[100];

    public  JPasswordField getPasswordAsk() {
        return passwordAsk;
    }

    public JTextField getUserAsk() {
        return userAsk;
    }

    
    
    
    public menu() {
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
       inputNombre=JOptionPane.showInputDialog("Digita tu nuevo usuario: ");
       inputContraseña=JOptionPane.showInputDialog("Digita tu nueva contraseña: ");
       //verificacion de contraseñas o nombres invalidos
        if(" ".equals(inputNombre)|"".equals(inputNombre)|" ".equals(inputContraseña)|"".equals(inputContraseña)){
                JOptionPane.showMessageDialog(null, "ERROR!\nNo puede ingresar un usuario o\ncontraseña vacios!");
                   
       }else{
           //en caso de ser nombre y contraseña validos, se pasa a verificar que sean nombres no utilizados aún
           //declaracion de variable reg para control
            int p=1;
            boolean continuar=true;
            
            
            
            
            
            
            
            
           do{
               if(inputNombre==UserInfo[p].getUser()){
               JOptionPane.showMessageDialog(null, "ERROR!\nEl usuario ya está registrado!");
               p=100;
               continuar=false;
               }
               p=p+1;
           }while(99>=p);
           if(continuar!=false){
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

    
    
    
    
}

public void registrar(){
    
    boolean ini=true;
    if(ini=true){
            //inicializacion de 99 arreglos de nombre UserInfo
        UserInfo[1]=new usuario("a","a");
        for(int p=1;p==99;p++){
        UserInfo[p]=new usuario("aaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaa");
        }
        ini=false;
    
    }
    
    
    
    
    
    
    
UserInfo[i]=new usuario(inputNombre, inputContraseña);
i=i+1;
JOptionPane.showMessageDialog(null, "Registro exitoso!\nAhora vuelve a iniciar sesion!");

}

}
