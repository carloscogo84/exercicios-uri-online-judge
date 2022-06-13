package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double area, pi=3.14159, r;
		
		r = input.nextDouble();
		
		area = pi * r * r;
		
		System.out.printf("A=%.4f%n", area);
		
		input.close();

	}

}
