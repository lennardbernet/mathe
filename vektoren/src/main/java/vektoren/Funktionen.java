package vektoren;

import java.util.Scanner;

public class Funktionen {

	private Scanner scanner;
	private Dreieck dreieck;
	private int punkt1;
	private int punkt2;

	public Funktionen() {
		scanner = new Scanner(System.in);
	}

	public Dreieck funktion1() {

		dreieck = new Dreieck();

		// Ecke A
		System.out.println("Gib den Punkt A ein. Syntax: 1/2");
		String inputString = scanner.nextLine();
		punkt1 = Integer.parseInt(inputString.substring(0, 1));
		punkt2 = Integer.parseInt(inputString.substring(2, 3));
		dreieck.setEckeA(new Point(punkt1, punkt2));

		// Ecke B
		System.out.println("Gib den Vektor AB ein. Syntax 2/2");
		inputString = scanner.nextLine();
		punkt1 = Integer.parseInt(inputString.substring(0, 1));
		punkt2 = Integer.parseInt(inputString.substring(2, 3));
		dreieck.setEckeB(new Point(punkt1 + dreieck.getEckeA().getX(), punkt2 + dreieck.getEckeA().getY()));

		// Ecke C
		dreieck.setEckeC(new Point(punkt1 + dreieck.getEckeA().getX(), dreieck.getEckeA().getY()));

		// Seite B
		dreieck.setSeiteB(dreieck.getEckeC().getX() - dreieck.getEckeA().getX());

		// Seite A
		dreieck.setSeiteA(dreieck.getEckeB().getY() - dreieck.getEckeC().getY());

		// Seite C
		double hypotenuse = Math.sqrt(Math.pow(dreieck.getSeiteA(), 2) + Math.pow(dreieck.getSeiteB(), 2));
		dreieck.setSeiteC(hypotenuse);

		// neigungswinkel ausrechnen (winkel alpha)
		double alpha;
		double tanAlpha = dreieck.getSeiteA() / dreieck.getSeiteB();
		alpha = 180 / Math.PI * Math.atan(tanAlpha);
		dreieck.setAlpha(alpha);
		return dreieck;
	}

	public Dreieck funktion2() {

		dreieck = new Dreieck();

		System.out.println(
				"Funktion 2:\nFunktion 1 Eingabe: Punkt A, Punkt B\nFunktion 1 Ausgabe: Vektor AB, Neigungswinkel, Länge");
		// Ecke A
		System.out.println("Gib den Punkt A ein. Syntax: 1/2");
		String inputString = scanner.nextLine();
		punkt1 = Integer.parseInt(inputString.substring(0, 1));
		punkt2 = Integer.parseInt(inputString.substring(2, 3));
		dreieck.setEckeA(new Point(punkt1, punkt2));
		System.out.println("Gib den Punkt B ein. Syntax 1/2");

		// Ecke B
		System.out.println("Gib den Punkt B ein. Syntax 1/2");
		inputString = scanner.nextLine();
		punkt1 = Integer.parseInt(inputString.substring(0, 1));
		punkt2 = Integer.parseInt(inputString.substring(2, 3));
		dreieck.setEckeB(new Point(punkt1, punkt2));

		// Ecke C
		dreieck.setEckeC(new Point(dreieck.getEckeB().getX() - dreieck.getEckeA().getX(),
				dreieck.getEckeB().getY() - dreieck.getEckeA().getY()));

		// Seite B
		dreieck.setSeiteB(dreieck.getEckeC().getX() - dreieck.getEckeA().getX());

		// Seite A
		dreieck.setSeiteA(dreieck.getEckeB().getY() - dreieck.getEckeC().getY());

		// Seite C
		dreieck.setSeiteC(Math.sqrt(Math.pow(dreieck.getSeiteA(), 2) + Math.pow(dreieck.getSeiteB(), 2)));

		// Neigungswinkel ausrechnen (winkel alpha)
		double alpha;
		double tanAlpha = dreieck.getSeiteA() / dreieck.getSeiteB();
		alpha = 180 / Math.PI * Math.atan(tanAlpha);
		dreieck.setAlpha(alpha);
		return dreieck;
	}

}
