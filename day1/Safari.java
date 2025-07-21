package Week3.day1;

public class Safari extends Browser{
//child class of browser for inheritance
	public static void main(String[] args) {
        Safari Safarimethods = new Safari();		
        Safarimethods.openURL();
        Safarimethods.navigateBack();
        Safarimethods.closeBrowser();
        Safarimethods.readerMode();
        Safarimethods.fullScreenMode();
			
	}
	
	public  void readerMode() {
		System.out.println("Reader mode in Safari ");
	}
	public  void  fullScreenMode() {
		System.out.println("FullScreenMode in safari");
	}

}
