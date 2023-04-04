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
public class Rolar {
    
    public static void rolar(){
        
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Jogue um número de 1 a 3"));
        
        if (num == 1){
            JOptionPane.showMessageDialog(null, "Opção 1: Você avançou duas casas");
        } else if(num == 2){
            JOptionPane.showMessageDialog(null, "Opção 2: Você avançou quatro casas");
        } else if (num == 3){
            JOptionPane.showMessageDialog(null, "Opção 3: Você avançou sete casas");
        } else{
            System.exit(0);
        }
        
    }
    
}
