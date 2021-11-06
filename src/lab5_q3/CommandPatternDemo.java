package lab5_q3;

public class CommandPatternDemo {
	public static void main(String[] args) {
<<<<<<< HEAD
		Stock abcStock = new Stock();

	    BuyStock buyStockOrder = new BuyStock(abcStock);
	    SellStock sellStockOrder = new SellStock(abcStock);

	    Broker broker = new Broker();
	    broker.takeOrder(buyStockOrder);
	    broker.takeOrder(sellStockOrder);

	    broker.placeOrders();
	   }
=======
	      Stock abcStock = new Stock();

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);

	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);

	      broker.placeOrders();
	   }

>>>>>>> 080c44098ffc1665969f58c88ed502f416d92c75
}
