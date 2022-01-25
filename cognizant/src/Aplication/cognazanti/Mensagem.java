package Aplication.cognazanti;

public class Mensagem {

	public static void MsgDoDia(int hora) {
		switch (hora) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 24:
			MensagemBomdia();
			break;
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			MensagemBoaTarde();
			break;

		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
			MensagemBoaNoite();
			break;
		default:
			System.out.println("Hora invalida");
			break;
		}
	}

	public static void MensagemBomdia() {
		System.out.println("Bom dia");
	}
	public static void MensagemBoaTarde() {
		System.out.println("Bom Tarde");
	}
	public static void MensagemBoaNoite() {
		System.out.println("Bom Noite");
	}
}
