package Java;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--- PROGRAMA DOIS INTEIROS E UM REAL ---\n"
				+ "[A] - Produto do dobro do primeiro com metade do segundo\n"
				+ "[B] - A soma do triplo do primeiro com o terceiro\n"
				+ "[C] - Terceiro elevado ao Cubo\n");
		System.out.println("Digite primeiro número (Somente números inteiros): ");
		int a = scan.nextInt();
		System.out.println("Digite segundo número (Somente números inteiros): ");
		int b = scan.nextInt();
		System.out.println("Digite terceiroo número (Somente números reais): ");
		double c = scan.nextFloat();
		
		double d = (float)a*2 + (float)b;
		double e = (float)a*3 + c;
		
		System.out.println(String.format("[A] - %.2f", d));
		System.out.println(String.format("[B] - %.2f", e));
		System.out.println(String.format("[C] - %.2f", c*c*c));
		scan.close();
	}

}
