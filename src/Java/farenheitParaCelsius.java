/**
 * @author:Diego
 * 
 * Programa_que_converte_de_Farrenheit_para_Celsius
 * 
 * */

package Java;

import java.util.Scanner;

public class farenheitParaCelsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" --- CONVERSOR FARENHEIT P/CELSIUS ---");
		System.out.println("Digite tempertura em Farenheit: ");
		float f = scan.nextFloat();
		
		float c = (f-32) * 5/9;
		
		System.out.println(String.format("Temperatura em Farenheint: %.1f\nTemperatura em Celsius: %.1f", f,c));
		scan.close();
	}

}
