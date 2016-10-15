package ua.nure.rybtsov.Practice1;

public class Excel {
	
	public static void main(String[] args) {		
		int number;
		String letters;
		try {
			number = Integer.parseInt(args[0]);			
			letters = args[1].toUpperCase();
			System.out.println("Letter value of " + number + " is " + digits2chars(number) + "; Next coloumn is " + rightColumn(digits2chars(number)));						
			System.out.println("Numeric value of " + letters + " is " + chars2digits(letters) + "; Next coloumn is " + rightColumn(letters));
		} 
		catch (NumberFormatException e) {System.out.println("not a number");}		
		catch (ArrayIndexOutOfBoundsException e) {System.out.println("not enough parameters");}							
	}
	
	public static int chars2digits(String letters) {		
		int digit = 0;		
		char[] array = letters.toCharArray();		
		for (int i=0; i<array.length; i++) {			
			digit += ((Character.getNumericValue(array[array.length-1-i])-9)*Math.pow(26, i));			
		}
		return digit;
	}	
	
	public static String digits2chars(int number) {		
		StringBuffer s = new StringBuffer(); 
		int digit = number;
		int rest;
		while (digit != 0) {
			rest = --digit%26;
			digit /= 26;			
			s.append(Character.toString((char) (rest+65)));
		} 
		return s.reverse().toString();
	}
	
	public static String rightColumn(String number) {
		int digit = chars2digits(number);
		return digits2chars(++digit);
	}
}