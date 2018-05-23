import java.util.Scanner;

public class StringToBinary {

	public static void main(String[] args) {
	
		System.out.println ("Please enter th phrase that you would like to be converted to Binary:");
		Scanner input = new Scanner (System.in);
		String statement = input.nextLine();
		
		
		byte[] bytes = statement.getBytes();
		StringBuilder binary = new StringBuilder();
		
		for (byte b : bytes) {
			int val  = b;
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(" ");
		}
		System.out.println(statement + " into binary is: " + binary);
	}

}
