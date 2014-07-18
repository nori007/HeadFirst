package factory.book;


/**
 * Created by nori on 2014. 7. 9..
 */
public class VeggiePizza extends Pizza{

    @Override
    void prepare() {
        System.out.println("VeggiePizza");
    }
}
