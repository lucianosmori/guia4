package Guia4;

import java.util.*;


public class _4cuatro {

	public static void main(String[] args) {

		Scanner leerint = new Scanner(System.in);
		Scanner leerstr = new Scanner(System.in);
		int cantidad,promedio,total,min,max;
		total = min = max = 0;
		

		System.out.println("Ingrese cantidad de personas");
		cantidad = leerint.nextInt();

		Vector personas = new Vector(cantidad, 1);
		Vector edades = new Vector(cantidad, 1);

		for (int i = 0; i < personas.capacity(); i++) {
			System.out.println("Ingrese el nombre de la persona " + (i + 1));
			personas.add(leerstr.nextLine());
			System.out.println("Ingrese la edad de la persona " + (i + 1));
			edades.add(leerint.nextInt());		
		}

		for (int i = 0; i < personas.capacity(); i++) {
			System.out.println(
					"La persona " + (i + 1) + " se llama " + personas.get(i) + " y tiene " + edades.get(i) + " años");
						
			if (min != 0 && max != 0) {
                if ((int) edades.get(i) > max) {
                    max = (int) edades.get(i);
                }
                if ((int) edades.get(i) < min) {
                    min = (int) edades.get(i);
                }
            } else {
                min = (int) edades.get(i);
                max = (int) edades.get(i);
            }   
		total = total + (int) edades.get(i);					
		}
		promedio = (total/ edades.size());
		System.out.println("El cantidad de personas es: "+edades.size());
		System.out.println("El total es: "+total);
		System.out.println("El promedio es: "+promedio);
		System.out.println("El min es: "+min);
		System.out.println("El max es: "+max);
	}
}

/**
4) Utilizando Java, cree una aplicación que solicite: 
a. Ingresar el parámetro N que será la cantidad de personas. 
b. Luego que solicite un nombre, y la edad por cada persona ingresada y la almacene 
en un arreglo dinámico. 
c. Luego, calcule el promedio de la edad, y muestre un resumen indicando:  
i. Cantidad de personas 
ii. Promedio de edad 
iii. La edad más pequeña del listado, junto a su nombre. 
iv. La edad más grande del listado, junto a su nombre. 
v. Cantidad de personas que tienen edad por debajo del promedio. 
vi. Cantidad de personas que tienen edad por encima del promedio.
*/