package Guia4;
import java.util.Scanner;

public class _2dos {
	public static void main(String[] args) {
		int numero[];
		numero = new int[3];
		int max = 0;
		int suma = 0;
		int opcion;
		boolean bandera = false;
		int modifnum;

		Scanner leer = new Scanner(System.in);
		do {

			if (bandera == false) {
				for (int i = 0; i < numero.length; i++) {
					System.out.println("Ingrese el " + (i + 1) + "º numero");
					numero[i] = leer.nextInt();
					bandera = true;
				}
			}
			System.out.println("Ingrese la opción del 1 para ingresar numeros del 1 al " + numero.length);
			System.out.println("Ingrese la opción del 2 para listarlo determinar maximoú");
			System.out.println("Ingrese la opción del 3 para  determinar maximoú");
			System.out.println("Ingrese la opción del 4 para calcular promedio");
			System.out.println("Ingrese la opción del 5 para modificar numero");
			System.out.println("\t\tIngrese 0 para salir");

			opcion = leer.nextInt();

			switch (opcion) {
			case 1:
				for (int i = 0; i < numero.length; i++) {
					System.out.println("Ingrese el " + (i + 1) + "º numero");
					numero[i] = leer.nextInt();
				}
				break;

			case 2:
				// listarlo
				for (int i = 0; i < numero.length; i++)
					System.out.println((i + 1) + "º numero " + numero[i]);
				break;

			// Maximo
			case 3:
				max = 0;
				for (int i = 0; i < numero.length; i++)
					if (max == 0)
						max = numero[i];
					else if (numero[i] > max)
						max = numero[i];

				System.out.println("El màximo es: " + max);
				break;

			case 4:
				// promedio
				suma = 0;
				for (int i = 0; i < numero.length; i++)
					suma += numero[i];
				System.out.println("El promedio es: " + (suma / numero.length));
				break;

			case 5:
				System.out.println("\t\tIngrese la posición del número a modificar");
				modifnum = leer.nextInt();
				for (int i = 0; i < numero.length; i++) {
					if (modifnum == i + 1) {
						System.out.println("Ingrese NUEVO valor de número " + (i + 1) + " ( " + numero[i] + " ) ");
						numero[i] = leer.nextInt();
					}
				}
				break;
			}
		} while (opcion != 0);
		System.out.println("Chau");
	}
}
