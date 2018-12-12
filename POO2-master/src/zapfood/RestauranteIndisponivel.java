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
public class RestauranteIndisponivel extends StateAbs{

    public RestauranteIndisponivel(Restaurante restaurante) {
        super(restaurante);
    }
    
    @Override
    public void processamento() {
        this.setLimiteinferior(100);
    }

    @Override
    protected void verificarState() {
        if(this.getRestaurante().getNum_pedidos() < this.getLimiteinferior())
            this.getRestaurante().setState(new RestauranteDisponivel(this.getRestaurante()));
    }
    
}
