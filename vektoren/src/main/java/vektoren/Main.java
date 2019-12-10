package vektoren;

import java.awt.Point;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funktionen funktionen = new Funktionen();
		

		System.out.println("Welche Funktion?");
		String inputString = scanner.nextLine();
		if (inputString.equals("1")) {
			funktionen.funktion1();
		}

	}

}
