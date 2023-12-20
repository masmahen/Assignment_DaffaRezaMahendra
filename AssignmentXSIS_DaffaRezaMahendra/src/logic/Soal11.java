package logic;

import java.util.Scanner;

public class Soal11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan kata: ");
		String kata = scanner.nextLine();

		tampilkanOutput(kata);

		scanner.close();

	}

	public static void tampilkanOutput(String kata) {
		for (int i = kata.length() - 1; i >= 0; i--) {
			for (int j = 0; j < kata.length(); j++) {
				if (j == i) {
					System.out.print(kata.charAt(j));
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
