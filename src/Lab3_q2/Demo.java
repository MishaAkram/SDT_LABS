package Lab3_q2;

public class Demo {
	public static void main(String[] args) {
		Beverage espresso= new Espresso();
		Beverage mochaEspresso = new MochaDecorator(new Espresso());
		Beverage whipEspresso = new WhipDecorator(new Espresso());
		Beverage mwEspresso = new WhipDecorator(new MochaDecorator(new Espresso()));
		Beverage hotChocolate= new HotChocolate();
		Beverage vanillaHotChocolate = new VanillaIceCreamDecorator(new Espresso());
		
		System.out.println("Espresso cost:"+espresso.cost());
		System.out.println("Espresso with Mocha cost:" + mochaEspresso.cost());
		System.out.println("\n");
		System.out.println("Espresso cost:"+espresso.cost());
		System.out.println("Espresso with Whip cost:" + whipEspresso.cost());
		System.out.println("\n");
		System.out.println("Espresso cost:"+espresso.cost());
		System.out.println("Espresso with Mocha & Whip cost:" + mwEspresso.cost());
		System.out.println("\n");
		System.out.println("Hot Chocolate cost:"+hotChocolate.cost());
		System.out.println("Hot Chocolate with Vanilla Ice-cream cost:" + vanillaHotChocolate.cost());

	}
}
