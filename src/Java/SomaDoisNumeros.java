/**
 * @author:Diego
 * 
 * Programa_que_mostra_a_soma_de_dois_numeros_inteiros
 * 
 * */
package Java;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		System.out.println("----- SOMA DE DOIS N�MEROS -----");
		Scanner scan = new Scanner(System.in);
		System.out.println("DIGITE 1� N�MERO:  ");
		int a = scan.nextInt();
		System.out.println("DIGITE 2� N�MERO:  ");
		int b = scan.nextInt();
		int soma = a + b;
		
		System.out.println(String.format("A soma de %d + %d = %d", a,b,soma));
	
		scan.close();
	}

}
