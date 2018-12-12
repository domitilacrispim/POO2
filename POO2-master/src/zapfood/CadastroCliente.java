/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood;

import java.util.ArrayList;

/**
 *
 * @author a11611BCC018
 */
public class CadastroCliente {
    ArrayList<Cliente> cliente;
    
    public void cadastraCliente(Cliente cliente){
        this.cliente.add(cliente);
    }
    
    public void removeCliente(Cliente cliente){
        this.cliente.remove(cliente);
    }
}
