package ejercicios.busqueda;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecladoInt = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);

		int opcion;

		Estudiante fila[] = new Estudiante[5];
//
//		Estudiante estudiante1 = new Estudiante();
//		estudiante1.setCedula(cedula);
//		Estudiante estudiante2 = new Estudiante();
//		estudiante2.setCedula(cedula);
//		Estudiante estudiante3 = new Estudiante();
//		estudiante3.setCedula(cedula);
//		Estudiante estudiante4 = new Estudiante();
//		estudiante3.setCedula(cedula);
//		Estudiante estudiante5 = new Estudiante();
//		estudiante5.setCedula(cedula);
//
//		fila[0] = estudiante1;
//		fila[1] = estudiante2;
//		fila[2] = estudiante3;
//		fila[3] = estudiante4;
//		fila[4] = estudiante5;

		do {

			System.out.println("***Seleccione una opción***");
			System.out.println("1. Ingresar Estudiante");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. Salir");
			opcion = tecladoInt.nextInt();

			if (opcion == 1) {
				for(int repetir = 0; repetir<=4; repetir++) {
				System.out.println("Ingrese cédula: ");
				String cedula = tecladoString.nextLine();
				
				Estudiante estudiante1 = new Estudiante();
				estudiante1.setCedula(cedula);
				Estudiante estudiante2 = new Estudiante();
				estudiante2.setCedula(cedula);
				Estudiante estudiante3 = new Estudiante();
				estudiante3.setCedula(cedula);
				Estudiante estudiante4 = new Estudiante();
				estudiante3.setCedula(cedula);
				Estudiante estudiante5 = new Estudiante();
				estudiante5.setCedula(cedula);
		
				fila[0] = estudiante1;
				fila[1] = estudiante2;
				fila[2] = estudiante3;
				fila[3] = estudiante4;
				fila[4] = estudiante5;
				}
				
			} else {
			}
			
			if (opcion == 2) {
				System.out.println("Ingrese su cédula a buscar: ");
				String cedulaABuscar = tecladoString.nextLine();
				boolean resultado = false;
				for (int i = 0; i < 5; i++) {
					Estudiante estudiante = fila[i];
					String cedula = estudiante.getCedula();
					boolean resultadoLocal = cedulaABuscar.equals(cedula);
					if(resultadoLocal==true) {
						resultado=true;
					}
				}
				if (resultado == true) {
					System.out.println("Si");
				}else {
					System.out.println("No");
				}

			} else {
			}

		} while (opcion != 3);
		System.out.println("Salir");

	}

}
