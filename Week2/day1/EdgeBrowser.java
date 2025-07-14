package Week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser myBrowser= new Browser();
		String browsername =myBrowser.launchBrowser("firefox");
		System.out.println( browsername);
		myBrowser.loadUrl();
	}
	}


