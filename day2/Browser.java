package week1.day2;

public class Browser {

	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl()
	{
		System.out.println("Application URL loaded successfully");
	}

	public static void main(String[] args) {
		
		Browser obj1 = new Browser();
		String data = obj1.launchBrowser("Chrome");
		System.out.println(data);
		
		obj1.loadUrl();
		
	}
}
