package ua.nure.rybtsov.Practice1;

//Написать класс, который реализует функциональность сложения двух чисел, переданных в приложение как параметры командной строки.

public class Sum {
	public static void main(String[] args) {
		int a,b;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
		}
		catch (NumberFormatException e) {
			System.out.println("not a number");
			return;
		}
		System.out.format("Sum of %d and %d is %d%n", a, b, a+b);
	}
}
