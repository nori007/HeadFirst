package factory.me;

/**
 * Created by nori on 2014. 7. 10..
 */
public class PizzaTest {

    public static void main(String[] args){
        Pizza pizza = null;
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        pizza = nyStore.orderPizza("cheese");
        pizza = chicagoStore.orderPizza("cheese");
    }
}
