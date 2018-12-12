/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood;

/**
 *
 * @author a11611BCC018
 */
public class Zapfood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Restaurante r = new Restaurante("32253393");
        
        r.addPedido();
        
        
        System.out.println(r.getState().getClass().getName());
    }
    
}
