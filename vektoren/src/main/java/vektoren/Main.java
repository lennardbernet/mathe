package vektoren;

import java.util.Scanner;

public class Main {
	
	private static Dreieck dreieck;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funktionen funktionen = new Funktionen();
		dreieck = new Dreieck();
		while (true) {

			System.out.println("Welche Funktion?");
			System.out.println("Funktion 1 Eingabe: Punkt A, Vektor AB\nFunktion 1 Ausgabe: Punkt B, Neigungswinkel, Länge");
			System.out.println("Funktion 2 Eingabe: Punkt A, Punkt B\nFunktion 2 Ausgabe: Vektor AB, Neigungswinkel, Länge");
			String inputString = scanner.nextLine();
			switch (inputString) {
			case "1":
				dreieck = funktionen.funktion1();
				System.out.println("Punkt B: " + dreieck.getEckeB().getX() + " " + dreieck.getEckeB().getY());
				System.out.println("Neigungswinkel: " + dreieck.getAlpha());
				System.out.println("Länge: " + dreieck.getSeiteC());
				break;
			case "2":
				dreieck = funktionen.funktion2();
				System.out.println("Vektor AB: "+dreieck.getSeiteB()+" "+dreieck.getSeiteA());
				System.out.println("Neigungswinkel: "+dreieck.getAlpha());
				System.out.println("Länge: "+dreieck.getSeiteC());
				break;
			default:
				System.out.println("Ungültige Eingabe");
				break;
			}
			

		}
	}

}
