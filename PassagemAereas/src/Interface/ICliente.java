/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.Cliente;
import java.util.List;

/**
 *
 * @author marks
 */
public interface ICliente {
    Cliente InsCliente(String nome, String RG, String Telefone);
    
    void Export(List<Cliente> Lista);
}
