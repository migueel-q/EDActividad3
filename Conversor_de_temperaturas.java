import java.util.Scanner;
public class Conversor_de_temperaturas {
	public static void main(String[] args) {
	Scanner escaner = new Scanner(System.in);
	System.out.println("\n\tBienvenido al conversor de temperaturas\n");
	System.out.print("Introduce el valor que quieres convertir ");
	float valor = escaner.nextFloat();
	System.out.println("  Introduce 1 para el convertidor de Celsius a Fahrenheit....");
	System.out.println("  Introduce 2 para el convertidor de Fahrenheit a Celsius....");
	System.out.print("\nIntroduce tu valor aqui...   ");
	int resp = escaner.nextInt();
	if (resp == 1) {
		float valor1 = (float) ((valor*(1.8))+32);
		System.out.print("Aqui esta tu conversion.. "+valor1+"°F");
		}
	if (resp == 2) {
			float valor2 = (float) (valor-32);
			float valor3 = (float) (valor2*(5)/9);
			System.out.print("Aqui esta tu conversion.. "+valor3+"°C");
		}
	System.out.println("\n\t¡¡Gracias!!..");
	}
}
