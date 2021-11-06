package lab5_q2;

public class StatePatternDemo {
	public static void main(String[] args) {
		Context context=new Context();
		
		IdleState idleState=new IdleState();
		idleState.doAction(context);
		System.out.println(context.getState().toString());
		System.out.println("");
		SelectionState selectionState=new SelectionState();
		selectionState.doAction(context);
		System.out.println(context.getState().toString());
		selectionState.getChips(context);
		System.out.println("Chips price:"+((SelectionState) context.getTotal()).getPriceChips()+"cents");		
		System.out.println("");
		selectionState.getChocolate(context);
		System.out.println("Chocolate price:"+((SelectionState) context.getTotal()).getPriceChocolate()+"cents");
		System.out.println("");
		System.out.println("Both Chips & Chocolate price:"+
		(((SelectionState) context.getTotal()).getPriceChocolate()+((SelectionState) context.getTotal()).getPriceChips())+
		"cents");
		System.out.println("");
		DispensedState dispensedState=new DispensedState();
		dispensedState.doAction(context);
		System.out.println(context.getState().toString());	
	}
}


