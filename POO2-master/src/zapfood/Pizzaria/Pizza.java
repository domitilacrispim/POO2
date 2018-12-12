/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood.Pizzaria;

import zapfood.Adicionais.AdicionaisABS;
import zapfood.Massa.MassaABS;
import zapfood.Molho.MolhoABS;
import zapfood.Queijo.QueijoABS;

/**
 *
 * @author Victor
 */
public interface Pizza {
    public MassaABS criaMassa();
    public MolhoABS criaMolho();
    public QueijoABS criaQueijo();
    public AdicionaisABS criaAdd1();
    public AdicionaisABS criaAdd2();
    public AdicionaisABS criaAdd3();
}
