package lab3Q2;

public abstract class BeverageDecorator implements Beverage {
	protected Beverage decoratedBeverage;
	
	public BeverageDecorator(Beverage decoratedBeverage) {
		this.decoratedBeverage = decoratedBeverage;
	}

	@Override
	public int cost() {		
		return decoratedBeverage.cost();
	}

}
