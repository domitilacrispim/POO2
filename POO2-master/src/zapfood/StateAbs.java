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
public abstract class StateAbs {
    
    private Restaurante restaurante;
    private int limitesuperior;
    private int limiteinferior;

    public StateAbs(Restaurante restaurante) {
        this.restaurante = restaurante;
        processamento();
    }  
    
    protected abstract void processamento();
    
    public void addPedido(){
        this.restaurante.setNum_pedidos(this.restaurante.getNum_pedidos()+1);
        this.verificarState();
    }
    
    public void removePedido(){
        this.restaurante.setNum_pedidos(this.restaurante.getNum_pedidos()-1);
        this.verificarState();
    }
    
    protected abstract void verificarState();

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public int getLimitesuperior() {
        return limitesuperior;
    }

    public void setLimitesuperior(int limitesuperior) {
        this.limitesuperior = limitesuperior;
    }

    public int getLimiteinferior() {
        return limiteinferior;
    }

    public void setLimiteinferior(int limiteinferior) {
        this.limiteinferior = limiteinferior;
    }
    
    
}
