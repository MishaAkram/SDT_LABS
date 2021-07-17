package lab5_q2;

public class IdleState implements State {
	public void doAction(Context context){
		System.out.println("Machine is in idle state");
		context.setState(this);
		
	}
	public String toString() {
		return "Idle State";
	}

}
