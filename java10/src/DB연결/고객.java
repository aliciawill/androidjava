package DB연결;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class 고객 {

	public static void main(String[] args) throws Exception, IOException {
		Socket client = new Socket("localhost", 9000);
	}

}
