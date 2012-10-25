public class ClientMain {

	public static void main(String[] args) {
		try {
			EchoClient client = new EchoClient();
			client.run();
		}
		catch (Exception e) {
			System.out.println("Can't execute client run");
		}
	}
}
