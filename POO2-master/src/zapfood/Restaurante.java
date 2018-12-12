/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author a11611BCC018
 */
public class Restaurante {
   protected String nome;
   protected String endereço;
    protected String  telefone;
    protected int tempo_min;
    protected int num_pedidos;
    
    private StateAbs state;

    public Restaurante(String telefone) {
        this.telefone = telefone;
        
        this.state = new RestauranteDisponivel(this);
        this.num_pedidos = 0;
    }

    
    public void addPedido(){
        state.addPedido();
    }
    
    public void removePedido(){
        state.removePedido();
    }
    
    public int getNum_pedidos() {
        return num_pedidos;
    }

    public void setNum_pedidos(int num_pedidos) {
        this.num_pedidos = num_pedidos;
    }
    
    
    
    public String getNome() throws SQLException {

		ConexaoBanco b = ConexaoBanco.getInstance();
		ResultSet rs = b.stm.executeQuery("Select nome from restaurante where telefone="+telefone);
		rs.next();
		if(rs!=null)
		return rs.getString("nome");
		return "null";
    	
    }


    public String getEndereço() throws SQLException {
    	ConexaoBanco b = ConexaoBanco.getInstance();
		ResultSet rs = b.stm.executeQuery("Select endereco from restaurante where telefone="+telefone);
		rs.next();
		if(rs!=null)
		return rs.getString("endereco");
		return "null";
    	
    }

    

    public String getTelefone() {
        return telefone;
    }


    public int getTempo_min() {
        return tempo_min;
    }


    public StateAbs getState() {
        return state;
    }

    public void setState(StateAbs state) {
        this.state = state;
    }
    
}
