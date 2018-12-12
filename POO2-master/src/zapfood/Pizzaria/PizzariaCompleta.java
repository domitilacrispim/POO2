/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapfood.Pizzaria;

/**
 *
 * @author Victor
 */
public class PizzariaCompleta extends Pizzaria{
    
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    private Pizza pizza4;
    private Pizza pizza5;

    public PizzariaCompleta() {
        this.pizza1 = new PizzaCalabresa();
        this.pizza2 = new PizzaPepperoni();
        this.pizza3 = new PizzaModa();
        this.pizza4 = new PizzaPalmito();
        this.pizza5 = new PizzaHavaianna();
    }
  
    @Override
    public void criarPizza1() {
        
        //Criando Pizza de Calabresa
        this.massa.add(pizza1.criaMassa());
        this.molho.add(pizza1.criaMolho()) ;
        this.queijo.add(pizza1.criaQueijo());
        this.add1.add(pizza1.criaAdd1());
        this.add2.add(pizza1.criaAdd2());
        this.add3.add(pizza1.criaAdd3());
        
        //Criando Pizza de Pepperoni
        this.massa.add(pizza2.criaMassa());
        this.molho.add(pizza2.criaMolho()) ;
        this.queijo.add(pizza2.criaQueijo());
        this.add1.add(pizza2.criaAdd1());
        this.add2.add(pizza2.criaAdd2());
        this.add3.add(pizza2.criaAdd3());
       
        //Criando Pizza moda
        this.massa.add(pizza3.criaMassa());
        this.molho.add(pizza3.criaMolho()) ;
        this.queijo.add(pizza3.criaQueijo());
        this.add1.add(pizza3.criaAdd1());
        this.add2.add(pizza3.criaAdd2());
        this.add3.add(pizza3.criaAdd3());
        
        //Criando Pizza de Palmito
        this.massa.add(pizza4.criaMassa());
        this.molho.add(pizza4.criaMolho()) ;
        this.queijo.add(pizza4.criaQueijo());
        this.add1.add(pizza4.criaAdd1());
        this.add2.add(pizza4.criaAdd2());
        this.add3.add(pizza4.criaAdd3());
        
        //Criando Pizza Havaianna
        this.massa.add(pizza5.criaMassa());
        this.molho.add(pizza5.criaMolho()) ;
        this.queijo.add(pizza5.criaQueijo());
        this.add1.add(pizza5.criaAdd1());
        this.add2.add(pizza5.criaAdd2());
        this.add3.add(pizza5.criaAdd3());
    }
    
}
