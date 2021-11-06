package Lab3_q2;

public class VanillaIceCreamDecorator extends BeverageDecorator {
	public VanillaIceCreamDecorator(Beverage decoratedBeverage) {
		super(decoratedBeverage);
	}
	public int cost() {		
		return decoratedBeverage.cost()+selectVanillaIceCream(decoratedBeverage);
	}
	private int selectVanillaIceCream(Beverage decoratedBeverage) {
		int price=80;
		System.out.println("Vanilla Ice-cream cost:"+price);
		return price;
	}
}
