/**
 * @author:Diego
 * 
 * Programa_que_converte_de_Celsius_para_farenheint
 * */

package Java;

import java.util.Scanner;

public class celsiusParaFarenheint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--- CONVERSOR CELSIUS - FARENHEINT --- ");
		System.out.println("Digite valor em Celsius(ºC): ");
		double c = scan.nextFloat();
		double converter = c*1.8 + 32;
		
		System.out.println(String.format("Temperatura Celsius: %.2f\nTemperatura Farenheint: %.2f", c,converter));
		scan.close();
	}

}
