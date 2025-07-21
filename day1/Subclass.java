package Week3.day1;

public class Subclass extends Superclass{
	//child class for method overriding
	public static void main(String[] args) {
		Subclass c1 = new Subclass();
		c1.reportStep();
		c1.takeSnap();
	}
	public void takeSnap () {
		System.out.println("subclass snap");
		
	}

}
