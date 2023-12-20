package logic;

import java.util.Scanner;

public class Soal12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        String input = scanner.nextLine();
        String[] strArray = input.split(" ");

        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }

        tampilkanUrutan(array);

        scanner.close();

	}
	
	public static void tampilkanUrutan(int[] array) {
        int min = cariMinimum(array);
        int max = cariMaximum(array);

        for (int i = min; i <= max; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    System.out.print(array[j] + " ");
                }
            }
        }
    }

    public static int cariMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int cariMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
