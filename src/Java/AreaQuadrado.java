/**
 * @author:Diego
 * 
 * Programa_que_calcula_a_area_do_quadrado_e_mostra_o_dobro_da_area
 * */

package Java;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--- PROGRAMA AREA DO QUADRADO E DOBRO ---\n");
		System.out.println("Digite o lado(em centímetros): ");
		float lado = scan.nextFloat();
		float area = lado*lado;
		System.out.println(String.format("Área Quadrado: %.2f cm \nÁrea Quadrado 2x: %.2f cm ", area, 2*area));
		scan.close();
	}

}
