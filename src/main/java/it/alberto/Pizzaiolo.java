package it.alberto;

import it.alberto.pizza.*;

// Parto col dire che questo in realtà lo metterei in Pizza, e non qua
public class Pizzaiolo {
    private static class Builder{
        private Pizza pizza;

        public Builder() {
            this.pizza = new BasePizza();
        }

        /* C++ me l'avrebbe fatto fare...
        <T extends Pizza> Pizzaiolo.Builder add(){
            this.pizza = new T(pizza == null ? new BasePizza() : pizza);
            return this;
        }
        */
        <T extends Pizza>Pizzaiolo.Builder add(Class<T> pizzaClass) {
            try {
                pizza = pizzaClass.getDeclaredConstructor(Pizza.class).newInstance(pizza);
            }catch (Exception ignored){}
            return this;
        }
        Pizza get(){
            return pizza;
        }
    }
    public static void main( String[] args ) {
        Pizza margheritaConPatatineWurstel = new Pizzaiolo()
                .makeMargherita()
                .add(WurstelPizza.class)
                .add(ChipsPizza.class)
                .get();
        System.out.println(String.join(", ", margheritaConPatatineWurstel.ingredients()));
    }

    // questo per redere "più elastica la costruzione
    public Builder makeMargherita(){
        return new Builder()
                .add(MargheritaCheesePizza.class)
                .add(TomatoPizza.class);
    }
    // così se "da qualche parte" voglio mettere qualcosa in più
    // per esempio se un cliente vorrà "margherita + questa aggiunta"
    // ma ovviamente questo dipende dal contesto del progetto

}
