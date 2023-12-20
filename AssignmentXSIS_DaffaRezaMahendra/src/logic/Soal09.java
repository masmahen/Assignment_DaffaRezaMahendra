package logic;

import java.util.Scanner;

public class Soal09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        tampilkanDeret(n);

        scanner.close();
		
	}
	
	public static void tampilkanDeret(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * n + " ");
        }
        System.out.println();
    }

}
