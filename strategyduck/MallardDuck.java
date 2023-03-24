
/**
 * Created by SamMyxer on 6/16/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(
                "I'm a real Mallard duck, just like Pinocchio is a real boy");
    }

}
