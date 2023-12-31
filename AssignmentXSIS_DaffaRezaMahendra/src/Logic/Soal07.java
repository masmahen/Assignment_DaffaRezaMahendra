package logic;

import java.util.*;

public class Soal07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan deret angka (pisahkan dengan spasi):");
		String input = scanner.nextLine();
		String[] strDeretAngka = input.split(" ");

		int[] deretAngka = new int[strDeretAngka.length];
		for (int i = 0; i < strDeretAngka.length; i++) {
			deretAngka[i] = Integer.parseInt(strDeretAngka[i]);
		}

		System.out.println("Mean: " + hitungMean(deretAngka));
		System.out.println("Median: " + hitungMedian(deretAngka));
		System.out.println("Modus: " + hitungModus(deretAngka));

		scanner.close();
	}

	public static double hitungMean(int[] deretAngka) {
		int sum = 0;
		for (int angka : deretAngka) {
			sum += angka;
		}
		return (double) sum / deretAngka.length;
	}

	public static double hitungMedian(int[] deretAngka) {
		Arrays.sort(deretAngka);
		int panjang = deretAngka.length;
		if (panjang % 2 == 0) {
			return (double) (deretAngka[panjang / 2 - 1] + deretAngka[panjang / 2]) / 2;
		} else {
			return deretAngka[panjang / 2];
		}
	}

	public static int hitungModus(int[] deretAngka) {
		Map<Integer, Integer> frekuensi = new HashMap<>();
		int maxFrekuensi = 0;
		int modus = 0;

		for (int angka : deretAngka) {
			int count = frekuensi.getOrDefault(angka, 0) + 1;
			frekuensi.put(angka, count);

			if (count > maxFrekuensi) {
				maxFrekuensi = count;
				modus = angka;
			} else if (count == maxFrekuensi && angka < modus) {
				modus = angka;
			}
		}

		return modus;
	}

}
