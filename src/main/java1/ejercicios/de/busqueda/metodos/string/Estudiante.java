package ejercicios.de.busqueda.metodos.string;

public class Estudiante {

	private String nombre;
	private String cedula;
	public static String pais = "ECUADOR";

	// M�todo SET Y GET

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", cedula=" + cedula + "]";
	}

}
