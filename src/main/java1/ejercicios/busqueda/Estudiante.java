package ejercicios.busqueda;

public class Estudiante {

	private String nombre;
	private String cedula;

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
