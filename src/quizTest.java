

import java.util.InputMismatchException;
import java.util.Scanner;

public class quizTest {

	public static void ispisiMeni() {
		System.out.println("1.Sabiranje ");
		System.out.println("2.Oduzimanje");
		System.out.println("3.Mnozenje");
		System.out.println("4.Djeljenje");
		System.out.println("5.Kvadriranje");
		System.out.println("6.Korjenjovanje");
		System.out.println("0.Izlaz");
	}

	public static Scanner unos() {
		Scanner unos = new Scanner(System.in);
		return unos;
	}

	public static int inputMeniInt() {
		int a = 0;
		Scanner unos = unos();
		try {
			System.out.println("Unesite jednu od opcija:");
			a = unos.nextInt();
		} catch (InputMismatchException e) {
			inputMeniInt();
		}
		return a;
	}

	public static int inputAnswerInt() {
		int a = 0;
		Scanner unos = unos();
		try {
			System.out.println("Unesite odgovor:");
			a = unos.nextInt();
		} catch (InputMismatchException e) {
			inputAnswerInt();
		}
		return a;
	}

	public static double inputAnswerDouble() {
		double a = 0;
		Scanner unos = unos();
		try {
			System.out.println("Unesite odgovor:");
			a = unos.nextDouble();
		} catch (InputMismatchException e) {
			inputAnswerDouble();
		}
		return a;
	}

	public static void main(String[] args) {

		quiz test = new quiz();
		ispisiMeni();
		int trigger = -1;
		int odgovor;
		double odgovor1;
		while (trigger != 0) {

			trigger = inputMeniInt();

			switch (trigger) {

			case 1:
				test.generateElements();
				System.out.println("Koliko je: " + test.getA() + "+" + test.getB());
				odgovor = inputAnswerInt();

				if (odgovor == test.saberiElemente()) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Odgovora nije tacan");
				}
				ispisiMeni();
				break;
			case 2:
				test.generateElements();

				System.out.println("Koliko je: " + test.getA() + "-" + test.getB());
				odgovor = inputAnswerInt();

				if (odgovor == test.oduzmiElemente()) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Odgovora nije tacan");
				}
				ispisiMeni();
				break;
			case 3:
				test.generateElements();

				System.out.println("Koliko je: " + test.getA() + "*" + test.getB());
				odgovor = inputAnswerInt();

				if (odgovor == test.pomnoziElemente()) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Odgovora nije tacan");
				}
				ispisiMeni();

				break;
			case 4:
				test.generateElements();

				System.out.println("Koliko je: " + test.getA() + "/" + test.getB());
				odgovor1 = inputAnswerDouble();

				if (odgovor1 == test.podjeliElemente()) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Odgovora nije tacan");
				}
				ispisiMeni();
				break;
			case 5:
				test.generateElements();

				System.out.println("Koliko je: " + test.getA() + " na kvadrat");
				odgovor = inputAnswerInt();

				if (odgovor == test.kvadrirajElement()) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Odgovora nije tacan");
				}
				ispisiMeni();
				break;
			case 6:
				test.generateElements();

				System.out.println("Koliko je korijen od: " + test.getA());
				odgovor1 = inputAnswerDouble();

				if (odgovor1 == test.korjenujElement()) {
					System.out.println("Tacan odgovor");
				} else {
					System.out.println("Odgovora nije tacan");
				}
				ispisiMeni();
				break;

			}
		}
	}
}