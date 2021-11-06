package lab5_q2;

public class DispensedState implements State  {
	public void doAction(Context context){
		System.out.println("Machine is in dispensed state");
		context.setState(this);	
	}
	public String toString() {
		return "Dispensed State";
	}
}

