package lab2_q2;
class Main {

	public static void main(String[] args) {
		Chessboard chessboard= new Chessboard();
		Tenniscourt tenniscourt= new Tenniscourt();
		
		Square rectangleAdapter = new RectangleAdapter(tenniscourt);
		
		System.out.println("Tenniscourt...");
		int a=tenniscourt.setLength(3);
		int b=tenniscourt.setWidth(4);
		tenniscourt.printAreaOfRectangle(a, b);
		
		System.out.println("Chessboard...");
		int c=chessboard.setSide(2);
		chessboard.printAreaOfSquare(c);
		
		System.out.println("RectangleAdapter...");
		rectangleAdapter.printAreaOfSquare(c);

	}

}
