package Week3.day2;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		Amazon az = new Amazon();
		az.cashOnDelivery();
		az.cardPayments();
		az.internetBanking();
		az.upiPayments();
		az.recordPaymentDetails();
	}

    @Override
	public void cashOnDelivery() {
		
		System.out.println("payment Mode is cod");
	}

    @Override
	public void upiPayments() {
		
    	System.out.println("payment Mode is  upiPayments");
	}

    @Override
	public void cardPayments() {
		
    	System.out.println("payment Mode is cardPayments");
	}

    @Override
	public void internetBanking() {
    	
    	System.out.println("payment Mode is internetBanking");
		
	}
}
