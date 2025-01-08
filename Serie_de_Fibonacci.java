import java.util.Scanner;
public class Serie_de_Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 1;
		int c=0;
		System.out.println("Introducir numero: ");
		Scanner escaner = new Scanner(System.in);
		int i =0;
		int x = escaner.nextInt();

		while (c<x) {
			System.out.println(c);
			c = a + b; a = b; b = c;
			}
	}
}
