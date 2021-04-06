package Operators.in.Java;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// unary operators exp++, exp--,++exp, --exp, ~ (-num -1)
		int a=4;
		int b=7;
		int c=9;
		int d = 6;
		int f = 2;
			
			int p = a++;
		System.out.println(a);
		System.out.println(p);
		
		int q = b--;
		System.out.println(b);
		System.out.println(q);
		
		int r = ++c;
		System.out.println(c);
		System.out.println(r);
		
		int s = --d;
		System.out.println(d);
		System.out.println(s);
		
		int t = ~f;
		System.out.println(f);
		System.out.println(t);
	}

}
