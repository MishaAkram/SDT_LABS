package lab5_q3;

public class BuyStock implements Order {
	private Stock abcStock;

<<<<<<< HEAD
	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
		}

	public void execute() {
		abcStock.buy();
		}
=======
	   public BuyStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.buy();
	   }
>>>>>>> 080c44098ffc1665969f58c88ed502f416d92c75
}
