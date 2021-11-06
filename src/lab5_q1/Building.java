package lab5_q1;

public abstract class Building {
	abstract void foundation();
	abstract void pillars();
	abstract void walls();
	abstract void windows();
	
	//template method
	public final void build(){
	    foundation();
		pillars();
		walls();
		windows();
	}
}

