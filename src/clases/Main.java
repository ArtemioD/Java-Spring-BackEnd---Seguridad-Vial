package clases;

import java.util.Scanner;

public class Main {

	private static Scanner entrada;
	private static Auto auto = null;
	private static Moto moto = null;
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] args) {

		start();
	}

	private static void start() {
		String op = "";
		entrada = new Scanner(System.in);

		do {
			System.out.println("*** Seguridad Vial - GCBA *** ");
			System.out.println("Que vehiculo maneja conductor:");
			System.out.println("1 --> Auto");
			System.out.println("2 --> Moto");
			System.out.println("3 --> Salir");

			op = entrada.nextLine();
			
			if (op.equals("1")) {
				opcionAuto();
				conductorInf();
			}
			else if (op.equals("2")) {
				opcionMoto();
				conductorInf();
			}	
			else if(!op.equals("3")) 
				System.out.println(ANSI_RED + "Error, opcion incorrecta." + ANSI_WHITE);
			
		} while (!op.equals("3")); // con opcion 3 termina

		System.out.println("Fin de Programa.");
	}

	private static void opcionMoto() {
		int velocidad = pedirDatos("Por favor ingrece la velocidad de moto..");
		int espejos = pedirDatos("Cantidad de espejos?");
		
		moto = new Moto(velocidad, espejos);
		moto.esSeguro();
	}
	
	private static void opcionAuto() {
		int velocidad = pedirDatos("Por favor ingrece la velocidad de auto..");
		String si = "2";
		
		do {
			if (!(si.equals("1") || si.equals("2"))) 
				System.out.println(ANSI_RED + "Error, opcion incorrecta." + ANSI_WHITE);
			
			System.out.println("Tiene rueda de auxilio?");
			System.out.println("1 --> SI");
			System.out.println("2 --> NO");
			si = entrada.nextLine();
			
		} while (!(si.equals("1") || si.equals("2")));
		
		boolean auxRueda = (si.equals("1")) ? true : false;
		auto = new Auto(velocidad, auxRueda);
		auto.esSeguro();
	}
	
	private static int pedirDatos(String texto) {
		String a;
		int i = 0;
		do {
			if (i > 0) {
				System.out.println(ANSI_RED + "Error, opcion incorrecta." + ANSI_WHITE);
			}
		    System.out.println(texto);
		    a = entrada.nextLine(); //Se lee la entrada como cadena
		    i++;
		} while(!isInteger(a)); //Se sigue pidiendo la entrada si no es entero
		return Integer.parseInt(a);
	}
	
	public static boolean isInteger(String text) {
	    try {
	      Integer.parseInt(text);
	      return true;
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
	
	private static void conductorInf() {
		String si = "2";
		do {
			if (!(si.equals("1") || si.equals("2"))) 
				System.out.println(ANSI_RED + "Error, opcion incorrecta." + ANSI_WHITE);
			
			System.out.println("Conductor tiene registro?");
			System.out.println("1 --> SI");
			System.out.println("2 --> NO");
			si = entrada.nextLine();
			
		} while (!(si.equals("1") || si.equals("2")));

		boolean reg = (si.equals("1")) ? true : false;

		Conductor conductor = new Conductor(auto, moto, reg);
		conductor.esSegiro();
	}

}
