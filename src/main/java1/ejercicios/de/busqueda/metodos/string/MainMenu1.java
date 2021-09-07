package ejercicios.de.busqueda.metodos.string;

import java.util.Scanner;

public class MainMenu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tecladoInt = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		
		int opcion;
		String cedula2 = "";
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Pablo");
		estudiante1.setCedula("15172972");
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Juan");
		estudiante2.setCedula("17297620");
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Daniel");
		estudiante3.setCedula("17401503");
		
		Estudiante estudiante4 = new Estudiante();
		estudiante4.setNombre("Camila");
		estudiante4.setCedula("17267814");
		
		Estudiante estudiante5 = new Estudiante();
		estudiante5.setNombre("Nia");
		estudiante5.setCedula("17135264");
		
		Estudiante[] datos = new Estudiante[5];
		datos[0] = estudiante1;
		datos[1] = estudiante2;
		datos[2] = estudiante3;
		datos[3] = estudiante4;
		datos[4] = estudiante5;		
		
		
		do {
				System.out.println("***Seleccione una opción***");
				System.out.println("1. Ingresar Estudiante");
				System.out.println("2. Buscar Estudiante");
				System.out.println("3. Salir");
				opcion = tecladoInt.nextInt();
				if (opcion == 1) {
					System.out.println("Ingrese cédula: ");
					String cedula = tecladoString.nextLine();
				} else {
				}
				if(opcion == 2) {
					System.out.println("Ingrese cédula: ");
					String cedula = (cedula2);
					cedula2 = tecladoString.nextLine();
					boolean resultado2 = cedula.equals(cedula2);
					System.out.println("Las cadenas son iguales: " + resultado2);
				}

		} while (opcion != 3);

	}

}
