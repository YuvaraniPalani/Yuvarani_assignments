package Week3.day1;

public class Chrome extends Browser {
//child class of browser for inheritance
	public static void main(String[] args) {
		Chrome Chromemethods= new Chrome();
        Chromemethods.openURL();
        Chromemethods.navigateBack();
        Chromemethods.closeBrowser();			
        Chrome.openIncognito();
		Chrome.clearCache();
	}
public static void openIncognito() {
	System.out.println("Open Incognito in Chrome ");
}
public static void clearCache() {
	System.out.println("Clear cathe in chrome");
}
}
