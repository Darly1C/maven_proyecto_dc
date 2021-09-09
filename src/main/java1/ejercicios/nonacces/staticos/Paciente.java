package ejercicios.nonacces.staticos;

public class Paciente {
	// los atributos est�ticos no hace falta SET y GET
	private String nombre;
	private int edad;
	private static String nacionalidad = "ECUATORIANO";
	private static int edadLimite = 65;

	public void registrar(String nombre) {
		System.out.println("Se registra el paciente: " + nombre);

	}

	private static void consultarNacionalidad() {
		System.out.println("");
	}

	public static void consultarNacionalidadStatica() {
		System.out.println("La nacionalidad de:  " + nacionalidad);
	}

	// M�todos SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
