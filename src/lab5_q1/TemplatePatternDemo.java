package lab5_q1;

public class TemplatePatternDemo {
	public static void main(String[] args) {
		Building house = new WoodenHouse();
		house.build();
		System.out.println();
		house = new GlassHouse();
		house.build();
	}
}
