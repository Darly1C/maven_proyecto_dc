package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina {

	@Override
// No se puede sobreescribir el método final de la clase padre
	public void realizarPracticas() {
		System.out.println("Realiza 100 de prácticas");
	}

	protected void realizarPasantias() {
		System.out.println("Realiza 200 pasantías");
	}

}
