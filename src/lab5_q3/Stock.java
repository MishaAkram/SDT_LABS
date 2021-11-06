package lab5_q3;

public class Stock {
	private String name = "Atlas Honda Ltd";
	private int quantity = 5;

	public void buy(){
		System.out.println("Stock Name: "+ name +", Quantity bought: " + quantity);
	   }
	public void sell(){
		System.out.println("Stock Name: "+ name +", Quantity sold: " + quantity);
	   }
}
