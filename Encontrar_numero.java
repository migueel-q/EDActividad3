import java.util.*;

public class Encontrar_Numero {
	public static void main(String[] args) {
		int randNo, inputNo, userAttempt = 1;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		randNo = rand.nextInt(101);
		System.out.println("Introduce un numero del 1 al 100\n");
		do {
			inputNo = scan.nextInt();
			if (inputNo > randNo) {
				System.out.println("Prueba un numero mas bajo!!");
			}
			if (inputNo < randNo) {
				System.out.println("Prueba un numero mas alto!!");
			}
			if (inputNo == randNo) {
				System.out.println("Correcto!!");
				System.out.println("Lo has adivinado en " + userAttempt + "  intentos.");
			}
			userAttempt++;
		} while (inputNo != randNo);
	}
}
