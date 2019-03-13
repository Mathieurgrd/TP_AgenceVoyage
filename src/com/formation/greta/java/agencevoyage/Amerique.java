package com.formation.greta.java.agencevoyage;

import java.util.Scanner;

public class Amerique {

	public static void affichCanada(int pxHtel, int pxAvion) {

		Scanner sc = new Scanner(System.in);
		float reduc = 20;
		int dureeVoy = sc.nextInt();
		int[] tab = new int[] { 5, 11, 13, 22 };

		if (dureeVoy < 0) {
			System.err.print("Non tu n'auras pas d'argent !");
			sc.close();
			return;

		} else if (dureeVoy >= 150) {
			System.err.print("Non c'est trop long !");
			sc.close();
			return;

		} else if (dureeVoy >= 75) {
			System.err.print("Attention ! \n");
			sc.close();

		}

		switch (dureeVoy / 7) {

		case (0):
			break;

		case (1):
			System.out.print("Félicitation tu à gagné du sirop d'érable ! \n");
			break;

		case (2):
			System.out.print("Félicitation tu à gagné une balade en moto-neige !\n");
			break;

		case (3):
			System.out.print("Félicitation tu à gagné un match des maple leaf ?\n");
			break;
		case (4):
			System.out.print("Félicitation tu à gagné un truc que je n'arrive pas à lire au tableau \n");
			break;

		default:
			System.out.print("Félicitation tu à gagné un autre truc que je n'arrive pas à lire au tableau \n");

		}

		int total = calculerTotal(dureeVoy, pxHtel, pxAvion, reduc);

		boolean b = total > 1000 ? true : false;

		String strTotal = String.format("Le prix du voyage est de %d", total);

		if (b) {

			System.out.println(strTotal + "\nC'est cher quand même");

		} else

			System.out.println(strTotal);

		for (int i = 1; i <= dureeVoy; i++) {

			String programmeVoyage = String.format("Jour %s", i);

			if (i == 1 || i == dureeVoy) {

				programmeVoyage = programmeVoyage + ": Avion";

			} else if (i % 5 == 1) {

				programmeVoyage = programmeVoyage + ": Repos culinaire ";

			} else {

				programmeVoyage = programmeVoyage + ": Ski ";
			}

			for (int k : tab) {

				if (i == k) {

					programmeVoyage = programmeVoyage + "et SPECTACLE !" + "";
				}
			}

			System.out.println(programmeVoyage);

		}

		sc.close();

	}

	public static int calculerTotal(int dureeVoy, int pxHtel, int pxAvion, float reduc) {

		return (int) (calculerTotal(dureeVoy, pxHtel, pxAvion) * (1 - reduc / 100));
	}

	public static int calculerTotal(int dureeVoy, int pxHtel, int pxAvion) {

		return pxAvion + pxHtel * dureeVoy;
	}

	public void affichBresil() {

		System.out.println("BRASSSSIIIIIIIIIIIIIIIL");
		System.out.println(fact(6));
	}

	public static int fact(int n) {
		if (n == 1) {
			return 0;
		} else {
			return n * fact(n - 1);
		}
	}
}
