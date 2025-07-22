package Week3.day2;

public class JavaConnection1 extends MySqlConnection{

	public static void main(String[] args) {
		JavaConnection1 con = new JavaConnection1();
		con.connect();
		con.disconnect();
		con.xecuteUpdate();

	}

	@Override
	public void connect() {
		System.out.println("connected for Demonstrating Abstraction");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnected for Demonstrating Abstraction ");
	}

	@Override
	public void xecuteUpdate() {
		System.out.println("xecuteUpdated for Demonstrating Abstraction");
	}

}


