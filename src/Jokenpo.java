import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("___Jokenpo____");
		System.out.println("1. pedra");
		System.out.println("2. papel");
		System.out.println("3. tesoura");
		System.out.println("Digite sua opção: ");

		jogador = teclado.nextInt();
		System.out.println("");

		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

		computador = (int) (Math.random() * 3 + 1);
		teclado.close();
		switch (computador) {
		case 1:
			System.out.println("computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("computador escolheu TESOURA");
			break;
		}
		System.out.println("");
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("JOGADOR GANHOU!");
			} else {
				System.out.println("COMPUTADOR GANHOU!");
			}
		}
	}
}