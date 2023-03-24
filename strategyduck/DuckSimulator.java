
/**
 * Created by SamMyxer on 6/16/16.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        
        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println();

        Duck rd = new RubberDuck();
        rd.display();
        rd.performFly();
        rd.performQuack();
    }
}
