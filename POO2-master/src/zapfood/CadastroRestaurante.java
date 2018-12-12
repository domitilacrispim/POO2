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
public class CadastroRestaurante {
    ArrayList<Restaurante> restaurante;
    
    public void cadastraRestaurante(Restaurante restaurante){
        this.restaurante.add(restaurante);
    }
    
    public void removeRestaurante(Restaurante restaurante){
        this.restaurante.remove(restaurante);
    }
}
