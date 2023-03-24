

/**
 * Created by SamMyxer on 6/16/16.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(
                "For I am just a model duck, leave me to my model ways");
    }
}
