package Week3.day1;

public class Superclass {
//parent class for method overriding
	public static void main(String[] args) {
		Superclass s1= new Superclass();
		s1.takeSnap();
		s1.reportStep();
	}

	public void takeSnap() {
		System.out.println("superclass snap");
	}

	public void reportStep() {
		System.out.println("reportstep from superclass");

	}
}
