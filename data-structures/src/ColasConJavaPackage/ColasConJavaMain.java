package ColasConJavaPackage;
import com.umg.data.structures.Queue.ArrayBasedQueue;
import mainpackage.Main;
import com.umg.data.structures.Queue.LinkedListBasedQueue;
import java.util.Scanner;

public class ColasConJavaMain {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String opc = "";
		while(false==opc.equals("0")) {
			Main.ClearConsole();
			System.out.println("COLAS by ?ngel P?rez \n\nComo deseas manejar las Colas? \n1. Basadas en Arrays \n2. Basadas en Listas Enlazadas \n0. SALIR DEL PROGRAMA");
			opc = ent.nextLine();
			switch(opc) {
			case "1":{
				ArrayBasedQueue ColaArray = new ArrayBasedQueue(10);
				while(false==opc.equals("5")) {
					Main.ClearConsole();
					System.out.println(" \n\nUsted est? utilizando las colas basadas en Arrays \nSu Lista tiene un espacio en memoria de 10 unidades "
							+ " \nQue deseas hacer con ella? \n\n1. Encolar \n2. Desencolar \n3. Obtener Cima \n4. Ver Tama?o \n5. REGRESAR");
					opc = ent.nextLine();
					switch(opc) {
					case "1":{
						System.out.println(" \nIngrese el elemento que desea Encolar: ");
						ColaArray.enqueue(ent.nextLine());
						break;
					}
					case "2":{
						System.out.println(" \nDesencole Realizado con Exito del elemento: "+ColaArray.dequeue());
						ent.nextLine();
						break;
					}
					case "3":{
						System.out.println(" \nEl elemento que se encuentra primero en la cola es: "+ColaArray.peek());
						ent.nextLine();
						break;
					}
					case "4":{
						System.out.println("El Tama?o de la Cola es: "+ColaArray.size());
						ent.nextLine();
						break;
					}
					case "5":{
						break;
					}
					default:{
						System.out.println(" \nEsa no es una opci?n :)");
						ent.nextLine();
						break;
					}
					}
				}
				break;	
			}
			case "2":{
				LinkedListBasedQueue ColaLista = new LinkedListBasedQueue();
				while(false==opc.equals("5")) {
					Main.ClearConsole();
					System.out.println(" \n\nUsted est? utilizando las colas basadas en Listas Enlazadas \nSu Lista cuenta con almacenamiento Dinamico en memoria "
							+ " \nQue deseas hacer con ella? \n\n1. Encolar \n2. Desencolar \n3. Obtener Cima \n4. Ver Tama?o \n5. REGRESAR");
					opc = ent.nextLine();
					switch(opc) {
					case "1":{
						System.out.println(" \nIngrese el elemento que desea Encolar: ");
						ColaLista.enqueue(ent.nextLine());
						break;
					}
					case "2":{
						System.out.println(" \nDesencole Realizado con Exito del elemento: "+ColaLista.dequeue());
						ent.nextLine();
						break;
					}
					case "3":{
						System.out.println(" \nEl elemento que se encuentra primero en la cola es: "+ColaLista.peek());
						ent.nextLine();
						break;
					}
					case "4":{
						System.out.println("El Tama?o de la Cola es: "+ColaLista.size());
						ent.nextLine();
						break;
					}
					case "5":{
						break;
					}
					default:{
						System.out.println(" \nEsa no es una opci?n :)");
						ent.nextLine();
						break;
					}
					}
					}
				break;	
			}
			case "0":{
				System.out.println(" \nADIOSS ;)");
				ent.nextLine();
				break;
			}
			default:{
				System.out.println(" \nEsa no es una opci?n :)");
				ent.nextLine();
				break;
			}
			}
		}
	}
}