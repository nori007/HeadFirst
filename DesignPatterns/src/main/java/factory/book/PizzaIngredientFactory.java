package factory.book;


/**
 * Created by nori on 2014. 7. 15..
 */
public interface PizzaIngredientFactory {

    public Dough createDouch();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
