import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class JavSok  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ServerSocket servidor = null;
		Socket soket = null;
		DataInputStream in;
		DataOutputStream out;
		
		
		final int PORTA = 5000;
		
		try {
			servidor = new ServerSocket(PORTA);
			System.out.println("Servidor iniciado");
			
			while (true) {//ciclo infinito
				soket = servidor.accept();
				
				in = new DataInputStream(soket.getInputStream());
				out = new DataOutputStream(soket.getOutputStream());
				
				String mensj = in.readUTF();
				System.out.println("pego msg client - "+mensj); //pega msg de cliente
				
				out.writeUTF("Oi sou o servidor"); //manda msg para cliente
				soket.close();
				System.out.println("Client desconect");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		


	}

}
