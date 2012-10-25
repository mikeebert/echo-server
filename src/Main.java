public class Main {

	public static void main(String[] args) {
		try {
			EchoServer server = new EchoServer();
			server.run();
		}
		catch (Exception e) {
			System.out.println("Can't execute run");
		}
	}
}
