package cl.fsj.infoclub;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		ArrayList <String> marcas = new ArrayList<>();
		marcas.add("fiat");
		marcas.add("skoda");
		marcas.add("audi");
		marcas.add("chevrolet");
		marcas.add("ferrari");
		marcas.add("subaru");
		marcas.add("toyota");
		marcas.add("mitsubishi");
		marcas.add("opel");
		marcas.add("nissan");
		
		System.out.println(marcas);
		System.out.println("*******************");
		
		//Añadimos un ArrayList a uno existente
		ArrayList<String> otrasMarcas = new ArrayList<>();
		
		otrasMarcas.add("Blokbaster");
		otrasMarcas.add("Carrefour");
		otrasMarcas.add("Jetix");
		marcas.addAll(otrasMarcas);
		
		System.out.println(marcas);
		System.out.println("********************");
		
		//Modificamos la linea mal escrita
		marcas.set(10,"Blockbuster");
		
		System.out.println(marcas);
		System.out.println("********************");
		
		//Eliminamos la linea requerida con metodo remove()
		
		marcas.remove(11);
		System.out.println(marcas);
		System.out.println("********************");
		
		//Agregamos marcas a la lista existente hasta ahora
		
		ArrayList<String> posiblesMarcas = new ArrayList<>();
		
		posiblesMarcas.add("Pepsi");
		posiblesMarcas.add("Bilz");
		posiblesMarcas.add("Pap");
		posiblesMarcas.add("Limon Soda");
		marcas.addAll(posiblesMarcas);
		
		System.out.println(marcas);
		System.out.println("********************");
		
		//Contar los elementos del arreglo
		
		System.out.println(marcas.size());
		System.out.println("********************");
		
				
	
	}
}
