package lab02;

public class AddAdapter implements MultiplyOperator {
    AddOperator add;
    public AddAdapter (AddOperator add) {
    	this.add=add;
    }	    
	public int multiply(int a ,int b) {		
		int total=0;
		for (int inc = 0; inc < a; inc++) {
			  total = add.add(total, b);
			}       
       return total;
	}
}
