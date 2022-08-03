package cl.fsj.infoclub;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Queue <String> juegos = new LinkedList<>();
		
		juegos.add("Tombo");
		juegos.add("Congelado");
		juegos.add("Quemaditas");
		juegos.add("Cachipun");
		juegos.add("Pillarse");
		
		System.out.println(juegos);
		
		System.out.println("La cantidad de juegos son: "+juegos.size());
		System.out.println("*************");
	}
	
}
