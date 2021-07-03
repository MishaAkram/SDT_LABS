package lab3Q2;

public class WhipDecorator extends BeverageDecorator {
		public WhipDecorator(Beverage decoratedBeverage) {
			super(decoratedBeverage);
		}
		public int cost() {		
			return decoratedBeverage.cost()+selectWhip(decoratedBeverage);
		}
		private int selectWhip(Beverage decoratedBeverage) {
			int price=100;
			System.out.println("Whip cost:"+price);
			return price;
		}

	}