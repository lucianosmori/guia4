package Guia4;

import java.util.Scanner;

public class _3tres {
	public static void main(String[] args) {
		
//Declaración e inicialización
		String  aula[] = new String[10];
		String opcion;
		String profesor = null;
		Scanner leerstr = new Scanner(System.in);
		Scanner leerint = new Scanner(System.in);
		int  numaula;
		boolean bandera;
		
//Asignación
		for (int i = 0; i < aula.length; i++) {
			aula[i] = "# DISPONIBLE #";
		}		

		do{
			System.out.println("Ingrese su opción\n1: Reservar aula\n2: liberar aula\n3: ver listado aulas\n4 Profesor\n5 Aula\n0: SALIR\n----------------");
			opcion = leerstr.nextLine();
			
			switch(opcion){
			case "1":
				do{
					System.out.println("Ingrese número de aula a reservar");
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
				System.out.println("Ingrese número de aula a liberar");
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
la ejecución todos sus elementos deben contener la cadena “# DISPONIBLE #”. El
programa debe mostrar indefinidamente (hasta presionar 0) un menú con las siguientes
opciones:
a. Reservar Aula: en este caso, se pedirá el número de aula, y luego que ingrese el
nombre del profesor que será almacenado en la posición correspondiente al aula.
b. Liberar Aula: se pedirá el número de aula y el contenido del arreglo en la posición
del aula se pisará con la cadena “# DISPONIBLE #”.
i. Ver aulas: aquí se mostrará una lista, como por ejemplo:
AULA [1]: Pérez
AULA [2]: # DISPONIBLE #
AULA [3]: González*/