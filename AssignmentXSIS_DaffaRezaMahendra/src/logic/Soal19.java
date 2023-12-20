package logic;

import java.util.Scanner;

public class Soal19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan kalimat yang ingin Anda periksa:");
		String kalimat = scanner.nextLine();

		boolean isPangram = checkPangram(kalimat);

		System.out.println("Kalimat tersebut adalah pangram: " + isPangram);

		scanner.close();

	}

	public static boolean checkPangram(String kalimat) {
		String lowerCase = kalimat.toLowerCase().replaceAll("[^a-z]", "");
		boolean[] isExist = new boolean[26];

		for (int i = 0; i < lowerCase.length(); i++) {
			int index = lowerCase.charAt(i) - 'a';
			isExist[index] = true;
		}

		for (boolean exists : isExist) {
			if (!exists) {
				return false;
			}
		}
		return true;
	}

}
