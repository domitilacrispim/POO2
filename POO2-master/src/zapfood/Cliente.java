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
public class Cliente {
    protected String cpf;
    protected String nome;
    protected String telefone;
    protected String email;
    protected String endereco;
    protected int cartao;

    public Cliente(String cpf) {
        this.cpf = cpf;
        
    }
    
    public String getCpf() {
        return cpf;
    }

    

    public String getNome() throws SQLException {
    	ConexaoBanco b = ConexaoBanco.getInstance();
		ResultSet rs = b.stm.executeQuery("Select nome from cliente where cpf="+cpf);
		rs.next();
		if(rs!=null)
		return rs.getString("nome");
		return "null";
    	
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }
 
}
