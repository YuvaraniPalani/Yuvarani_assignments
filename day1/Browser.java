package Week2.day1;

public class Browser {
	public static void main(String[] args) {
		Browser myBrowser = new Browser();
		String browsername =myBrowser.launchBrowser("firefox");
		System.out.println(browsername);
		myBrowser.loadUrl();
	}

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
		
	}
public void loadUrl() {
	 System.out.println("Application url loaded successfully");  
}
}
