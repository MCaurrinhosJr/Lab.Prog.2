/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.Passagem;
import java.util.List;

/**
 *
 * @author marks
 */
public interface IPassagem {
    Passagem InsePassagemrir(String cliente, String voo, String HoraCompra);
    
    void Export(List<Passagem> Lista);
}
