package ejercicios.de.busqueda.metodos.string;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecladoInt = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);

		int opcion;

		

		do {
			String[] resultado = new String[5];
			
			System.out.println("***Seleccione una opción***");
			System.out.println("1. Ingresar Estudiante");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. Salir");
			opcion = tecladoInt.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese cédula: ");
				String cedula = tecladoString.nextLine();
				resultado[opcion] = new String(cedula);
			} else {
			}
			if (opcion == 2) {
				System.out.println("Ingrese su cédula: ");
				String cedula2 = "";
				String cedula = cedula2;
				cedula2 = tecladoString.nextLine();
				boolean resultado2 = cedula.equals(cedula2);
				System.out.println("Contiene al Estudiante: " + resultado2);
				System.out.println(cedula + cedula2);
				System.out.println();
			} else {
			}
		} while (opcion != 3);
		System.out.println("Salir");

	}

}
