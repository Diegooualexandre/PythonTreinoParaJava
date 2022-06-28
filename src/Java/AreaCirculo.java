/**
 * @author:Diego
 * 
 * Programa_que_calcula_a_area_do_círculo.
 * */

package Java;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--- CALCULO DA AREA DO CIRCULO ---\n");
		System.out.println("Digite o raio do círculo(em centímetros): ");
		double raio = scan.nextFloat();
		double area = 3.14 * (raio*raio);
		
		System.out.println(String.format("Área do círculo: %.2f cm", area));
		scan.close();
	}

}
