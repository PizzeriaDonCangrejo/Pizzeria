
package asdf;

import javax.swing.JOptionPane;

public class opener {

 static menu abrirMenu=new menu();
 static menu2 abrirMenu2=new menu2();
 static pedir abrirPedir=new pedir();
 static extras abrirExtras=new extras(); 
 static facturacion abrirFacturar=new facturacion();
 static menuExtras abrirMextras=new menuExtras();
 
     public static void abrir1(){
    abrirMenu.setVisible(true); 
    }
     
    public static void abrir2(){
    abrirMenu2.setVisible(true);
    }
    
    public static void abrirPedir(){
    abrirPedir.setVisible(true);
    }          
              
    public static void abrirExtras(){
    abrirExtras.setVisible(true);

    }
    
    public static void abrirFacturar(){
    abrirFacturar.setVisible(true);
    
    
    }
    
    public static void abrirMExtra(){
    abrirMextras.setVisible(true);
    
    }
    
    
    
}
