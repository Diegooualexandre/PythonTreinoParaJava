/**
 * @author:Diego
 * 
 * Conversor_de_Metro_para_Cent�metro
 * 
 * */

package Java;

import java.util.Scanner;

public class ConverteMetroCm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----- CONVERSOR METRO PARA CENT�METRO -----");
		System.out.print("Digite o valor em metros: ");
		int metro = scan.nextInt();
		int cm = metro*100;
		
		System.out.println(String.format("Valor em Metros: %d m\nValor em Cent�metros: %d cm", metro,cm));
		scan.close();
	}

}
