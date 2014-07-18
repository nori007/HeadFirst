package factory.me;

/**
 * Created by nori on 2014. 7. 9..
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }
        else if(type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }
        else if(type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        }
        else if(type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
