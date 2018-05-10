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
public class Voo {
    
    private int CodVoo;
    private String Origem;
    private String Destino;
    private String Horario;
    private int CodAviao;
    
    public Voo(int CodVoo, String Origem, String Destino, String Horario, int CodAviao) {
        this.CodVoo = CodVoo;
        this.Origem = Origem;
        this.Destino = Destino;
        this.Horario = Horario;
        this.CodAviao = CodAviao;
    }

    public int getCodVoo() {
        return CodVoo;
    }

    public String getOrigem() {
        return Origem;
    }

    public String getDestino() {
        return Destino;
    }

    public String getHorario() {
        return Horario;
    }

    public int getCodAviao() {
        return CodAviao;
    }
    
}
