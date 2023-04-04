/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Dialogo.Aluno;
import Dialogo.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author Vaio
 */
public class Segundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dialogo.Tela.chama();
        Dialogo.Tela.mostrar();
        
        Dialogo.Tela2.sum();
        
        Pessoa p1 = new Pessoa();
        Aluno al = new Aluno();
        
        al.setNome(JOptionPane.showInputDialog("Nome do aluno"));
        al.setIdade(JOptionPane.showInputDialog("Idade do Aluno"));
        
        JOptionPane.showMessageDialog(null, al.mostrar());
       /* JOptionPane.showMessageDialog(null, al.salario());*/
        
        al.funcao();
        al.salario();
        
        Dialogo.Rolar.rolar();
        
        
        
        
        
    }
    
}
