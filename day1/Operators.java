package week1.day1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		System.out.println("Addition is : " + (a+b));
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>b && a<b);
		System.out.println(a>b || a<b);
		
		System.out.println("Increment : " + (a++));
		System.out.println("Increment : " + (++a)); //a=a+1 pre increment
		System.out.println("Increment : " + (a++)); //post increment
		
		System.out.println("Decrement : " + (--b)); //b=b-1
		System.out.println("Decrement : " + (b--));

	}

}
