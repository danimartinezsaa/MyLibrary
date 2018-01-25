/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class pedirDatos{
    public static String pedirString(String mensage){
        return JOptionPane.showInputDialog(mensage);
    }
    public static int pedirInt(String mensage){
        return Integer.parseInt(JOptionPane.showInputDialog(mensage));
    }
}
