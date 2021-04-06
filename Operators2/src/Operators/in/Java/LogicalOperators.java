package Operators.in.Java;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical Operator &&, ||
		boolean a= true;
		boolean b= true;
		
		boolean c= a&&b;
		System.out.println(c);
		
		boolean d = a||b;
		System.out.println(d);
	// logical operators with integers
		
	int e= 5;
	int f= 7;
	
	boolean g= (e>f) && a; 
	System.out.println(g);
	
	boolean h = (e>=f) && ((f>=e) && a);
	System.out.println(h);
		
		
	}

}
