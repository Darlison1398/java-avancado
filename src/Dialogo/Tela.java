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
public class Tela {
    public static void chama(){
        String nome;
        JOptionPane.showMessageDialog(null, "Oi, eu sou a classe Tela\n e função chama");
        nome = JOptionPane.showInputDialog("Digite o seu nome");
        
        System.out.println(nome);
    }
    
    public static void mostrar(){
        JOptionPane.showMessageDialog(null, "Olá, eu sou a segunda função mostrar");
    }
    
}
