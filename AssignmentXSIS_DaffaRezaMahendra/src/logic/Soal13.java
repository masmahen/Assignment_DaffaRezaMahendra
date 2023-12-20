package logic;

import java.util.Scanner;

public class Soal13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam: ");
        int jam = scanner.nextInt();
        System.out.print("Masukkan menit: ");
        int menit = scanner.nextInt();

        int sudut = hitungSudut(jam, menit);
        System.out.println("Sudut terkecil antara jarum jam: " + sudut + " derajat");

        scanner.close();

	}
	
	public static int hitungSudut(int jam, int menit) {
        // Menghitung posisi relatif jarum jam dan menit
        int posisiJarumJam = (jam % 12) * 30; // 30 derajat per jam
        int posisiJarumMenit = menit * 6; // 6 derajat per menit

        // Menghitung selisih sudut antara jarum jam dan jarum menit
        int selisihSudut = Math.abs(posisiJarumJam - posisiJarumMenit);

        // Mengambil sudut terkecil antara kedua jarum jam
        int sudutTerkecil = Math.min(selisihSudut, 360 - selisihSudut);

        return sudutTerkecil;
    }

}
