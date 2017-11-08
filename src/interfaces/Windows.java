/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
//paso 1- importamos las librerias
import javax.swing.*; //importamos todo de Swing
import java.awt.*;
/**
 *
 * @author LAB01
 */
//paso 2 HEREDAMOS LA CLASE DESDE JFframe
public class Windows extends JFrame
 //paso 3: DECLARAMOS ELEMENTOS A UTILIZAR       
{
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    
    //PASO 4: DEFINIR EL CONSTRUCTOR
    
    public Windows()
       // paso 5: se crea e inicializa los objetos    
    {
        panel = new JPanel();//CREAMOS UN BOJETO DE TIPO JPanel
        label = new JLabel();
        text = new JTextField(20);//CANTIDAD DE CARACTERES
        boton = new JButton();
        //PASO 6 : AGREGAR LOS ELEMENTOS JFrame
        this.add(panel);// Agregamos el JPanel al JFrame
        panel.add(label);//Agregamos los elementos al JPanel
        panel.add(text);
        panel.add(boton);
        
        //PASO 7: PROPIEDADES DE LOS OBJETOS
        
        label.setText("Nombre");
        boton.setText("Enviar");
        panel.setBackground(Color.red);// Color DE FONDO DEL JPanel
        
    }
    
}
