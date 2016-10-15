package ua.nure.rybtsov.Practice1;

import java.util.Arrays;

public class Nod {

	public static void main(String[] args) {
		int a, b, nod = 1;

		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("not an integer");
			return;
		}

		if ((a == 0) || (b == 0)) {
			System.out.println("NOD doesn't exist");
			return;
		}

		else {
			int[] devA = deviders(a);
			int[] devB = deviders(b);
			for (int i = 0; i < devA.length; i++) {
				for (int j = 0; j < devB.length; j++) {
					if (devA[i] == devB[j]) {
						nod *= devA[i];
						devB[j] = 1;
						break;
					}
				}
			}
		}

		System.out.format("NOD of %d and %d is %d%n", a, b, nod);
	}

	private static int[] deviders(int x) {
		int number = Math.abs(x);
		int[] array = new int[0];
		for (int i = 2; i <= number;) {
			if (number % i == 0) {
				number /= i;
				array = Arrays.copyOf(array, array.length + 1);
				array[array.length - 1] = i;
			} else {
				i++;
			}
		}
		return array;
	}
}
