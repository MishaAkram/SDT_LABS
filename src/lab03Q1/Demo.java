package lab03Q1;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gift item01 = new Item01();
		Gift item01Wrapped = new PurpleGiftWrapGiftDecorator(new Item01());
		Gift item02Ribboned = new BlueRibbonGiftDecorator(new Item02());
		Gift item01Ribboned = new RedRibbonGiftDecorator(new Item02());
		Gift item02Wrapped = new GreenGiftWrapGiftDecorator(new Item02());
		System.out.println("Gift item01 with no decoration");
		item01.decorate();
		System.out.println("\nGift item01 wrapped");
		item01Wrapped.decorate();
		System.out.println("\nGift item02 Ribboned");
	    item02Ribboned.decorate();
	    System.out.println("\nGift item02 Wrapped");
	    item02Wrapped.decorate();
	    System.out.println("\nGift item02 Ribboned");
	    item02Wrapped.decorate();	
	}
}
