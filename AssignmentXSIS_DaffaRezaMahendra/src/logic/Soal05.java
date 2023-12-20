package logic;

import java.util.Scanner;

public class Soal05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan jumlah bilangan Fibonacci yang ingin ditampilkan: ");
		int n = scanner.nextInt();

		System.out.println("Deret Fibonacci pertama " + n + " bilangan:");
		tampilkanFibonacci(n);

		scanner.close();
	}

	public static void tampilkanFibonacci(int n) {
		int angkaSebelumnya = 0;
		int angkaSekarang = 1;

		for (int i = 1; i <= n; ++i) {
			System.out.print(angkaSebelumnya + " ");

			int jumlah = angkaSebelumnya + angkaSekarang;
			angkaSebelumnya = angkaSekarang;
			angkaSekarang = jumlah;
		}
	}

}
