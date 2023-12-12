package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser obj2 = new Browser();
		String data = obj2.launchBrowser("IE");
		System.out.println(data);
		obj2.loadUrl();
	}
}
