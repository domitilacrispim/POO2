/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood.Pizzaria;

import zapfood.Adicionais.AdicionalPepperoni;
import zapfood.Adicionais.AdicionaisABS;
import zapfood.Massa.MassaABS;
import zapfood.Massa.MassaFina;
import zapfood.Molho.MolhoABS;
import zapfood.Molho.MolhoTomatePicante;
import zapfood.Queijo.QueijoABS;
import zapfood.Queijo.QueijoMussarela;

/**
 *
 * @author Victor
 */
public class PizzaPepperoni implements Pizza{
        @Override
    public MassaABS criaMassa() {
        return new MassaFina();
    }

    @Override
    public MolhoABS criaMolho() {
        return new MolhoTomatePicante();
    }

    @Override
    public QueijoABS criaQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public AdicionaisABS criaAdd1() {
        return new AdicionalPepperoni();
    }

    @Override
    public AdicionaisABS criaAdd2() {
        return null;
    }

    @Override
    public AdicionaisABS criaAdd3() {
        return null;
    }
}
