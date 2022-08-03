package cl.fsj.infoclub;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Map <String,Integer> golosinas = new TreeMap <> ();
		
		golosinas.put("Chocman",100);
		golosinas.put("Trululu",100);
		golosinas.put("Centella",100);
		golosinas.put("Kilate",50);
		golosinas.put("Miti-miti",30);
		golosinas.put("Traga Traga",150);
		golosinas.put("Tableton",5);
		
		System.out.println(golosinas);
		System.out.println("*************");
		
		Map<String, Integer> filtro = golosinas.entrySet()
		         .stream()
		         .filter(map -> map.getValue()<100) //filtrado por valores
		         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		     System.out.println("Golosinas menores de 100: " + filtro);
		   }
    }
	
	


