package com.formation.greta.java.agencevoyage;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.formation.greta.java.agencevoyage.bonsoir.Destination;
import com.formation.greta.java.agencevoyage.bonsoir.DestinationMaritime;
import com.formation.greta.java.agencevoyage.bonsoir.Nommable;

public class Europe {

	public static void affichEspagne() {

		Destination espagneDest = new Destination("Espagne", "Andalousie", 15);
		Destination franceDest = new Destination(espagneDest);

		franceDest.setNbreJours(8);

		System.out.println(espagneDest.equals(franceDest));
//		System.out.println(espagneDest.equals(franceDest));
		System.out.println(espagneDest.toString());
		espagneDest.allongerSejour(45);
		System.out.println(franceDest.toString());

	}

	public static void affichItalie() {

		System.out.println("Mama mia");

		Destination destSar = new DestinationMaritime("Sardaigne", "Italie", "Italie du Sud ?!", 15);

		final Nommable d3;

		d3 = new DestinationMaritime(destSar);
		d3.setNom("Bonsoir");
		// System.out.println(d3.toString());

		System.out.println(destSar.toString());

	}

	public static void affichTurquie() {

		boolean isCompleted = false;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> etapeListe = new ArrayList<String>();
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		String str = "";
		int prix = 0;
		System.out.println("Entrez une étape de votre voyage : ");

		
		hMap.put("Ankara", 220);
		hMap.put("Gaziantep", 550);
		hMap.put("Bursa", 50);
		hMap.put("Antalya", 80);

		while (!isCompleted) {

			str = sc.nextLine();

			if (str.isEmpty() || str.equals("")) {

				System.err.print("LES ETAPES !!!!");

			} else if (str.contains("quit")) {

				isCompleted = true;
				System.err.println("RAGE QUIT");

			} else {

				if (hMap.containsKey(str)) {

					prix += hMap.get(str);
					str = str.concat(String.format("(Supplément de %d)", hMap.get(str)));
				}

				etapeListe.add(str);

				if (etapeListe.size() > 3) {
					System.out.print("Merki ! Voici les étapes : \n");

					etapeListe.stream().forEach(System.out::println);
					
					System.out.println(String.format("Le prix total des suppléments de ce voyage sera de %d", prix));

//					for (String etp : etapeListe) {
//						System.out.print(
//								String.format("Etape n°%d : %s", ((int) etapeListe.indexOf(etp) + 1), etp + " \n"));
//					}
					isCompleted = true;
					break;
				}

				System.out.println("Entrez l'étape n°" + ((int) etapeListe.size()));

			}

		}
		sc.close();

	}

	public static void affichRussie() {

		// TODO : If agentVoy -> gerer les espaces et les virer et put caps sur 1ere
		// lettre
		System.out.print("Privjet Rouski ! ");
		// Depart au mieux le dans 4 semaines et 5 jours
		JFrame theWindow = new JFrame();
		JPanel container = new JPanel(new BorderLayout());
		Container containPane = theWindow.getContentPane();
		containPane.setLayout(new FlowLayout());
		JTextArea text = new JTextArea();
		JScrollPane scroll = new JScrollPane(text); // place the JTextArea in a scroll pane

		Scanner sc = new Scanner(System.in);

		String lieuCli = sc.next().trim();
		String telCli = sc.next().trim();
		String nomCli = sc.next().trim();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");
		LocalDateTime dateJourney = LocalDateTime.now().plusWeeks(4).plusDays(5);
		String formattedDateTime = dateJourney.format(formatter); // "1986-04-08 12:30"

		text.setText(String.format(
				"Votre réservation à bien été pris en compte %s, vous partez à %s. Vous allez recevoir un texto au %s. Départ au mieux le %s"
						+ "",
				lieuCli.substring(0, 1).toUpperCase() + lieuCli.substring(1) + " ",
				nomCli.substring(0, 1).toUpperCase() + nomCli.substring(1) + " ",
				telCli.substring(0, 1).toUpperCase() + telCli.substring(1), formattedDateTime));

		System.out.println((String.format(
				"Votre réservation à bien été pris en compte %s, vous partez à %s. Vous allez recevoir un texto au %s. Départ au mieux le %s"
						+ "",
				lieuCli.substring(0, 1).toUpperCase() + lieuCli.substring(1) + " ",
				nomCli.substring(0, 1).toUpperCase() + nomCli.substring(1) + " ",
				telCli.substring(0, 1).toUpperCase() + telCli.substring(1), formattedDateTime)));

		container.add(scroll, BorderLayout.CENTER);
		theWindow.setContentPane(container);
		theWindow.setSize(600, 600);
		theWindow.setTitle("Fenêtre trop stylé");
		theWindow.setLocationRelativeTo(null);
		theWindow.setVisible(true);

		sc.close();

	}

}
