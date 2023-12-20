package logic;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        String formattedName = formatName(name);
        System.out.println("Output: " + formattedName);

        scanner.close();

	}

	public static String formatName(String name) {
		String[] words = name.split(" ");
		StringBuilder formattedName = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			formattedName.append(words[i].charAt(0)).append("***");
		}

		formattedName.append(words[words.length - 1].charAt(0));

		return formattedName.toString();
	}
}
