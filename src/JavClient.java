import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class JavClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String HOST= "127.0.0.1";
		final int PORTA = 5000;
		
		DataInputStream in;
		DataOutputStream out;
		

		try {
			Socket soket = new Socket(HOST, PORTA);
			in = new DataInputStream(soket.getInputStream());
			out = new DataOutputStream(soket.getOutputStream());
			
			out.writeUTF("Oi sou o cliente"); //mando para servidor
			String mensj = in.readUTF(); //pego msg de servidor
			System.out.println("pego msg serv - "+mensj);
			
			soket.close();
			System.out.println("Termino conex cliente");
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		

	}

}
