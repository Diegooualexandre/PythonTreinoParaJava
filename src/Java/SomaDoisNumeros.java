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
		System.out.println("----- SOMA DE DOIS NÚMEROS -----");
		Scanner scan = new Scanner(System.in);
		System.out.println("DIGITE 1º NÚMERO:  ");
		int a = scan.nextInt();
		System.out.println("DIGITE 2º NÚMERO:  ");
		int b = scan.nextInt();
		int soma = a + b;
		
		System.out.println(String.format("A soma de %d + %d = %d", a,b,soma));
	
		scan.close();
	}

}
