package Guia4;

import java.util.Scanner;

public class Clase08 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		int menu;
		do{
			System.out.println("Ingrese la opción del 1 para sumar primeros 100 numeros pares");
			System.out.println("Ingrese la opción del 2 para escribir un menú");
			System.out.println("Ingrese la opción del 3 para escribir nobmre de mes");
			System.out.println("Ingrese la opción del 0 para salir");
			menu = leer.nextInt();
			
			switch(menu){
		
		
//1- Sume los primeros 100 números pares
					case 1:
				int suma=0;
				for (int i = 0; i<200 ;i++){
					if(i % 2 == 0){
						System.out.println(i);
						suma += i;
					}					
				}
				System.out.println("La suma es: "+suma);	
					break;
		
//2- implemente un menù de opciones numéricas que se repita indefinidamente (usando WHILE y SWITCH)
				case 2:
					int opcion;		
					while(true){
						System.out.println("------------------------");
						System.out.println("Ingrese la opción del 1 a 3");
						opcion = leer.nextInt();
						switch(opcion){
							case 1:
								System.out.println("Ingresó opción 1");
								break;
							case 2:
								System.out.println("Ingresó opción 2");
								break;
							case 3:
								System.out.println("Ingresó opción 3");
								break;
							default:
								System.out.println("Opciòn INCORRECTA");
								break;					
						}
					}	
		//break;
		//3- Usando SWITCH escriba un programa que solicite el mes en formato numérico y devuelva el nombre del mes.
	//   Si el nùmero es incorrecto muestre "ERROR".		
				case 3:	
					int mes;	
					System.out.println("------------------------");
					System.out.println("Ingrese el NÚMERO de MES");
					mes = leer.nextInt();
					switch(mes){
						case 1:
							System.out.println("ENERO");
							break;
						case 2:
							System.out.println("FEBRERO");
							break;
						case 3:
							System.out.println("MARZO");
							break;
						case 4:
							System.out.println("ABRIL");
							break;
						case 5:
							System.out.println("MAYO");
							break;
						case 6:
							System.out.println("JUNIO");
							break;
						case 7:
							System.out.println("JULIO");
							break;
						case 8:
							System.out.println("AGOSTO");
							break;
						case 9:
							System.out.println("SEPTIEMBRE");
							break;
						case 10:
							System.out.println("OCTUBRE");
							break;
						case 11:
							System.out.println("NOVIEMBRE");
							break;
						case 12:
							System.out.println("DICIEMBRE");
							break;
						default:
							System.out.println("Mes incorrecto");
							break;
					}
				break;
			case 0:
				System.out.println("FINALIZAR");
				break;			
			}
		}while(menu !=0);
		
	}

}
