/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood.Pizzaria;

import zapfood.Adicionais.AdicionaisABS;
import zapfood.Adicionais.AdicionalCalabresa;
import zapfood.Adicionais.AdicionalCebola;
import zapfood.Massa.MassaABS;
import zapfood.Massa.MassaFina;
import zapfood.Molho.MolhoABS;
import zapfood.Molho.MolhoTomateTradicional;
import zapfood.Queijo.QueijoABS;
import zapfood.Queijo.QueijoMussarela;

/**
 *
 * @author Victor
 */
public class PizzaCalabresa implements Pizza{
 
    @Override
    public MassaABS criaMassa() {
        return new MassaFina();
    }

    @Override
    public MolhoABS criaMolho() {
        return new MolhoTomateTradicional();
    }

    @Override
    public QueijoABS criaQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public AdicionaisABS criaAdd1() {
        return new AdicionalCalabresa();
    }

    @Override
    public AdicionaisABS criaAdd2() {
        return new AdicionalCebola();
    }

    @Override
    public AdicionaisABS criaAdd3() {
        return null;
    }
    
    
}
