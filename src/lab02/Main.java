package lab02;

public class Main {
	public static void main(String[] args) {
	 int a=10;
	 int b=5;
     Add add=new Add();
     MultiplyOperator mul =new Multiply();
     MultiplyOperator addAdapter =new AddAdapter(add);
     System.out.print("Multiplication of "+a+" and "+b+" using Multiply class:");
     System.out.println(mul.multiply(a,b));
     System.out.print("Multiplication of "+a+" and "+b+" using addAdapter class:");
     System.out.println(addAdapter.multiply(a,b));     
	}
}
