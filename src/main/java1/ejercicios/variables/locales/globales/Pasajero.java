package ejercicios.variables.locales.globales;

public class Pasajero {

	private String nombre;
	private String apellido;
	private int edad;
	public static String pais = "ECUADOR";
	
	// - Variables
	// dos tipos de variables se clasifican
	// en función a su alcance:

	// Globales: se declaran a nivel de clase, se dividen en dos:
	// Instancia._Son variables que pertenecen a la instancia
	// Estáticas._Pertenecen a una clase

	// Locales: se declaran a nivel de métodos

	// - Constructor
	// - Métodos

	public void reservarVuelo() {
		this.nombre = "Darly";
		this.apellido = "Castillo";
		this.edad = 20;
		String trayecto = "Londres";
		trayecto = "Madrid";
		trayecto = "Amsterdam";
		String categoriaDeVuelo = "Primera Clase";
		categoriaDeVuelo = "Clase Económica";
		categoriaDeVuelo = "Clase Ejecutiva";
	}

}
