package logic;

import java.util.Scanner;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan sebuah kata: ");
		String kata = scanner.nextLine();

		if (isPalindrome(kata)) {
			System.out.println(kata + " adalah palindrome.");
		} else {
			System.out.println(kata + " bukan palindrome.");
		}

		scanner.close();
	}

	public static boolean isPalindrome(String kata) {
		int panjang = kata.length();
		for (int i = 0; i < panjang / 2; i++) {
			if (kata.charAt(i) != kata.charAt(panjang - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
