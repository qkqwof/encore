package pizza.child;

import pizza.parent.Pizza;

public class BulgogiPizza extends Pizza{

	public BulgogiPizza(int price, String storeName) {
		super(price,storeName);
	}
	
	public void topping() {
		System.out.println("Bulgogi Topping....Pizza");
	}
	
	
}
