package pizza.child;

import pizza.parent.Pizza;

public class PotatoPizza extends Pizza{

	public PotatoPizza(int price, String storeName) {
		super(price,storeName);
	}
	
	public void topping() {
		System.out.println("Potato Topping....Pizza");
	}
	
	
}
