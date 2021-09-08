package ejercicios.variables.locales.globales;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Pasajero jordan = new Pasajero();// instanciando la clase Estudiante
		// jordan es la instancia de la clase Estudiante
		System.out.println("¿Cuál es el valor del atributo estático? " + Pasajero.pais);
		System.out.println("¿Cuál es el valor del atributo estático? " + Pasajero.provincia);
	}

}
