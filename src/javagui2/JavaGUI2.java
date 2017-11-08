/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PASO 8 ES IMPORTAR LA CLASE CON LA VENTANA

package javagui2;
//PASO 8 ES IMPORTAR LA CLASE CON LA VENTANA
import interfaces.Windows;// IMPORTAR PAQUETE.CLASE
import javax.swing.JFrame;

/**
 *
 * @author LAB01
 */
public class JavaGUI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //PASO 9: 
      Windows ventana = new Windows();//  CREO UN OBJETO TIPO WINDOWS
      ventana.setVisible(true);
      ventana.setBounds(0, 0, 600, 600);
      //La siguiente instruccion le pone el nombre a la  ventana
      ventana.setTitle("Mi priemera aplicacion con ventana");
      //esta sentencia es para finalizar el proyecto
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
        // TODO code application logic here
    }
    
}
