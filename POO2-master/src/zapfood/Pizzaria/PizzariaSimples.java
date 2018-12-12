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
public class PizzariaSimples extends Pizzaria{
    
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public PizzariaSimples() {
        this.pizza1 = new PizzaCalabresa();
        this.pizza2 = new PizzaPepperoni();
        this.pizza3 = new PizzaModa();
    }
  
    @Override
    public void criarPizza1() {
        //Criando Pizza Calabresa
        this.massa.add(pizza1.criaMassa());
        this.molho.add(pizza1.criaMolho()) ;
        this.queijo.add(pizza1.criaQueijo());
        this.add1.add(pizza1.criaAdd1());
        this.add2.add(pizza1.criaAdd2());
        this.add3.add(pizza1.criaAdd3());
        
        //Criando Pizza Pepperoni
        this.massa.add(pizza2.criaMassa());
        this.molho.add(pizza2.criaMolho()) ;
        this.queijo.add(pizza2.criaQueijo());
        this.add1.add(pizza2.criaAdd1());
        this.add2.add(pizza2.criaAdd2());
        this.add3.add(pizza2.criaAdd3());
        
        //Criando Pizza Moda
        this.massa.add(pizza3.criaMassa());
        this.molho.add(pizza3.criaMolho()) ;
        this.queijo.add(pizza3.criaQueijo());
        this.add1.add(pizza3.criaAdd1());
        this.add2.add(pizza3.criaAdd2());
        this.add3.add(pizza3.criaAdd3());
    }
    
}
