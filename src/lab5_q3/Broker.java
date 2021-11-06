package lab5_q3;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> orderList = new ArrayList<Order>(); 

<<<<<<< HEAD
	public void takeOrder(Order order){
	      orderList.add(order);		
	   }
	
	public void placeOrders(){
		for (Order order : orderList) {
			order.execute();
			}
		orderList.clear();
=======
	   public void takeOrder(Order order){
	      orderList.add(order);		
	   }

	   public void placeOrders(){
	   
	      for (Order order : orderList) {
	         order.execute();
	      }
	      orderList.clear();
>>>>>>> 080c44098ffc1665969f58c88ed502f416d92c75
	   }
}
