package vektoren;

import java.awt.Point;
import java.util.Scanner;

public class Funktionen {

	private Scanner scanner;
	private Dreieck dreieck;

	public Funktionen() {
		scanner = new Scanner(System.in);
		dreieck = new Dreieck();
	}

	public Dreieck funktion1() {
		int punkt1;
		int punkt2;
		Point point = new Point();
		System.out.println("Gib den Punkt A ein. Syntax: 1/2");
		String inputString = scanner.nextLine();

		// Ecke A
		punkt1 = Integer.parseInt(inputString.substring(0, 1));
		punkt2 = Integer.parseInt(inputString.substring(2, 3));
		dreieck.setEckeA(new Point(punkt1,punkt2));
		dreieck.getEckeA().getY();
		System.out.println("Gib den Vektor AB ein");
		inputString = scanner.nextLine();

		// Ecke B
		punkt1 = Integer.parseInt(inputString.substring(0, 1));
		punkt2 = Integer.parseInt(inputString.substring(2, 3));
		point.setLocation(punkt1 + dreieck.getEckeA().getX(), punkt2 + dreieck.getEckeA().getY());
		dreieck.setEckeB(point);

		// Ecke C
		point.setLocation(punkt1 + dreieck.getEckeA().getX(), dreieck.getEckeA().getY());
		dreieck.setEckeC(point);

		// ankathete
		dreieck.setSeiteB(dreieck.getEckeC().getX() - dreieck.getEckeA().getX());

		// gegenkathete
		dreieck.setSeiteA(dreieck.getEckeB().getY() - dreieck.getEckeC().getY());

		// hypotenuse
		double hypotenuse = Math.sqrt(Math.pow(dreieck.getSeiteA(), 2) + Math.pow(dreieck.getSeiteB(), 2));
		dreieck.setSeiteC(hypotenuse);

		// neigungswinkel ausrechnen (winkel alpha)
		double alpha;
		double tanAlpha = dreieck.getSeiteA() / dreieck.getSeiteB();
		System.out.println(tanAlpha);
		alpha = 180/Math.PI * tanAlpha;
		dreieck.setAlpha(alpha);

		System.out.println(dreieck.getEckeA().getX() + " " + dreieck.getEckeA().getY());
		System.out.println(dreieck.getEckeB().getX() + " " + dreieck.getEckeB().getY());
		System.out.println(dreieck.getEckeC().getX() + " " + dreieck.getEckeC().getY());
		System.out.println(alpha);
		return null;
	}

}
