package iniciante;


import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int numero, horas;
		double valorHora, salario;
		
		numero = input.nextInt();
		horas = input.nextInt();
		valorHora = input.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		input.close();

	}

}
