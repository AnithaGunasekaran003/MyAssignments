package week1.day2;

public class LearnContinueStatements {

	public static void main(String[] args) {
		// print numbers from 1 to 10; but when u find number3 print in words and print rest of the words
		
		for(int i=1;i<=10;i++)
		{
			if(i==3)
			{
				System.out.println("Three");
				continue;
			}
			System.out.println(i);
		}
System.out.println("out of the loop");
	}

}
