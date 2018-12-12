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
public class RestauranteDisponivel extends StateAbs{

    public RestauranteDisponivel(Restaurante restaurante) {
        super(restaurante);
    }
    
    @Override
    public void processamento() {
        this.setLimitesuperior(100);
        this.setLimiteinferior(0);
    }

    @Override
    protected void verificarState() {
        if(this.getRestaurante().getNum_pedidos() > this.getLimitesuperior())
            this.getRestaurante().setState(new RestauranteIndisponivel(this.getRestaurante()));
        else if(this.getRestaurante().getNum_pedidos() < this.getLimiteinferior())
            this.getRestaurante().setNum_pedidos(0);
    }
    
}
