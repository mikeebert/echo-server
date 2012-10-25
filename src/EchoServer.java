import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private BufferedReader in;
	private PrintWriter out;

	public void run() throws Exception {
		int port = 4444;
		ServerSocket serverSocket = new ServerSocket(port);
		System.out.println("Started server on port" + port);

		while (true) {
			Socket clientSocket = serverSocket.accept();
			System.out.println("Accepted connection");

			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);

			String s;

			while ((s = in.readLine()) != null) {
				out.println(s);
			}

			System.err.println("Closing connection");
			out.close();
			in.close();
			clientSocket.close();
		}
	}
}
