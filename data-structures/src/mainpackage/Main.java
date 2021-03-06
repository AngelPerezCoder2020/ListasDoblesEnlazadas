package mainpackage;
import com.umg.data.structures.LinkedList.DoublyLinkedList;
import com.umg.data.structures.LinkedList.DoublyLinkedList.Node;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		DoublyLinkedList<String> Lista = new DoublyLinkedList<>();
		String opc = "";
		
		while(false==opc.equals("0")) {
			ClearConsole();
			System.out.println(" \nLista Doblemente Enlazada \n\n1. Insertar al Inicio \n2. Insertar al Final \n3. Recorrer Hacia Adelante"
					+ "\n4. Recorrer hacia atras \n5. Mostrar tama?o de la lista \n6. Mostrar si la lista esta vacia \n7. Buscar elemento por valor \n8. Buscar elemento por indice"
					+ " \n9. Borrar un Elemento \n0. SALIR DEL PROGRAMA");
			opc=ent.nextLine();
			switch(opc) {
			case "1":{
				System.out.println("Escriba el mensaje del nuevo nodo");
				Lista.insertAtHead(ent.nextLine());
				break;
			}
			case "2":{
				System.out.println("Escriba el mensaje del nuevo nodo");
				Lista.insertAtTail(ent.nextLine());
				break;
			}
			case "3":{
				Lista.traverseForward();
				ent.nextLine();
				break;
			}
			case "4":{
				Lista.traverseBackward();
				ent.nextLine();
				break;
			}
			case "5":{
				System.out.println("El tama?o de la Lista es: "+Lista.size());
				ent.nextLine();
				break;
			}
			case "6":{
				if(Lista.isEmpty()) {
					System.out.println("La Lista est? Vac?a");
				}else {
					System.out.println("La Lista no est? vacio, contiene: "+Lista.size()+" elementos.");
				}
				ent.nextLine();
				break;
			}
			case "7":{
				System.out.println(" \nIngrese el valor del Elemento que desea buscar en la lista");
				DoublyLinkedList<String>.Node<String> respuesta = Lista.searchByValue(ent.nextLine());
				if(respuesta==null) {
					System.out.println(" \nNo se ah encontrado ningun item con el valor que usted busca");
				}else {
					System.out.println(" \nEl elemento: "+respuesta.toString()+" fu? encontrado dentro de la lista");
				}
				ent.nextLine();
				break;
			}
			case "8":{
				System.out.println(" \nIngrese el indice del Elemento que desea buscar en la lista");
				DoublyLinkedList<String>.Node<String> respuesta = Lista.searchByIndex(ent.nextInt());
				ent.nextLine();
				if(respuesta==null) {
					System.out.println("No se ah encontrado ningun item en el indice ingresado");
				}else {
					System.out.println("El elemento: "+respuesta.toString()+" fu? encontrado en el index que se ingres?");
				}
				ent.nextLine();
				break;
			}
			case "9":{
				System.out.println(" \nIngrese el indice del elemento que desea borrar");
				int indice = ent.nextInt();
				ent.nextLine();
				if(indice==0) {
					Lista.deleteFromHead();
				}else if(indice==Lista.size()-1) {
					Lista.deleteFromTail();
				}else {
					Lista.deleteFromPosition(indice);
				}
				ent.nextLine();
				break;
			}
			case "0":{
				System.out.println(" \nADIOSSS ;)");
				break;
			}
			default:{
				System.out.println("Esa no es una opci?n, duh...");
				ent.nextLine();
			}
			}
		}		
	}
	public static void ClearConsole() {
		  try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	}
}