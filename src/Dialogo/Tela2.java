/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author Vaio
 */
public class Tela2 {
    
    public static void sum(){
        int a;
        int b;
        int soma;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        
        soma = a + b;
        
        JOptionPane.showMessageDialog(null, soma);
    }
    
}
