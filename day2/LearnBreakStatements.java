package week1.day2;

public class LearnBreakStatements {

	public static void main(String[] args) {
		// print numbers from 1 to 10; but when u find number3 print in words and stop the iteration
		
		for(int i=1;i<=10;i++)
		{
			if(i==3)
			{
				System.out.println("Three");
				break;
			}
			System.out.println(i);
		}

	}

}
