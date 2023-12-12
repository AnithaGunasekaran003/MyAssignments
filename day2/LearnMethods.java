package week1.day2;

public class LearnMethods {
		
		void addTwoNumbers(int a, int b)
		{
			System.out.println(a+b);
		}
		int noofbicycle()
		{
			return 2;
		}
		
		String bicycleData(String brandname, String color)
		{
			return brandname + " " + color;
		}

	public static void main(String[] args) {
	
		LearnMethods obj1 = new LearnMethods();
		System.out.println(obj1.noofbicycle());
		obj1.addTwoNumbers(10, 5);
		
		String data = obj1.bicycleData("SWIFT", "Red");
		System.out.println(data);
	}

}
