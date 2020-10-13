package DB연결;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class 웹서버 {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9000);
		while (true) {
			Socket socket = server.accept();
			System.out.println("클라이언트 연결됨.");
		}
		
	}

}
