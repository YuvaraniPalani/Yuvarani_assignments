package Week3.day2;

public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		JavaConnection con = new JavaConnection();
		con.connect();
		con.disconnect();
		con.xecuteUpdate();

	}

	@Override
	public void connect() {
		System.out.println("connected");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnected");
	}

	@Override
	public void xecuteUpdate() {
		System.out.println("xecuteUpdated");
	}

}
