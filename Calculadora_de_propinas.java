import java.util.Scanner;
public class Calculadora_de_propinas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\tBienvenido a la calculadora de propinas!!");
		System.out.println("\nIntroduce la cantidad total de la factura... :");int factura = scan.nextInt();
		System.out.println("Cuanta propina te gustaria dar? ");int propina = scan.nextInt();
		System.out.println("Cuantas personas pagaran la factura? ");int personas = scan.nextInt();
		int total = factura + propina;
		int per_persona = total/personas;
		System.out.println("Total de la factura : ₹"+total);
		System.out.println("Cada uno debe dar : ₹"+per_persona);
	}
}
