package Java;
import java.util.Scanner;
public class HorasTrabalhoMes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" --- HORAS TRABALHADAS --- \n");
		System.out.println("Digite o valor Trabalho/Hora: R$ ");
		float valor = scan.nextFloat();
		System.out.println("Digite o n�mero de horas trabalhadas/m�s: ");
		float horas = scan.nextFloat();
		
		float total = valor*horas;
		
		System.out.println(String.format("Total Sal�rio/M�s: R$ %.2f", total));
		
		
		scan.close();
	}

}
