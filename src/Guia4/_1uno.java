package Guia4;

import java.util.Scanner;

public class _1uno {

	public static void main(String[] args) {
		
		int mes;
		
		String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","julio","octubre","septiembre","octubre","noviembre","diciembre"};
		Scanner leer = new Scanner(System.in);		
		
		do{
			System.out.println("-------------------");
			System.out.println("Ingrese el numero de mes");
			System.out.println("De 1 a 12");
			System.out.println("Ingrese 0 para salir");			
			
			mes  = leer.nextInt();
			
			if(mes>0 && mes<13){
				for (int i=0; i<12; i++){
					if(mes == i+1)
						System.out.println(meses[i]);				
				}		
			}
		}while (mes != 0);				
	}
}
