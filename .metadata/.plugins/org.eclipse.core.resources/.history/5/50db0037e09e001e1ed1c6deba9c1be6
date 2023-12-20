package Logic;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kata1 = "katak";
		String kata2 = "12021";
		String kata3 = "malam";
		String kata4 = "contoh";

		// Memeriksa apakah kata-kata tersebut adalah palindrome
		System.out.println(kata1 + " adalah palindrome: " + isPalindrome(kata1));
		System.out.println(kata2 + " adalah palindrome: " + isPalindrome(kata2));
		System.out.println(kata3 + " adalah palindrome: " + isPalindrome(kata3));
		System.out.println(kata4 + " adalah palindrome: " + isPalindrome(kata4));

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
