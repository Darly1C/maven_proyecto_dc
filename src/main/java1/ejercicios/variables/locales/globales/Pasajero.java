package ejercicios.variables.locales.globales;

public class Pasajero {

	private String nombre;
	private String apellido;
	private int edad;
	// - Variables
	// dos tipos de variables se clasifican
	// en funci�n a su alcance:

	// Globales: se declaran a nivel de clase, se dividen en dos:
	// Instancia._
	// Est�ticas._

	// Locales: se declaran a nivel de m�todos

	// - Constructor
	// - M�todos

	public void reservarVuelo() {
		this.nombre = "Darly";
		this.apellido = "Castillo";
		this.edad = 20;
		String trayecto = "Londres";
		trayecto = "Madrid";
		trayecto = "Amsterdam";
		String categoriaDeVuelo = "Primera Clase";
		categoriaDeVuelo = "Clase Econ�mica";
		categoriaDeVuelo = "Clase Ejecutiva";
	}

}
