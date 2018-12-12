/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood.Pizzaria;

import java.util.ArrayList;
import zapfood.Queijo.QueijoABS;
import zapfood.Massa.MassaABS;
import zapfood.Molho.MolhoABS;
import zapfood.Adicionais.AdicionaisABS;

/**
 *
 * @author Victor
 */
public abstract class Pizzaria {
    protected ArrayList<MassaABS> massa;
    protected ArrayList<MolhoABS> molho;
    protected ArrayList<QueijoABS> queijo;
    protected ArrayList<AdicionaisABS> add1;
    protected ArrayList<AdicionaisABS> add2;
    protected ArrayList<AdicionaisABS> add3;
    
    public abstract void criarPizza1();
}
