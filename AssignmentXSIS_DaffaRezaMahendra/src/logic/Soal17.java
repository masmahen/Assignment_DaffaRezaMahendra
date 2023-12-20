package logic;

import java.util.Scanner;

public class Soal17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan urutan langkah (Gunakan N untuk naik dan T untuk turun, pisahkan dengan spasi):");
		String langkah = scanner.nextLine();

		int jumlahGunung = hitungGunung(langkah);
		int jumlahLembah = hitungLembah(langkah);

		System.out.println("Jumlah Gunung: " + jumlahGunung);
		System.out.println("Jumlah Lembah: " + jumlahLembah);

		scanner.close();

	}

	public static int hitungGunung(String langkah) {
		int jumlahGunung = 0;
		int level = 0;

		String[] langkahArr = langkah.split(" ");

		for (String step : langkahArr) {
			if (step.equals("N")) {
				level++;
			} else if (step.equals("T")) {
				level--;
			}

			// Jika kembali ke level awal setelah naik dan turun
			if (level == 0 && step.equals("T")) {
				jumlahGunung++;
			}
		}

		return jumlahGunung;
	}

	public static int hitungLembah(String langkah) {
		int jumlahLembah = 0;
		int level = 0;

		String[] langkahArr = langkah.split(" ");

		for (String step : langkahArr) {
			if (step.equals("N")) {
				level++;
			} else if (step.equals("T")) {
				level--;
			}

			// Jika kembali ke level awal setelah turun dan naik
			if (level == 0 && step.equals("N")) {
				jumlahLembah++;
			}
		}

		return jumlahLembah;
	}

}
