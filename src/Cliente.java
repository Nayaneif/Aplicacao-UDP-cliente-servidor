import java.io.*;
import java.net.*;

public class Cliente {
	public static void main(String args[]) {
		DatagramSocket sock = null;
		int port = 7111;
		String s;

		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));

		try {
			sock = new DatagramSocket();

			InetAddress host = InetAddress.getByName("localhost");

			while (true) { //Enquanto comunica��o estiver ativa
				
				echo("Entre com o numero da questao,numero de alternativas e resposta");
				s = (String) cin.readLine();//Dados de entrada
				byte[] b = s.getBytes();//Dados s�o colocados no char byte

				DatagramPacket dp = new DatagramPacket(b, b.length, host, port);
				sock.send(dp);//Dados s�o enviados ao servidor

				//.::BUFFER RECEBE DADOS DO SERVIDOR
				byte[] buffer = new byte[65536];
				DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
				sock.receive(reply);

				byte[] data = reply.getData();
				s = new String(data, 0, reply.getLength());

				echo(".::Resposta::.\n" + s);
			}
		}
		// .::TRATAMENTO DA EXCE��O
		catch (IOException e) {
			System.err.println("IOException " + e);
		}
	}

	//.::FUN��O PARA MOSTRAR INFORMA��ES NO TERMINAL
	public static void echo(String msg) {
		System.out.println(msg);
	}
}
