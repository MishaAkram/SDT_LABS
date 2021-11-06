package lab5_q2;

public class SelectionState implements State {
	public void doAction(Context context){
		System.out.println("Machine is in selection state");		
		context.setState(this);
	}
	public void getChips(Context context){
		System.out.println("you have selected chips");		
		context.setState(this);
	}
	public void getChocolate(Context context){
		System.out.println("you have selected chocolate");		
		context.setState(this);
	}
	public String toString() {
		return "Selection State";
	}
	public int getPriceChocolate() {
		return 10;
	}
	public int getPriceChips() {
		return 20;
	}
}

