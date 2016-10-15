package ua.nure.rybtsov.Practice1;

//Написать класс, который реализует функциональность определения суммы цифры целого положительного числа, переданного в приложение как параметр командной строки.

public class SumOfDigits {

	public static void main(String[] args) {
		int a = 0, sum = 0;
		try {
			a = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException e) {
			System.out.println("not a number");
			return;
		}
		char[] array = Integer.toString(a).toCharArray();
		for (int i=0; i<array.length; i++) {
			sum += Character.getNumericValue(array[i]);
		}
		
		System.out.println("Sum of digits of " + a + " is " + sum);
	}
}
