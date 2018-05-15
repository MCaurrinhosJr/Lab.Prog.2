/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;

import Model.Aviao;
import Model.Cliente;
import Model.Passagem;
import Model.Voo;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 631410050
 */
public class MainApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        List<Aviao> Avioes = new List<Aviao>();
        List<Cliente> Clientes = new List<Cliente>();
        List<Passagem> Passagens = new List<Passagem>();
        List<Voo> Voos = new List<Voo>();
        
        
        String menu = "1- Cadastro de Cliente \n 2- Cadastro de Avião \n 3- Cadastro de voo \n 4- Venda de passagens \n 5- Relatorio de vendas";
        
        int op;
        
        do {
            
            System.out.println(menu);
            
            op = in.nextInt();
            
            switch(op)
            {
                case 1://Cadastro cliente/passageiros
                    
                    System.out.println("Cadastro de cliente");
                    
                    break;
                case 2://Cadastro Avião
                    
                    System.out.println("Cadastro de avião");
                    
                    break;
                case 3://Cadastro Voo
                    
                    System.out.println("Cadastro de voo");
                    
                    break;
                case 4://Venda de passagem
                    
                    System.out.println("Venda de passagem");
                    
                    break;
                case 5://Relatorio de vendas
                    
                    System.out.println("Relatorio de vendas");
                    
                    break;
                default:
                    op = 0;
                    break;
            }
                    
        } while (op != 0);
        
    }
    
}
