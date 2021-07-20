package lab2_q2;
class RectangleAdapter implements Square {
	Rectangle rect;
	public RectangleAdapter(Rectangle rect) {
		this.rect=rect;		
	}
	public int setSide(int a) {
		rect.setLength(a);
		rect.setWidth(a);
		return a;
	}
	public void printAreaOfSquare(int a) {
		rect.printAreaOfRectangle(a, a);
		
	}
}
