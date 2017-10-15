package Guia4;
//Coded by Pocho
import java.util.Scanner;

public class Clase07GuiaN2b {

	public static void main(String[] args) {
		
		int opcion;
		Scanner leer = new Scanner(System.in); 		
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("-------------------");
			System.out.println("SELECCIONE OPCIÓN: ");
			System.out.println("1: Obtener nota");
			System.out.println("2: Obtener precio");
			System.out.println("3: Obtener promedio");
			System.out.println("4: Obtener Fibonacci");
			System.out.println("5: Obtener Menu Cajero-PENDIENTE");
			System.out.println("6: Convertir °C en °F");
			System.out.println("7: Ingresar X Y para cumplir (x + y) <= 50 ");
			System.out.println("8: Obtener los chars del 33 al 165");
			System.out.println("9: [BONUS TRACK] Obtener número Par con ? : ");
			System.out.println("0: SALIR");
			
			opcion = leer.nextInt();
		switch (opcion){
		    case 1:	
		    	 System.out.println("Ingrese su nota");
		    	 int  nota;
		         nota  = leer.nextInt();
		 		if (nota<4){
		 			System.out.println("LIBRE");
		 		}else if(nota>=4){//Coded by Pocho
		 				if(nota>=7){
		 					System.out.println("PROMOCIONADO");
		 				}else{
		 					System.out.println("REGULAR");
		 				}					
		 		}		
		 		break;
		    case 2:	
		    	double precio = 0;
		    	while(precio >= 0){
		        	System.out.println("Ingrese precio");
		        	System.out.println("Negativo para SALIR");
		            precio  = leer.nextInt();
		        	if(precio>=0 && precio<5){
		    			precio = precio + 1*precio;
		    		}else{//Coded by Pocho
		    			if(precio >=5 && precio <= 25){
		    				precio = precio + 0.75 * precio;
		    			}else{
		    				if(precio >=26 && precio <= 100){
		    					precio = precio + 0.50 * precio;
		    				}else{
		    					if(precio >100){
		    						precio = precio + 0.35 * precio;
		    					}
		    				}
		    			}    		
		    		}
		        	if (precio >=0)
		        		System.out.println("El precio es: "+precio);
		        	else
		        		System.out.println("FINALIZADO");
		        }		
		    	break;		
		
		    case 3:	
		    	int cantNum;
				int min = 0;
				int max = 0;
				int total=0;
				int promedio;
				
				System.out.println("Ingrese cantidad de números a promediar");
				cantNum  = leer.nextInt();
				int[] num = new int[cantNum];
				for (int i=0; i< cantNum; i++){
					System.out.println("Ingrese el "+(i+1)+"º número");
					num[i]  = leer.nextInt();//Coded by Pocho
								
		           if (min != 0 && max != 0) {
		                if (num[i] > max) {
		                    max = num[i];
		                }
		                if (num[i] < min) {
		                    min = num[i];
		                }
		            } else {
		                min = num[i];
		                max = num[i];
		            }   
		           total = total + num[i];
				}
				promedio = total/cantNum;
				System.out.println("El promedio es: "+promedio);
				System.out.println("El mayor es: "+max);
				System.out.println("El menor es: "+min);	
				break;
		
		    case 4:	
//Con arreglos	
//		    	int cantFibonacci;		   
//		    	System.out.println("Ingrese cantidad de números de sucesión de Fibonacci ");
//		    	cantFibonacci  = leer.nextInt();
//		    	int[] fibonacci = new int[cantFibonacci+2];
//		    	fibonacci[0] = 0;
//		    	fibonacci[1] = 1;				    	
//		    	if (cantFibonacci>1){
//		    			System.out.print(fibonacci[0]+" - "+fibonacci[1]+" - ");
//		    			for(int i=2; i<(cantFibonacci); i++){
//		    				fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];	   //return fibonacci(n-1) + fibonacci(n-2);  //función recursiva	    				
//		    				System.out.print(fibonacci[i]+" - ");	   			    				
//		    			}		    	
//		    	    }
//		    	    else if (cantFibonacci==1) {  // caso base
//		    	    	System.out.println("El menor es: "+fibonacci[1] );			    	    }
//		    	    else if (cantFibonacci==0){  // caso base
//		    	    	System.out.println("El menor es: "+fibonacci[0] );			    	    }
//		    	    else{ //error
//		    	        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
//		    	    }		  
//sin arreglos
		    	int fibonacci;
		    	int cantFibonacci;		   
		    	System.out.println("Ingrese cantidad de números de sucesión de Fibonacci ");
		    	cantFibonacci  = leer.nextInt();
		    	int fibo1 = 0;
		    	int fibo2 = 1;				    	
		    	if (cantFibonacci>2){
		    			System.out.print(fibo1+" - "+fibo2+" - ");
		    			for(int i=3; i<=cantFibonacci; i++){
		    				fibonacci = fibo1 + fibo2;	   //return fibonacci(n-1) + fibonacci(n-2);  //función recursiva	    				
		    				System.out.print(fibonacci+" - ");	
		    				fibo2 = fibo2 + fibo1;
		    				fibo1 = fibo2 - fibo1;
		    			}		    	
		    	    }
		    	    else if (cantFibonacci==1) {  // caso base
		    	    	System.out.println("El menor es: "+fibo2 );			    	    }
		    	    else if (cantFibonacci==0){  // caso base
		    	    	System.out.println("El menor es: "+fibo1 );			    	    }
		    	    else{ //error//Coded by Pocho
		    	        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
		    	    }		    		
		    	break;
		
		    case 5:	
		    	int option;	
		    	do{		 
		    		System.out.println("(1) Extracciones");
		    		System.out.println("(2) Ver Saldo");
		    		System.out.println("(3) Depositar");
		    		System.out.println("(4) Transferencias");
		    		System.out.println("(0) SALIR");
					option = leer.nextInt();
					switch(option){
						case 0:
							System.out.println("----\rFINALIZAR");
							break;
						case 1:
							System.out.println("Extracciones: Seleccionar la cantidad de efectivo a extraer");
							break;
						case 2://Coded by Pocho
							System.out.println("Ver Saldo: Visualiza el saldo disponible.");
							break;
						case 3:
							System.out.println("Depositar: Ingresar dinero al cajero y acreditarlo al saldo.");
							break;
						case 4:
							System.out.println("Transferencias: Selecciona monto y destino de los fondos a transferir.");
							break;
						default:
							System.out.println("Opciòn INCORRECTA");						
					}	
		    	}while (option != 0);
		    	break;	
		    case 6:  // F = 32 + (9 * C / 5)
		    	double c,f;
		    	System.out.println("Ingrese grados °C a convertir en °F");
		    	c = leer.nextInt();
		    	f = (c * 9) /5 + 32;
		    	System.out.println(c+"°C = "+f+"°F");		    	
				break; //Coded by Pocho
		    case 7:
		    	double x,y;
		    	System.out.println("Para determinar si (con x<10) x*2 + y+1 es menor o igual a 50");
		    	System.out.println("Ingrese X");
		    	x = leer.nextInt();
		    	System.out.println("Ingrese Y");
		    	y = leer.nextInt();
		    	if(x<10){
		    		y += 1;
		    		x *= 2;
		    		System.out.println("x + y = "+(x + y));
		    		if((x + y) <=50){
		    			System.out.println("X = "+x);
		    			System.out.println("Y = "+y);
		    		}
		    	}
				break;
		    case 8:  // muestre los chars (ASCII) del 33 al 165
		    	char caracter;
		    	for (int i=33; i<=165; i++){
		    		caracter = (char)i;
		    		System.out.println("El char de "+i+" es: "+caracter);
		    	}
				break;
		    case 9:
		    	int numpar;
				System.out.println("Ingrese un número. Para saber si es PAR");
				numpar = leer.nextInt();
				System.out.println((numpar % 2) == 0 ? "Número par" : "Número impar");
				break;
		default: 
			System.out.println("Opción INCORRECTA");
			break;		
		}  
	}while (opcion != 0);
  }
}
