package factory.me;

/**
 * Created by nori on 2014. 7. 9..
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
        }
        else if(type.equals("veggie")){
           // pizza = new VeggiePizza(ingredientFactory);
        }
        else if(type.equals("clam")){
           // pizza = new ClamPizza(ingredientFactory);
        }
        else if(type.equals("pepperoni")){
           // pizza = new PepperoniPizza(ingredientFactory);
        }
        return pizza;
    }
}
