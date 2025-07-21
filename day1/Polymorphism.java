package Week3.day1;

public class Polymorphism {
//	 method Overloading in Java.
	public static void main(String[] args) {
		Polymorphism p1 = new Polymorphism();
		p1.reportStep("reportstep1", "Status1");
		p1.reportStep("reportstep2","Status2",true);
	}

	public void reportStep(String msg, String status) {
		System.out.println(" Reportstep1 : " + msg + status);
	}

	public void reportStep(String msg, String status, Boolean snap) {
		System.out.println(" Reportstep2 : " + msg + status + snap);
	}
}
