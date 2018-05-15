/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.Aviao;
import java.util.List;

/**
 *
 * @author marks
 */
public interface IAviao {
    Aviao InseAviao(int Codigo, String Nome, String QtdAssentos);
    
    void Export(List<Aviao> Lista);
}
