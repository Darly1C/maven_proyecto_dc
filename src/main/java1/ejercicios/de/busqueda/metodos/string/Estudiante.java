package ejercicios.de.busqueda.metodos.string;

public class Estudiante {

	protected String nombre;
	protected String cedula;

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
