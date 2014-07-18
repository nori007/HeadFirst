package factory.book;

/**
 * Created by nori on 2014. 7. 9..
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }
        else if(type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }
        else if(type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }
        else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
