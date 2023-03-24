
public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

        System.out.println("done creating store");
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
        System.out.println("about to order veggie");
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
