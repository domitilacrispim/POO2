/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood.Pizzaria;

import zapfood.Adicionais.AdicionaisABS;
import zapfood.Adicionais.AdicionalOvo;
import zapfood.Adicionais.AdicionalPalmito;
import zapfood.Adicionais.AdicionalPimentao;
import zapfood.Massa.MassaABS;
import zapfood.Massa.MassaFina;
import zapfood.Molho.MolhoABS;
import zapfood.Molho.MolhoTomateTradicional;
import zapfood.Queijo.Queijo4Tipos;
import zapfood.Queijo.QueijoABS;

/**
 *
 * @author Victor
 */
public class PizzaModa implements Pizza{

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
        return new Queijo4Tipos();
    }

    @Override
    public AdicionaisABS criaAdd1() {
        return new AdicionalOvo();
    }

    @Override
    public AdicionaisABS criaAdd2() {
        return new AdicionalPimentao();
    }

    @Override
    public AdicionaisABS criaAdd3() {
        return new AdicionalPalmito();
    }
    
}
