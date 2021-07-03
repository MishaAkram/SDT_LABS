package lab3Q2;

public class Demo {

	public static void main(String[] args) {
		Beverage espresso= new Espresso();
		Beverage mochaEspresso = new MochaDecorator(new Espresso());
		Beverage whipEspresso = new WhipDecorator(new Espresso());
		
		System.out.println("Espresso cost:"+espresso.cost());
		System.out.println("\nEspresso with Mocha cost:" + mochaEspresso.cost());
		
		System.out.println("Espresso cost:"+espresso.cost());
		System.out.println("\nEspresso with Whip cost:" + whipEspresso.cost());
		

	}

}
