package week1.day2;

import org.apache.poi.util.SystemOutLogger;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Below are the odd numbers from 1 to 10 : ");
		for(int i=1;i<=10;i++)
		{
			//System.out.println("Below are the odd numbers from 1 to 10 : ");
			if(i%2==1)
			{
				
				System.out.println(i);
			}
		}
		System.out.println("above are the odd numbers");
	}

}
