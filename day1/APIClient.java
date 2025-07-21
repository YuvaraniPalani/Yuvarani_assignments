package Week3.day1;

public class APIClient {
// Overloading in Java
	public static void main(String[] args) {
		APIClient client = new APIClient();
		client.sendRequest("Endpoint1");
		client.sendRequest("Endpoint2 ", "requestBody from send request", " was success.");

	}

	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, String requestStatus) {
		System.out.println(endpoint + requestBody + requestStatus);
	}

}
