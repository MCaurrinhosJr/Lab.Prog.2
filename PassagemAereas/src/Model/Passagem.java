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
public class Passagem {
    
    private String cliente;
    private String voo;
    private String HoraCompra;

    public Passagem(String cliente, String voo, String HoraCompra) {
        this.cliente = cliente;
        this.voo = voo;
        this.HoraCompra = HoraCompra;
    }

    public String getCliente() {
        return cliente;
    }

    public String getVoo() {
        return voo;
    }

    public String getHoraCompra() {
        return HoraCompra;
    }
    
    
}
