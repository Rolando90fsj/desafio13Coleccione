package cl.fsj.infoclub;

import java.util.*;

public class Ejercicio2 {


	public static void main(String[] args) {
		
		Set<String> invitados = new TreeSet<>();
		
		 invitados.add("Daniel");
		 invitados.add("Paola");
		 invitados.add("Facundo");
		 invitados.add("Pedro");
		 invitados.add("Jacinta");
		 invitados.add("Florencia");
		 invitados.add("Juan Pablo");
		 
		 System.out.println(invitados);
		 System.out.println("*******************************");
		 
		 Set<String> posiblesInvitados = new TreeSet<>();
		 
		 posiblesInvitados.add("Jorge");
		 posiblesInvitados.add("Francisco");
		 posiblesInvitados.add("Marcos");
		 invitados.addAll(posiblesInvitados);
		 System.out.println(invitados);
		 System.out.println("*******************************");
		 
		 invitados.remove("Jorge");
		 System.out.println(invitados);
		 System.out.println("*******************************");
	}
	
}
