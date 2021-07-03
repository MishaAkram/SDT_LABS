package lab3Q2;

public class MochaDecorator extends BeverageDecorator {
	public MochaDecorator(Beverage decoratedBeverage) {
		super(decoratedBeverage);
	}
	public int cost() {	
	
		return decoratedBeverage.cost()+selectMocha(decoratedBeverage);
	}
	private int selectMocha(Beverage decoratedBeverage) {
		int price=50;
		System.out.println("Mocha cost:"+price);
		return price;
	}

}
