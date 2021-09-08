package ejercicios.de.busqueda.metodos.string;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cedulaABuscar = "173265641";

		Estudiante fila[] = new Estudiante[5];

		Estudiante jordan = new Estudiante();// instanciando la clase Estudiante
		// jordan es la instancia de la clase Estudiante
		jordan.setNombre("Jordan");
		jordan.setCedula("12123165");
		System.out.println("¿Cuál es el valor del atributo estático?" + Estudiante.pais);
		System.out.println("¿Cuál es el valor del atributo de instancia?" + jordan.get);

		Estudiante julia = new Estudiante();
		jordan.setNombre("Julia");
		jordan.setCedula("12145665");

		Estudiante diego = new Estudiante();
		jordan.setNombre("Jordan");
		jordan.setCedula("17524466");

		Estudiante stefany = new Estudiante();
		jordan.setNombre("Stefany");
		jordan.setCedula("12123165");

		Estudiante john = new Estudiante();
		jordan.setNombre("John");
		jordan.setCedula("12123165");

		fila[0] = jordan;
		fila[1] = diego;
		fila[2] = stefany;
		fila[3] = john;
		fila[4] = julia;

		for (int i = 0; i < 5; i++) {
			Estudiante estudiante = fila[i];
			String cedula = estudiante.getCedula();
			cedulaABuscar.equals(cedula);
		}

	}

}
