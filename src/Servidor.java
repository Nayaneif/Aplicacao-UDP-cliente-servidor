import java.io.*;
import java.net.*;
import java.util.Arrays;

public class Servidor {
	
	// .::DECLARAÇÃO DE VARIÁVEIS::.
	public static void main(String args[]) {
		DatagramSocket sock = null;
		int acertos = 0;
		int erros = 0;
		int a_1 = 0;
		int e_1 = 0;
		int a_2 = 0;
		int e_2 = 0;
		int a_3 = 0;
		int e_3 = 0;
		int a_4 = 0;
		int e_4 = 0;
		int a_5 = 0;
		int e_5 = 0;
		int a_6 = 0;
		int e_6 = 0;
		int a_7 = 0;
		int e_7 = 0;
		int a_8 = 0;
		int e_8 = 0;
		int a_9 = 0;
		int e_9 = 0;
		int a_10 = 0;
		int e_10 = 0;
		
		// .::CHAMADA DAS FUNÇÕES::..
		try {
			
			// .::Criando um servidor socket,usando a porta 7777 como parâmetro::.
			sock = new DatagramSocket(7111);
			
			// .::Criação de buffer para receber dados::.
			byte[] buffer = new byte[65536];
			DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);

			// .::Aguardando entrada de dados::.
			echo("Socket servidor criado. Aguardando dados de entrada...");

			// .::Loop de comunicação::.
			while (true) { //Enquanto comunicação estiver ativa
				sock.receive(incoming);
				byte[] data = incoming.getData();
				String s = new String(data, 0, incoming.getLength());

				// Para verificação
				String array[] = s.split(";");

				String num_questao = array[0];
				String num_alternativas = array[1];
				String questoes = array[2];

				int primeiro = Integer.parseInt(num_questao);
				int segundo = Integer.parseInt(num_alternativas);
				char terceiro[] = questoes.toCharArray();

				//.::QUESTAO 1 RESPOSTA CERTA: VVVFV ::.
				if (primeiro == 1 && segundo == 5) {

					if (terceiro[0] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[4] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					a_1 += acertos;
					e_1 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" +".::Estatística::.\n"+ "Questão 1: " + "Acertos=" + a_1 + "Erros=" + e_1;
				}

				// QUESTAO 2 RESPOSTA CERTA: FFFV
				if (primeiro == 2 && segundo == 4) {
					if (terceiro[0] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					//.::RESPOSTA E ESTATÍSTICA DE ERROS E ACERTOS
					a_2 += acertos;
					e_2 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" + "Questão 1:" + "Acertos=" + a_2 + "Erros=" + e_2;
				}

				// QUESTAO 3 RESPOSTA CERTA: FFFFF
				if (primeiro == 3 && segundo == 5) {
					if (terceiro[0] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[4] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					//.::RESPOSTA E ESTATÍSTICA DE ERROS E ACERTOS
					a_3 += acertos;
					e_3 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" + "Questão 1:" + "Acertos=" + a_3 + "Erros=" + e_3;
				}

				// QUESTAO 4 RESPOSTA CERTA: VVVV
				if (primeiro == 4 && segundo == 4) {
					if (terceiro[0] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					
					//.::RESPOSTA E ESTATÍSTICA DE ERROS E ACERTOS
					a_4 += acertos;
					e_4 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" + "Questão 1:" + "Acertos=" + a_4 + "Erros=" + e_4;
				}

				// QUESTAO 5 RESPOSTA CERTA: VFVFV
				if (primeiro == 5 && segundo == 5) {
					if (terceiro[0] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[4] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					
					//.::RESPOSTA E ESTATÍSTICA DE ERROS E ACERTOS
					a_1 += acertos;
					e_1 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" +"Questão 1:" + "Acertos=" + a_5 + "Erros=" + e_5;
				}

				// QUESTAO 6 RESPOSTA CERTA: VVVF
				if (primeiro == 6 && segundo == 4) {
					if (terceiro[0] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					//.::RESPOSTA E ESTATÍSTICA DE ERROS E ACERTOS
					a_6 += acertos;
					e_6 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" + "Questão 1:" + "Acertos=" + a_6 + "Erros=" + e_6;
				}

				// QUESTAO 7 RESPOSTA CERTA: FFVVF
				if (primeiro == 7 && segundo == 5) {
					if (terceiro[0] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[4] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}

					a_7 += acertos;
					e_7 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" + "Questão 1:" + "Acertos=" + a_7 + "Erros=" + e_7;

				}

				// QUESTAO 8 RESPOSTA CERTA: VVFV
				if (primeiro == 8 && segundo == 4) {
					if (terceiro[0] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					//.::RESPOSTA E ESTATÍSTICA DE ERROS E ACERTOS
					a_8 += acertos;
					e_8 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" + "Questão 1:" + "Acertos=" + a_8 + "Erros=" + e_8;

				}

				// QUESTAO 9 RESPOSTA CERTA: VVVVV
				if (primeiro == 9 && segundo == 5) {
					if (terceiro[0] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[4] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					//.::RESPOSTA E ESTATÍSTICA DE ERROS E ACERTOS
					a_9 += acertos;
					e_9 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" + "Questão 1:" + "Acertos=" + a_9 + "Erros=" + e_9;
				}

				// QUESTAO 10 RESPOSTA CERTA: FFFV
				if (primeiro == 10 && segundo == 4) {
					if (terceiro[0] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[1] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}
					if (terceiro[2] == 'F') {
						acertos += 1;
					} else {
						erros += 1;
					}

					if (terceiro[3] == 'V') {
						acertos += 1;
					} else {
						erros += 1;
					}
					//.::RESPOSTA E ESTATÍSTICA DE ERROS E ACERTOS
					a_10 += acertos;
					e_10 += erros;
					s = primeiro + ";" + acertos + ";" + erros + "\n" + "Questão 1:" + "Acertos=" + a_10 + "Erros=" + e_10;
				}

				acertos = 0;
				erros = 0;

				//.::RESPOSTA AO DATAGRAMA É ENVIADA
				DatagramPacket dp = new DatagramPacket(s.getBytes(), s.getBytes().length, incoming.getAddress(),
						incoming.getPort());
				sock.send(dp);

			}
		} 
		
		// .::TRATAMENTO DA EXCEÇÃO
			catch (IOException e) {//Caso ocorra alguma exceção de entrada ou saída,mostra qual foi
			System.err.println("IOException " + e);
		}
	}

	//.::FUNÇÃO PARA MOSTRAR INFORMAÇÕES NO TERMINAL
	public static void echo(String msg) {
		System.out.println(msg);  //Cria uma linha visual para resposta
	}
}