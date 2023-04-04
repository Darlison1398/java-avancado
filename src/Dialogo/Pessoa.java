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
public class Pessoa {
    public String nome;
    public String idade;
    
    public Pessoa(){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public String mostrar(){
        return "Nome: " + nome + "\nIdade: " + idade;
    }
    
}
