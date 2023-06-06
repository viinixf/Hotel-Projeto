package exerciciopensionato;

import java.util.Scanner;

public class mini_projeto_hotel {
	public static void main(String[] args) {
		Pessoa[] vetorPensionato = new Pessoa[10];
		int numeroQuarto = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos quartos serão ocupados? ");
		int numeroDeQuartosOcupados = sc.nextInt();

		for (int i = 0; i < numeroDeQuartosOcupados; i++) {
			int aux = i + 1;
			System.out.println("Digite o nome da " + aux + "° pessoa: ");
			String nome = sc.next();
			System.out.println("Digite o E-mail da " + aux + "° pessoa: ");
			String email = sc.next();
			boolean rpt = true;
			while (rpt) {
				System.out.println("Digite o n° do quarto da " + aux + "° pessoa: ");
				numeroQuarto = sc.nextInt();
				if (numeroQuarto > 0 && numeroQuarto < 9) {
					if (vetorPensionato[numeroQuarto] != null) {
						System.out.println("Quarto já está ocupado! Escolha outro");
						for (int j = 0; j < vetorPensionato.length; j++) {
							if (vetorPensionato[j] == null) {
								System.out.println("Quarto " + j + " está liberado");
							}
						}
						continue;
					}
					break;
				} else {
					System.out.println("O quarto não existe! Deve ser de 0 a 9.");
					continue;
				}

			}
			vetorPensionato[numeroQuarto] = new Pessoa(nome, email, numeroQuarto);
			System.out.println("----------------------------------");
		}
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < vetorPensionato.length; i++) {
			if (vetorPensionato[i] != null) {
				System.out.println(vetorPensionato[i]);
			}
		}
	}
}
