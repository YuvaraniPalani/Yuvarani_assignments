package Week3.day1;

public class Edge extends Browser {
//child class of browser for inheritance
	public static void main(String[] args) {
		Edge Edgemethods = new Edge();
		Edgemethods.openURL();
		Edgemethods.navigateBack();
		Edgemethods.closeBrowser();
		Edgemethods.takeSnap();
		Edgemethods.clearCookies();
	}

	public void takeSnap() {
		System.out.println("Take snap in Edge");
	}
	public void clearCookies() {
		System.out.println("Clear Cookies in Edge");
	}
}
