package Guia4;

import java.util.Scanner;

public class _3tres {
	public static void main(String[] args) {
		
//Declaraci�n e inicializaci�n
		String  aula[] = new String[10];
		String opcion;
		String profesor = null;
		Scanner leerstr = new Scanner(System.in);
		Scanner leerint = new Scanner(System.in);
		int  numaula;
		boolean bandera;
		
//Asignaci�n
		for (int i = 0; i < aula.length; i++) {
			aula[i] = "# DISPONIBLE #";
		}		

		do{
			System.out.println("Ingrese su opci�n\n1: Reservar aula\n2: liberar aula\n3: ver listado aulas\n4 Profesor\n5 Aula\n0: SALIR\n----------------");
			opcion = leerstr.nextLine();
			
			switch(opcion){
			case "1":
				do{
					System.out.println("Ingrese n�mero de aula a reservar");
					numaula = leerint.nextInt();	
					System.out.println("Ingrese nombre profesor");
					profesor = leerstr.nextLine();

					if(numaula-1<10){
						bandera =false;
						aula[numaula-1] = profesor;	
					}
					else{
						bandera = true;
						System.err.println("El Aula debe ser menor a 11");
					}
						
					System.out.println("Profesor: "+profesor);
					System.out.println("num aula: "+numaula);
				}while(bandera);
				break;
			case "2":
				System.out.println("Ingrese n�mero de aula a liberar");
				numaula = leerint.nextInt();
				aula[numaula-1] = "# DISPONIBLE #";
				break;
			case "3":
				for (int i = 0; i < aula.length; i++) {
					System.out.println("AULA ["+(i+1)+"]: "+aula[i]);
				}
				break;
			case "4":
				System.out.println("Profesor: "+profesor);
				break;			
			}
		}while(Integer.valueOf(opcion)!=0);
		System.out.println("-EXIT-");
	}
}

/**3) Una escuela cuenta con 10 aulas comenzando con el aula 1 (el aula 0 no existe en la
nomenclatura de la escuela). La misma hay que representarla con un arreglo que al iniciar
la ejecuci�n todos sus elementos deben contener la cadena �# DISPONIBLE #�. El
programa debe mostrar indefinidamente (hasta presionar 0) un men� con las siguientes
opciones:
a. Reservar Aula: en este caso, se pedir� el n�mero de aula, y luego que ingrese el
nombre del profesor que ser� almacenado en la posici�n correspondiente al aula.
b. Liberar Aula: se pedir� el n�mero de aula y el contenido del arreglo en la posici�n
del aula se pisar� con la cadena �# DISPONIBLE #�.
i. Ver aulas: aqu� se mostrar� una lista, como por ejemplo:
AULA [1]: P�rez
AULA [2]: # DISPONIBLE #
AULA [3]: Gonz�lez*/