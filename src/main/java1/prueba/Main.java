package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner tecladoInt = new Scanner(System.in);

		String claveIngresada;
		String opcionMenu;
		int saldo = 2500;

		do {
			System.out.println("Ingrese clave");
			claveIngresada = teclado.nextLine();

			if (claveIngresada.equals("85DB")) {// SI

				do {
					System.out.println("BANCO PICHINCHA, elija una opci�n: ");
					System.out.println("1. Consultar pagos");
					System.out.println("2. Realizar transferencia");
					System.out.println("3. SALIR");
					opcionMenu = teclado.nextLine();

					if (opcionMenu.equals("1")) {
						// Todo lo que me pide la opcion 1
						System.out.println("No tiene ning�n pago pendiente");
						System.out.println();
						
					} else if (opcionMenu.equals("2")) {
						// Todo lo que me pide la opcion 2

						System.out.println("Ingrese cuenta de destino");
						String cuentaDestino = teclado.nextLine();

						System.out.println("Ingrese monto a transferir");
						int montoTransferir = tecladoInt.nextInt();
						saldo = saldo - montoTransferir;
						System.out.println("Su nuevo saldo es: " + "$" + saldo);
						System.out.println();

					}
					// } while (!opcionMenu.equals("1") || !opcionMenu.equals("2"));
				} while (!opcionMenu.equals("3"));
				claveIngresada = "0";

			} else {// NO
				System.out.println("La clave no es la correcta");
				System.out.println();
			}

			// claveIngresada != -1
		} while (!claveIngresada.equals("-1"));
		System.out.println("Gracias por preferirnos");
	}
}