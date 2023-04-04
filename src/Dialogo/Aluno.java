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
public class Aluno extends Pessoa {
    
    public static void funcao(){
        JOptionPane.showMessageDialog(null, "É Programador FullStack");
    }
    
    public void salario(){
        System.out.println(this.getNome() + ", ganha 10.000,00 reais");
    }
    
}
