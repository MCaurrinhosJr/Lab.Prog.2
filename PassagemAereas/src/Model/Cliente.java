/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 631410050
 */
public class Cliente {
    
    private String nome;
    private String RG;
    private String Telefone;

    public Cliente(String nome, String RG, String Telefone) {
        this.nome = nome;
        this.RG = RG;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getRG() {
        return RG;
    }

    public String getTelefone() {
        return Telefone;
    }
    
    
}
