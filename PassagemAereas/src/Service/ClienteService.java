/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Interface.ICliente;
import Model.Cliente;
import java.util.List;

/**
 *
 * @author marks
 */
public class ClienteService implements ICliente{

    @Override
    public Cliente InsCliente(String nome, String RG, String Telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Export(List<Cliente> Lista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
