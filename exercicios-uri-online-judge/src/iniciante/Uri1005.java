package iniciante;


import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double media, a, b;
		
		a = input.nextDouble();
		b = input.nextDouble();
		media = (a * 3.5 + b * 7.5) / 11.0;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		
		input.close();

	}

}
