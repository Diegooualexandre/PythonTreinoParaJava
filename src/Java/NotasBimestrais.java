/**
 * @author:Diego
 * 
 * Programa_que_mosstra_as_notas_bimestrais
 * 
 * */


package Java;
import java.util.Scanner;
public class NotasBimestrais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("----- MEDIA BIMESTRAL -----\n");
		System.out.print("DIGITE 1� NOTA: ");
		int a = scan.nextInt();
		System.out.print("DIGITE 2� NOTA: ");
		int b = scan.nextInt();
		System.out.print("DIGITE 3� NOTA: ");
		int c = scan.nextInt();
		System.out.print("DIGITE 4� NOTA: ");
		int d = scan.nextInt();
		
		float media = (a+b+c+d)/4;
		
		System.out.println(String.format("MEDIA: %.2f", media));
		scan.close();
		
	}

}
