/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood.Pizzaria;

import zapfood.Adicionais.AdicionaisABS;
import zapfood.Adicionais.AdicionalPalmito;
import zapfood.Adicionais.AdicionalRucula;
import zapfood.Massa.MassaABS;
import zapfood.Massa.MassaTradicional;
import zapfood.Molho.MolhoABS;
import zapfood.Molho.MolhoTomateTradicional;
import zapfood.Queijo.QueijoABS;
import zapfood.Queijo.QueijoMinas;

/**
 *
 * @author Victor
 */
public class PizzaPalmito implements Pizza{

    @Override
    public MassaABS criaMassa() {
        return new MassaTradicional();
    }

    @Override
    public MolhoABS criaMolho() {
        return new MolhoTomateTradicional();
    }

    @Override
    public QueijoABS criaQueijo() {
        return new QueijoMinas();
    }

    @Override
    public AdicionaisABS criaAdd1() {
        return new AdicionalPalmito();
    }

    @Override
    public AdicionaisABS criaAdd2() {
        return new AdicionalRucula();
    }

    @Override
    public AdicionaisABS criaAdd3() {
        return null;
    }
    
}
