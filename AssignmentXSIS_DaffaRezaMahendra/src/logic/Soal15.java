package logic;

import java.util.Scanner;

public class Soal15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan waktu dalam format 12 jam (hh:mm:ss a): ");
		String waktu12Jam = scanner.nextLine();

		String waktu24Jam = konversiFormatWaktu(waktu12Jam);
		System.out.println("Waktu dalam format 24 jam: " + waktu24Jam);

		scanner.close();

	}

	public static String konversiFormatWaktu(String waktu12Jam) {
		String[] waktuSplit = waktu12Jam.split(":");
		int jam = Integer.parseInt(waktuSplit[0]);
		int menit = Integer.parseInt(waktuSplit[1].substring(0, 2));
		String amPm = waktuSplit[1].substring(3);

		if (amPm.equalsIgnoreCase("PM")) {
			if (jam != 12) {
				jam += 12;
			}
		} else {
			if (jam == 12) {
				jam = 0;
			}
		}

		return String.format("%02d:%02d:%02d", jam, menit, Integer.parseInt(waktuSplit[2].substring(0, 2)));
	}

}
