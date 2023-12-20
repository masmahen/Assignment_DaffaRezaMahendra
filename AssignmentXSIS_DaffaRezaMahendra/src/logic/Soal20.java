package logic;

import java.util.Scanner;

public class Soal20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan jarak awal antara A dan B:");
		int jarakAwal = scanner.nextInt();
		scanner.nextLine(); // Membersihkan buffer

		System.out.println("Masukkan urutan suit yang dilakukan oleh A (Gunting/Kertas/Batu):");
		String suitA = scanner.nextLine().toUpperCase();

		System.out.println("Masukkan urutan suit yang dilakukan oleh B (Gunting/Kertas/Batu):");
		String suitB = scanner.nextLine().toUpperCase();

		String winner = determineWinner(jarakAwal, suitA, suitB);
		System.out.println("Pemenangnya adalah: " + winner);

		scanner.close();

	}

	public static String determineWinner(int jarakAwal, String suitA, String suitB) {
		int jarak = jarakAwal;

		for (int i = 0; i < suitA.length(); i++) {
			if (jarak <= 0) {
				return "A";
			} else if (jarak >= 4) {
				return "B";
			}

			char moveA = suitA.charAt(i);
			char moveB = suitB.charAt(i);

			if (moveA == 'G' && moveB == 'K' || moveA == 'K' && moveB == 'B' || moveA == 'B' && moveB == 'G') {
				jarak -= 1;
			} else if (moveA == 'K' && moveB == 'G' || moveA == 'B' && moveB == 'K' || moveA == 'G' && moveB == 'B') {
				jarak += 2;
			}
		}

		if (jarak == 0) {
			return "Draw";
		} else if (jarak < 0) {
			return "A";
		} else {
			return "B";
		}
	}

}
