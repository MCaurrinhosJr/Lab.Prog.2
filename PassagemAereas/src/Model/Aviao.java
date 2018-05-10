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
public class Aviao {
    
    private int Codigo;
    private String Nome;
    private String QtdAssentos;

    public Aviao(int Codigo, String Nome, String QtdAssentos) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.QtdAssentos = QtdAssentos;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public String getQtdAssentos() {
        return QtdAssentos;
    }
    
    
}
