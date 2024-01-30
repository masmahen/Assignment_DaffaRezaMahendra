package logic;

import java.util.Scanner;

public class Soal04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		int N = Integer.parseInt(scan.nextLine());
		int count = 0;
		int num = 2;
		while (count < N) {
			boolean prime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) { 
				if (num % i == 0) {
					prime = false;
				}

			}
			if (prime) {
				count++;
				System.out.println(num);
			}
			num++;
		}
		scan.close();

	}

}
