/**
 * @author:Diego
 * 
 * Este_programa_pede_um_n�mero_simples_e_mostra_ele_na_tela.
 * 
 * */

package Java;

import java.util.Scanner;
public class PedeNumero {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro de 1 a 10: ");
		int i = numero.nextInt();
		System.out.println(String.format("O n�mero informado foi: %d.", i));
		numero.close();
	}

}
